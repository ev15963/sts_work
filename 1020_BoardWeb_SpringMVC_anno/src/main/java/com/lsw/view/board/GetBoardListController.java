package com.lsw.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("�۸�ϰ˻�ó��");
			
			//1. ����� �Է� ���� ����(�˻������ ���߿� ����)
			//2. DB ���� ó��
			BoardVO vo = new BoardVO();
			BoardDAO boardDAO = new BoardDAO();
			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. �˻������ ���ǿ� �����ϰ� ��� ȭ������ �̵�
//			HttpSession session = request.getSession();
//			session.setAttribute("boardList", boardList);
//			response.sendRedirect("getBoardList.jsp");
			
//			return "getBoardList";
			
			// 3. �˻� ����� ȭ�� ������ ModelAndView�� �����Ͽ� ����
			ModelAndView mav = new ModelAndView();
			mav.addObject("boardList", boardList); //Model ���� ����
			mav.setViewName("getBoardList");
			return mav;
	}

}