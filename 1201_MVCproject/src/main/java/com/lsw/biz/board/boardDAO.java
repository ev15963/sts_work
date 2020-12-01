package com.lsw.biz.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class boardDAO {

	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public List<boardVO> selectDataAll() {
		
		SqlSession sqlSession = factory.openSession();
		List<boardVO> list = null;
		
		SqlMapperInter inter = (SqlMapperInter) sqlSession.getMapper(SqlMapperInter.class);
		
		list = inter.selectDataAll();
		
		
		
	}
}
