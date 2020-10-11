package com.lsw.biz.user.impl;

import java.sql.*;

import com.lsw.biz.board.impl.JDBCUtil;
import com.lsw.biz.user.UserVO;

public class UserDAO {
		//JDBC ���� ����
		private Connection conn = null;
		private PreparedStatement stmt = null;
		private ResultSet rs = null;
		
		//SQL ��ɾ��
		private final String USER_GET = "select * from users where id=? and password=?";
		
		//CRUD ����� �޼ҵ� ����
		//ȸ�� ���
		public UserVO getUser(UserVO vo) {
			UserVO user=null;
			
			conn = JDBCUtil.getConnection();
			try {
				stmt = conn.prepareStatement(USER_GET);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getPassword());
				rs = stmt.executeQuery();
				if (rs.next()) {
					user=new UserVO();
					user.setId(rs.getString("ID"));
					user.setName(rs.getString("PASSWORD"));
					user.setPassword(rs.getString("NAME"));
					user.setRole(rs.getString("ROLE"));
				}
			} catch (SQLException e) {
				System.out.println("getUser err : "+e.getMessage());
			} finally {
				JDBCUtil.close(rs, stmt, conn);
			}
			
			return user;
		}
}
