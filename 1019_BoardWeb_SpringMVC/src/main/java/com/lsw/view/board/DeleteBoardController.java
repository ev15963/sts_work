package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DeleteBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/deleteBoard.do")) {
			System.out.println("�ۻ���ó��");
			
			//deleteBoard_proc.jsp
			
			//1. ����� �Է� ���� ����
			String seq = request.getParameter("seq");


			//2. DB ���� ó��
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));

			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(vo);

			//3. ȭ�� �׺���̼�
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
//			return "getBoardList.do";
			ModelAndView mav = new ModelAndView();
			mav.setViewName("redirect:getBoardList.do");
			return mav;
	}
}