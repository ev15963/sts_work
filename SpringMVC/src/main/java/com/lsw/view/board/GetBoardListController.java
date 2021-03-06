package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

//@Controller
public class GetBoardListController{
	
//	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("글목록검색처리");
			
			//1. 사용자 입력 정보 추출(검색기능은 나중에 구현)
			//2. DB 연동 처리
//			BoardVO vo = new BoardVO();
//			BoardDAO boardDAO = new BoardDAO();
//			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. 검색결과를 세션에 저장하고 목록 화면으로 이동
//			HttpSession session = request.getSession();
//			session.setAttribute("boardList", boardList);
//			response.sendRedirect("getBoardList.jsp");
			
//			return "getBoardList";
			
			// 3. 검색 결과와 화면 정보를 ModelAndView에 저장하여 리턴
//			ModelAndView mav = new ModelAndView();
			mav.addObject("boardList", boardDAO.getBoardList(vo)); //Model 정보 저장
			mav.setViewName("getBoardList.jsp");	//view 정보 저장
			return mav;
	}

}
