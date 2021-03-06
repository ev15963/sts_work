package com.lsw.view.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lsw.biz.board.BoardListVO;
import com.lsw.biz.board.BoardService;
import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public BoardListVO dataTransform(BoardVO vo) {
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardList(boardList);
		return boardListVO;
	}
//	com.lsw.view.board
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		
		return conditionMap;
	}
	
	
//	InsertBoardController.java 글등록
	@RequestMapping(value="/insertBoard.do") //value=
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리 통합");
			
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
	}
//	UpdateBoardController.java 글수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) { //@ModelAttribute("board") 
		System.out.println("글수정처리 통합");
//		System.out.println("작성자 이름 : "+vo.getVOwriter());
		System.out.println("번호 : "+vo.getSeq());
		System.out.println("제목 : "+vo.getTitle());
		System.out.println("작성자 : "+vo.getWriter());
		System.out.println("내용 : "+vo.getContent());
		System.out.println("등록일 : "+vo.getRegDate());
		System.out.println("조회수 : "+vo.getCnt());
		
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
//	DeleteBoardController.java 글삭제
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO boardDAO) {
			System.out.println("글삭제처리 통합");
			
			boardDAO.deleteBoard(vo);
			return "getBoardList.do";
	}
	
//	GetBoardController.java 글상세조회
	@RequestMapping(value="/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글상세조회처리 통합");
		
		//Model 정보 저장
		model.addAttribute("board", boardDAO.getBoard(vo)); //List
		return "getBoard.jsp";
//		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 정보 저장
//		mav.setViewName("getBoard.jsp");	//View 정보 저장
//		return mav;
	}
	
//	GetBoardListController.java 글목록 검색
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(//BoardVO vo, BoardDAO boardDAO, Model model) {
			@RequestParam(value="searchCondition", 
		defaultValue="TITLE", required=false) String condition, 
		@RequestParam(value="searchKeyword", defaultValue="", required=false)
		String keyword, BoardVO vo, BoardDAO boardDAO, Model model) {

		System.out.println("검색조건 : "+condition);
		System.out.println("검색단어 : "+keyword);
//		else if (path.equals("/getBoardList.do")) {
			//model  정보 저장
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
		
	}
	
	
	
}
