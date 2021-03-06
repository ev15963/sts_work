package com.lsw.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lsw.biz.board.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO> {

	public BoardRowMapper() {

	}

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();

		board.setSeq(rs.getInt("seq"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		board.setContent(rs.getString("content"));
		board.setRegDate(rs.getDate("writer"));
		board.setCnt(rs.getInt("writer"));
		return board;
	}
}
