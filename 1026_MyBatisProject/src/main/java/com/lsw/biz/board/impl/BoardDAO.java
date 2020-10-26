package com.lsw.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}
	public void updateBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}
	public void deleteBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.deteleBoard", vo);
		mybatis.commit();
	}
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}
