package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

//@Controller
public class InsertBoardController{

//	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("�۵��ó��");
			
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
			
			//BoardWeb/insertBoard.do -> BoardWeb/getBoardList.do
				
			//�� ��� ��� ����
			
			//insertBoard_proc.jsp
			
			//1. ����� �Է� ���� ����
//			request.setCharacterEncoding("UTF-8");
//			String title=request.getParameter("title");
//			String writer=request.getParameter("writer");
//			String content=request.getParameter("content");

			//2. DB ���� ó��
//			BoardVO vo = new BoardVO();
//			vo.setTitle(title);
//			vo.setWriter(writer);
//			vo.setContent(content);

			//BoardDAO boardDAO�� ���� 
//			BoardDAO bDAO = new BoardDAO();
//			bDAO.insertBoard(vo);

			//3. ȭ�� �׺���̼�
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
//			return "getBoardList.do";
//			ModelAndView mav = new ModelAndView();
//			mav.setViewName("redirect:getBoardList.do");
//			return mav;
	}

}
