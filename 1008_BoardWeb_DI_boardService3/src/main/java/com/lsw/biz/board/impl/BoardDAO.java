package com.lsw.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lsw.biz.board.BoardVO;

//DAO(Data Access Object
@Repository("boardDAO")
public class BoardDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL ���ɾ��
	private final String BOARD_INSERT = "insert into board_spring (seq, title, writer, content) values"
														+ " ((select nvl(max(seq), 0)+1 from board_spring) , ?, ?, ?)";
	private final String BOARD_UPDATE = "update board_spring set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board_spring where seq=?";
	private final String BOARD_GET = "select * from board_spring where seq=?";
	private final String BOARD_LIST = "select * from board_spring order by seq desc";

	// CRUD ����� �޼ҵ� ����
	// �۵��
	public void insertBoard(BoardVO vo) {
		System.out.println("==> JDBC�� insertBoard() ��� ó��");

		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertBoard err" + e.getMessage());
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
	}

	// �ۼ���
	public void updateBoard(BoardVO vo) {
		System.out.println("==> JDBC�� updateBoard() ��� ó��");

		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("updateBoard err" + e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �ۻ���
	public void deleteBoard(BoardVO vo) {
		System.out.println("==> JDBC�� deleteBoard() ��� ó��");

		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("deleteBoard err" + e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �ۻ���ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("==> JDBC�� getBoard() ��� ó��");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			stmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		} catch (Exception e) {
			System.out.println("getBoard err" + e.getMessage());
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return board;
	}

	// �۸����ȸ
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("==> JDBC�� getBoardList() ��� ó��");

		List<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		} catch (Exception e) {
			System.out.println("getBoardList err" + e.getMessage());
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		

		return boardList;
	}
}