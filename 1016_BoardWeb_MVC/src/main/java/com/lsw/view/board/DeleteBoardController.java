package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
import com.lsw.view.controller.Controller;

public class DeleteBoardController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/deleteBoard.do")) {
			System.out.println("글삭제처리");
			
			//deleteBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
			String seq = request.getParameter("seq");


			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));

			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(vo);

			//3. 화면 네비게이션
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			return "getBoardList.do";
	}
}
