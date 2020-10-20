package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
public class InsertBoardController{

	@RequestMapping(value="/insertBoard.do")
	public void insertBoard(BoardVO vo) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리");
			
			//글 등록 기능 구현
			
			//insertBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
//			request.setCharacterEncoding("UTF-8");
//			String title=request.getParameter("title");
//			String writer=request.getParameter("writer");
//			String content=request.getParameter("content");

			//2. DB 연동 처리
//			BoardVO vo = new BoardVO();
//			vo.setTitle(title);
//			vo.setWriter(writer);
//			vo.setContent(content);

			BoardDAO bDAO = new BoardDAO();
			bDAO.insertBoard(vo);

			//3. 화면 네비게이션
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
//			return "getBoardList.do";
//			ModelAndView mav = new ModelAndView();
//			mav.setViewName("redirect:getBoardList.do");
//			return mav;
	}

}
