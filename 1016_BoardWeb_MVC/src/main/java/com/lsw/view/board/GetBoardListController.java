package com.lsw.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
import com.lsw.view.controller.Controller;

public class GetBoardListController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("�۸�ϰ˻�ó��");
			
			//1. ����� �Է� ���� ����(�˻������ ���߿� ����)
			//2. DB ���� ó��
			BoardVO vo = new BoardVO();
			BoardDAO boardDAO = new BoardDAO();
			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. �˻������ ���ǿ� �����ϰ� ��� ȭ������ �̵�
			HttpSession session = request.getSession();
			session.setAttribute("boardList", boardList);
//			response.sendRedirect("getBoardList.jsp");
			
			return "getBoardList";
	}

}