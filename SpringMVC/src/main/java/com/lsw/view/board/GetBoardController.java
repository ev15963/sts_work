package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

//@Controller
public class GetBoardController {

//	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글상세조회처리");
		
		//getBoard.jsp 내용 가져오기
		
//		dispatcher부분의 else if (path.equals("/getBoard.do")) {
		
		//1. 검색할 게시글 번호 추출
//		String seq = request.getParameter("seq");
//	 	System.out.print(seq);

		//2. DB 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//
//		BoardDAO bDAO = new BoardDAO();
//		BoardVO board = bDAO.getBoard(vo);
		
		//3. 검색결과 세션에 저장하고 상세 화면으로 이동
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
		
//		response.sendRedirect("getBoard.jsp");
		//view re297
//		return "getBoard";
		
//		ModelAndView mav = new ModelAndView();
		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 정보 저장
		mav.setViewName("getBoard.jsp");	//View 정보 저장
		return mav;
	}

	
	
}
