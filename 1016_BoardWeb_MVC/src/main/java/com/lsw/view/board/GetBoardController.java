package com.lsw.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
import com.lsw.view.controller.Controller;

public class GetBoardController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글상세조회처리");
		
		//getBoard.jsp 내용 가져오기
		
//		dispatcher부분의 else if (path.equals("/getBoard.do")) {
		
		//1. 검색할 게시글 번호 추출
		String seq = request.getParameter("seq");
//	 	System.out.print(seq);

		//2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));

		BoardDAO bDAO = new BoardDAO();
		BoardVO board = bDAO.getBoard(vo);
		
		//3. 검색결과 세션에 저장하고 상세 화면으로 이동
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		
//		response.sendRedirect("getBoard.jsp");
		//view re297
		return "getBoard";
	}

	
	
}
