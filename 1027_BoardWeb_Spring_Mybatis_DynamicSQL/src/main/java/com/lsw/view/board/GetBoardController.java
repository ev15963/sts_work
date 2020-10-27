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
		System.out.println("�ۻ���ȸó��");
		
		//getBoard.jsp ���� ��������
		
//		dispatcher�κ��� else if (path.equals("/getBoard.do")) {
		
		//1. �˻��� �Խñ� ��ȣ ����
//		String seq = request.getParameter("seq");
//	 	System.out.print(seq);

		//2. DB ���� ó��
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//
//		BoardDAO bDAO = new BoardDAO();
//		BoardVO board = bDAO.getBoard(vo);
		
		//3. �˻���� ���ǿ� �����ϰ� �� ȭ������ �̵�
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
		
//		response.sendRedirect("getBoard.jsp");
		//view re297
//		return "getBoard";
		
//		ModelAndView mav = new ModelAndView();
		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 ���� ����
		mav.setViewName("getBoard.jsp");	//View ���� ����
		return mav;
	}

	
	
}