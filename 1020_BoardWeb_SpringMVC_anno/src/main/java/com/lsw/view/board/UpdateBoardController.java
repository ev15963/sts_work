package com.lsw.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UpdateBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�ۼ���ó��");
		
		//updateBoard_proc.jsp
		//1. ����� �Է� ���� ����
//		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		//�ۼ��� ����
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");
		
		//2. DB ���� ó��
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		//3. ȭ�� ���̰��̼�
//		response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do

//		return "getBoardList.do";
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:getBoardList.do"); //redirect:
		return mav;
	}

	
}