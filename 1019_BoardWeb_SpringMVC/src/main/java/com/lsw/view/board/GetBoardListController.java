package com.lsw.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("글목록검색처리");
			
			//1. 사용자 입력 정보 추출(검색기능은 나중에 구현)
			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			BoardDAO boardDAO = new BoardDAO();
			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. 검색결과를 세션에 저장하고 목록 화면으로 이동
//			HttpSession session = request.getSession();
//			session.setAttribute("boardList", boardList);
//			response.sendRedirect("getBoardList.jsp");
			
//			return "getBoardList";
			
			// 3. 검색 결과와 화면 정보를 ModelAndView에 저장하여 리턴
			ModelAndView mav = new ModelAndView();
			mav.addObject("boardList", boardList); //Model 정보 저장
			mav.setViewName("getBoardList");
			return mav;
	}

}
