package com.freeflux.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.freeflux.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// SQL 명령어 상수 선언
	private final String BOARD_INSERT = "insert into board_spring (seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board_spring), ?, ?, ?)";
	private final String BOARD_UPDATE = "update board_spring set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board_spring where seq=?";
	private final String BOARD_GET = "select * from board_spring where seq=?";
	private final String BOARD_LIST = "select * from board_spring order by seq desc";

	// Transaction 테스트를 위한 SQL
	private final String BOARD_INSERT_TRANSACTION = "insert into board_spring (seq, title, writer, content) values (?, ?, ?, ?)";
	
	public BoardDAOSpring() {
	}
	
	/** CRUD 기능 메서드 구현 **/
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBaord() 기능 처리 : " + vo.toString());

		jdbcTemplate.update(BOARD_INSERT_TRANSACTION, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
	} // insertBoard(BoardVO vo) END

	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");

		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	} // updateBoard(BoardVO vo) END

	
	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");

		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	} // deleteBoard(BoardVO vo) END


	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		
		Object[] args={vo.getSeq()};
		
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	} // getBoard(BoardVO vo) END

	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	} // getBoardList(BoardVO vo) END
}

/**
 * Transaction 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.freeflux.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// SQL 명령어 상수 선언
	private final String BOARD_INSERT = "insert into board_spring (seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board_spring), ?, ?, ?)";
	private final String BOARD_UPDATE = "update board_spring set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board_spring where seq=?";
	private final String BOARD_GET = "select * from board_spring where seq=?";
	private final String BOARD_LIST = "select * from board_spring order by seq desc";

	// Transaction 테스트를 위한 SQL
	private final String BOARD_INSERT_TRANSACTION = "insert into board_spring (seq, title, writer, content) values (?, ?, ?, ?)";
	
	public BoardDAOSpring() {
	}
	
	// CRUD 기능 메서드 구현 //
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBaord() 기능 처리 : " + vo.toString());

		jdbcTemplate.update(BOARD_INSERT_TRANSACTION, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
	} // insertBoard(BoardVO vo) END

	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");

		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	} // updateBoard(BoardVO vo) END

	
	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");

		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	} // deleteBoard(BoardVO vo) END


	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		
		Object[] args={vo.getSeq()};
		
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	} // getBoard(BoardVO vo) END

	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	} // getBoardList(BoardVO vo) END
}

**/


/**
 * JdbcTemplate

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.freeflux.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// SQL 명령어 상수 선언
	private final String BOARD_INSERT = "insert into board_spring (seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board_spring), ?, ?, ?)";
	private final String BOARD_UPDATE = "update board_spring set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board_spring where seq=?";
	private final String BOARD_GET = "select * from board_spring where seq=?";
	private final String BOARD_LIST = "select * from board_spring order by seq desc";

	public BoardDAOSpring() {
	}
	
	// CRUD 기능 메서드 구현 //
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBaord() 기능 처리 : " + vo.toString());

		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	} // insertBoard(BoardVO vo) END

	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");

		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	} // updateBoard(BoardVO vo) END

	
	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");

		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	} // deleteBoard(BoardVO vo) END


	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		
		Object[] args={vo.getSeq()};
		
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	} // getBoard(BoardVO vo) END

	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	} // getBoardList(BoardVO vo) END
}
**/


/**
 * JdbcDaoSupport 상속
 
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.freeflux.biz.board.BoardVO;

@Repository
public class BoardDAOSpring extends JdbcDaoSupport {

	// SQL 명령어 상수 선언
	private final String BOARD_INSERT = "insert into board_spring (seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board_spring), ?, ?, ?)";
	private final String BOARD_UPDATE = "update board_spring set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board_spring where seq=?";
	private final String BOARD_GET = "select * from board_spring where seq=?";
	private final String BOARD_LIST = "select * from board_spring order by seq desc";

	public BoardDAOSpring() {
	}

	@Autowired
	public void setSuperDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}

	
	// CRUD 기능 메서드 구현 //
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBaord() 기능 처리 : " + vo.toString());

		getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
	} // insertBoard(BoardVO vo) END

	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");

		getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	} // updateBoard(BoardVO vo) END

	
	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");

		getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
	} // deleteBoard(BoardVO vo) END


	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		
		Object[] args={vo.getSeq()};
		
		return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
	} // getBoard(BoardVO vo) END

	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		
		return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
	} // getBoardList(BoardVO vo) END
}
**/