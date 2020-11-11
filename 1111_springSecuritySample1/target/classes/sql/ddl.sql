계정 생성

SQL>
SQL> conn system/1234
Connected.
SQL> create user spring identified by 1234;

User created.

SQL> conn spring/1234;
ERROR:
ORA-01045: user SPRING lacks CREATE SESSION privilege; logon denied


Warning: You are no longer connected to ORACLE.
SQL> conn spring/1234
ERROR:
ORA-01045: user SPRING lacks CREATE SESSION privilege; logon denied


SQL> grant connect, resource, dba to spring;
SP2-0640: Not connected
SQL> conn system/1234;
Connected.
SQL> grant connect, resource, dba to spring;

Grant succeeded.

SQL> conn spring/1234
Connected.

------------------------------------

CREATE  TABLE users (
  username VARCHAR(45) NOT NULL primary key,
  password VARCHAR(60) NOT NULL,
  enabled number(1) DEFAULT 1
 );

CREATE TABLE user_roles (
  user_role_id number(11) NOT NULL,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  CONSTRAINT fk_username FOREIGN KEY (username) 
     REFERENCES users (username)
);
 
CREATE SEQUENCE user_roles_seq
	start with 1
	increment by 1
	maxvalue 99999
    nocycle; 

 -- remember-me 항목(csrf token) 사용시 저장 선택적 생성
CREATE TABLE persistent_logins (
   username varchar(64) not null, 
   series varchar(64) primary key, 
   token varchar(64) not null, 
   last_used timestamp not null
);  
