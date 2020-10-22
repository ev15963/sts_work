package com.freeflux.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

	public InsertBoardController() {
	}

	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

}


/**
 * @Controller 

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller 
public class InsertBoardController implements Controller {

	public InsertBoardController() {
	}

	public void insertBoard(HttpServletRequest request) {
		System.out.println("글 등록 처리");
		
		//	1. 사용자 입력 정보 추출
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		
		//	2. DB 연동 처리
		BoardVO vo=new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO=new BoardDAO();
		boardDAO.insertBoard(vo);
	}
}

**/


/**
 * @Controller / @RequestMapping(value="/insertBoard.do") 추가
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

	public InsertBoardController() {
	}

	@RequestMapping(value="/insertBoard.do")
	public void insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		//	1. 사용자 입력 정보 추출
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		
		//	2. DB 연동 처리
		BoardVO vo=new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO=new BoardDAO();
		boardDAO.insertBoard(vo);
	}

}

**/



/**
 * @Controller / @RequestMapping(value="/insertBoard.do") 추가 / Command 객체
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

	public InsertBoardController() {
	}

	@RequestMapping(value="/insertBoard.do")
	public void insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		//	1. 사용자 입력 정보 추출
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		
		//	2. DB 연동 처리
		BoardVO vo=new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO=new BoardDAO();
		boardDAO.insertBoard(vo);
	}

}

**/


/**
 * @Controller / @RequestMapping(value="/insertBoard.do") / Command 객체
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

	public InsertBoardController() {
	}

	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}

}

**/