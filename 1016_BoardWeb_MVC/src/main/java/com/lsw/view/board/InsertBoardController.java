package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
import com.lsw.view.controller.Controller;

public class InsertBoardController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리");
			
			//글 등록 기능 구현
			
			//insertBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
//			request.setCharacterEncoding("UTF-8");
			String title=request.getParameter("title");
			String writer=request.getParameter("writer");
			String content=request.getParameter("content");

			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);

			BoardDAO bDAO = new BoardDAO();
			bDAO.insertBoard(vo);

			//3. 화면 네비게이션
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			return "getBoardList.do";
	}

}
