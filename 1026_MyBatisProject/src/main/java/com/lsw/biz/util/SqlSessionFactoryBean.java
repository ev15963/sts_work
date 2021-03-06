package com.lsw.biz.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
	private static SqlSessionFactory sessionFactory = null;
	static {
		if(sessionFactory == null) {
			//src/ 설정파일 읽기
			try {
				if (sessionFactory == null) {
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
				}
			} catch (Exception e) {
				System.out.println("SqlSessionFactoryBean err"+e.getMessage());
				System.out.println("sessionFactory : "+sessionFactory);
			}
		}
	}
	
	//BoardDAO() 클래스의 생성자에 의해 호출
	public static SqlSession getSqlSessionInstance() {
		return sessionFactory.openSession();
	}
}
