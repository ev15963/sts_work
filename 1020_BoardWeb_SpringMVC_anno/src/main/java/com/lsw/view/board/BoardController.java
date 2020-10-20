package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
//	com.lsw.view.board
	
//	InsertBoardController.java 글등록
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리 통합");
			
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
	}
//	UpdateBoardController.java 글수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글수정처리 통합");
		
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
//	DeleteBoardController.java 글삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO boardDAO) {
			System.out.println("글삭제처리 통합");
			
			boardDAO.deleteBoard(vo);
			return "getBoardList.do";
	}
	
//	GetBoardController.java 글상세조회
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글상세조회처리 통합");
		
		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 정보 저장
		mav.setViewName("getBoard.jsp");	//View 정보 저장
		return mav;
	}
	
//	GetBoardListController.java 글목록 검색
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("글목록검색처리 통합");
			mav.addObject("boardList", boardDAO.getBoardList(vo)); //Model 정보 저장
			mav.setViewName("getBoardList.jsp");	//view 정보 저장
			return mav;
	}
	
}
