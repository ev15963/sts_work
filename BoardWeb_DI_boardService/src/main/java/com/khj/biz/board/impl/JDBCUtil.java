package com.khj.biz.board.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection getConnection(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="lsw";
			String pw="1234";
			return DriverManager.getConnection(url, id, pw);
		
			
		} catch (ClassNotFoundException e) {
			System.err.println("Connection ERR "+e);
		} catch (SQLException e) {
			System.err.println("getConnection ERR "+e);
		}
		return null;
		
		
	}
	
	public static void close(PreparedStatement stmt, Connection conn){
		if(stmt != null){
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch (SQLException e) {
				System.err.println("close stmt, conn ERR "+e);
			}finally {
				stmt=null;
			}
			
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn){
		if(rs!=null){
			try {
				if(!rs.isClosed()) rs.close();
			} catch (SQLException e) {
				System.err.println("close rs ERR "+e);
			}finally{
				rs=null;
			}
		}
		
		if(stmt !=null){
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch (SQLException e) {
				System.err.println("close stmt ERR "+e);
			}finally{
				stmt=null;
			}
			
		}
		
		if(conn!=null){
			try {
				if(!conn.isClosed()) conn.close();
			} catch (SQLException e) {
				System.err.println("close conn ERR" + e);
			}finally{
				conn=null;
			}
		}
	}
	

}
