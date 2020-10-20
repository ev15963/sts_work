package com.lsw.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
//	com.lsw.view.board
	
//	InsertBoardController.java 글등록
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리 통합");
			
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
	}
//	UpdateBoardController.java 글수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글수정처리 통합");
		
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
//	DeleteBoardController.java 글삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO boardDAO) {
			System.out.println("글삭제처리 통합");
			
			boardDAO.deleteBoard(vo);
			return "getBoardList.do";
	}
	
//	GetBoardController.java 글상세조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글상세조회처리 통합");
		
		//Model 정보 저장
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
//		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 정보 저장
//		mav.setViewName("getBoard.jsp");	//View 정보 저장
//		return mav;
	}
	
//	GetBoardListController.java 글목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition", 
		defaultValue="TITLE", required=false) String condition, 
		@RequestParam(value="searchKeyword", defaultValue="", required=false)
		String keyword, BoardDAO boardDAO, Model model) {

		System.out.println("검색조건 : "+condition);
		System.out.println("검색단어 : "+keyword);
//		else if (path.equals("/getBoardList.do")) {
			//model  정보 저장
//		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
		
	}
	
	
	
}
