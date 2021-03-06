package com.lsw.biz.board.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 연습용 코드
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			return DriverManager.getConnection(url, "lsw", "1234");

		} catch (Exception e) {
			System.out.println("conn err" + e.getMessage());
		}
		return null;
	}

	public static void close(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) {
					stmt.close();
				}
			} catch (Exception e) {
				System.out.println("stmt err" + e.getMessage());
			} finally {
				stmt = null;
			}
		}

		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				System.out.println("conn err" + e.getMessage());
			} finally {
				conn = null;
			}
		}

	}

	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				if (!rs.isClosed())
					rs.close();
			} catch (Exception e) {
				System.out.println("rs err" + e.getMessage());
			} finally {
				rs = null;
			}
		}

		if (stmt != null) {
			try {
				if (!stmt.isClosed())
					stmt.close();
			} catch (Exception e) {
				System.out.println("stmt err" + e.getMessage());
			} finally {
				stmt = null;
			}
		}

		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (Exception e) {
				System.out.println("conn err" + e.getMessage());
			} finally {
				conn = null;
			}
		}
	}

}
