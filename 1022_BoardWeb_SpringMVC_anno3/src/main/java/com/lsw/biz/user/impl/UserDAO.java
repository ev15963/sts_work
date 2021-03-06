package com.lsw.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.lsw.biz.user.UserVO;

//DAO(Data Access Object
@Repository("userDAO")
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL 명령어들
	private final String USER_GET = "select * from users where id=? and password=?";

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserVO getUser(UserVO vo) {
		UserVO user = null;

		System.out.println(">>>>> JDBC getUser() done");

		
		try {
			this.conn = JDBCUtil.getConnection();
			this.stmt = this.conn.prepareStatement(USER_GET);
			this.stmt.setString(1, vo.getId());
			this.stmt.setString(2, vo.getPassword());
			this.rs = this.stmt.executeQuery();
			if (this.rs.next()) {
				user = new UserVO();
				user.setId(this.rs.getString("ID"));
				user.setPassword(this.rs.getString("PASSWORD"));
				user.setName(this.rs.getString("NAME"));
				user.setRole(this.rs.getString("ROLE"));
			}
		} catch (SQLException e) {
			System.err.println("getUser() ERR " + e);
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
		return user;
	}

}
