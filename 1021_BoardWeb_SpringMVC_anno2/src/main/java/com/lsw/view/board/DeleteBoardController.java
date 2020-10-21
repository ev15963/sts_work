package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

//@Controller
public class DeleteBoardController{

//	@RequestMapping("/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO boardDAO) {
//		else if (path.equals("/deleteBoard.do")) {
			System.out.println("글삭제처리");
			
			//deleteBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
//			String seq = request.getParameter("seq");


			//2. DB 연동 처리
//			BoardVO vo = new BoardVO();
//			vo.setSeq(Integer.parseInt(seq));
//
//			BoardDAO boardDAO = new BoardDAO();
//			boardDAO.deleteBoard(vo);

			//3. 화면 네비게이션
//			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
//			return "getBoardList.do";
//			ModelAndView mav = new ModelAndView();
//			mav.setViewName("redirect:getBoardList.do");
//			return mav;
			
			boardDAO.deleteBoard(vo);
			return "getBoardList.do";
	}
}
