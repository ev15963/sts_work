package com.lsw.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lsw.biz.user.UserVO;

//DAO(Data Access Object
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL 명령어들
	private final String USER_GET = "select * from users where id=? and password=?";

	public UserVO getUser(UserVO vo) {
		UserVO user = null;

		System.out.println(">>>>> JDBC getUser() done");

		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs = stmt.executeQuery();
			if (rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (SQLException e) {
			System.err.println("getUser() ERR " + e);
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
		return user;
	}

}
