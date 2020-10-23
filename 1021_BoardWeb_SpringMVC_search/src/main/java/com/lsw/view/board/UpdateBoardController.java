package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
//import org.springframework.web.servlet.mvc.Controller;
//@Controller
public class UpdateBoardController {

//	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글수정처리");
		
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
		
		//updateBoard_proc.jsp
		//1. 사용자 입력 정보 추출
//		request.setCharacterEncoding("UTF-8");
//		String title = request.getParameter("title");
//		//작성자 고정
//		String content = request.getParameter("content");
//		String seq = request.getParameter("seq");
		
		//2. DB 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setContent(content);
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.updateBoard(vo);
		
		//3. 화면 네이게이션
//		response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do

//		return "getBoardList.do";
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:getBoardList.do"); //redirect:
//		return mav;
	}

	
}
