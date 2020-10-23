package com.lsw.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lsw.biz.board.BoardService;
import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	
//	com.lsw.view.board

	
	
//	InsertBoardController.java �۵��
	@RequestMapping(value="/insertBoard.do") //value=
	public String insertBoard(BoardVO vo) { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("�۵��ó�� ����");
			
			boardService.insertBoard(vo);
			return "getBoardList.do";
	}
//	UpdateBoardController.java �ۼ���
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute ("board") BoardVO vo) { //@ModelAttribute("board") 
		System.out.println("�ۼ���ó�� ����");
//		System.out.println("�ۼ��� �̸� : "+vo.getVOwriter());
//		System.out.println("��ȣ : "+vo.getSeq());
//		System.out.println("���� : "+vo.getTitle());
//		System.out.println("�ۼ��� : "+vo.getWriter());
//		System.out.println("���� : "+vo.getContent());
//		System.out.println("����� : "+vo.getRegDate());
//		System.out.println("��ȸ�� : "+vo.getCnt());
		
		boardService.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
//	DeleteBoardController.java �ۻ���
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard (BoardVO vo) {
			System.out.println("�ۻ���ó�� ����");
			
			boardService.deleteBoard(vo);
			return "getBoardList.do";
	}
	
//	GetBoardController.java �ۻ���ȸ
	@RequestMapping(value="/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("�ۻ���ȸó�� ����");
		
		//Model ���� ����
		model.addAttribute("board", BoardDAO.getBoardList(vo)); //List
		return "getBoard.jsp";
//		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 ���� ����
//		mav.setViewName("getBoard.jsp");	//View ���� ����
//		return mav;
	}
	
//	GetBoardListController.java �۸�� �˻�
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(//BoardVO vo, Model model) {
//		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
//		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
			@RequestParam(value="searchCondition", 
		defaultValue="TITLE", required=false) String condition, 
		@RequestParam(value="searchKeyword", defaultValue="", required=false)
		String keyword, BoardDAO boardDAO, Model model) {

		System.out.println("�˻����� : "+condition);
		System.out.println("�˻��ܾ� : "+keyword);
//		else if (path.equals("/getBoardList.do")) {
			//model  ���� ����
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
		
	}
	
	//�˻� ���� ��� ����
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		
		return conditionMap;
	}
	
}