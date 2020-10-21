package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import com.lsw.view.controller.Controller;

//@Controller
public class GetBoardListController{
	
//	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//		else if (path.equals("/getBoardList.do")) {
			System.out.println("�۸�ϰ˻�ó��");
			
			//1. ����� �Է� ���� ����(�˻������ ���߿� ����)
			//2. DB ���� ó��
//			BoardVO vo = new BoardVO();
//			BoardDAO boardDAO = new BoardDAO();
//			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. �˻������ ���ǿ� �����ϰ� ��� ȭ������ �̵�
//			HttpSession session = request.getSession();
//			session.setAttribute("boardList", boardList);
//			response.sendRedirect("getBoardList.jsp");
			
//			return "getBoardList";
			
			// 3. �˻� ����� ȭ�� ������ ModelAndView�� �����Ͽ� ����
//			ModelAndView mav = new ModelAndView();
			mav.addObject("boardList", boardDAO.getBoardList(vo)); //Model ���� ����
			mav.setViewName("getBoardList.jsp");	//view ���� ����
			return mav;
	}

}
