package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InsertBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("�۵��ó��");
			
			//�� ��� ��� ����
			
			//insertBoard_proc.jsp
			
			//1. ����� �Է� ���� ����
//			request.setCharacterEncoding("UTF-8");
			String title=request.getParameter("title");
			String writer=request.getParameter("writer");
			String content=request.getParameter("content");

			//2. DB ���� ó��
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);

			BoardDAO bDAO = new BoardDAO();
			bDAO.insertBoard(vo);

			//3. ȭ�� �׺���̼�
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
//			return "getBoardList.do";
			ModelAndView mav = new ModelAndView();
			mav.setViewName("redirect:getBoardList.do");
			return mav;
	}

}