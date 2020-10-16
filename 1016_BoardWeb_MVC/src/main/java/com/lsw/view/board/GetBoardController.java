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
		System.out.println("�ۻ���ȸó��");
		
		//getBoard.jsp ���� ��������
		
//		dispatcher�κ��� else if (path.equals("/getBoard.do")) {
		
		//1. �˻��� �Խñ� ��ȣ ����
		String seq = request.getParameter("seq");
//	 	System.out.print(seq);

		//2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));

		BoardDAO bDAO = new BoardDAO();
		BoardVO board = bDAO.getBoard(vo);
		
		//3. �˻���� ���ǿ� �����ϰ� �� ȭ������ �̵�
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		
//		response.sendRedirect("getBoard.jsp");
		//view re297
		return "getBoard";
	}

	
	
}