package com.lsw.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
//	com.lsw.view.board
	//�˻� ���� ��� ����
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		
		return conditionMap;
	}
	
	
//	InsertBoardController.java �۵��
	@RequestMapping("/insertBoard.do") //value=
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) throws IOException { //HttpServletRequest request
//		else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("�۵��ó�� ����");
			
			MultipartFile uploadFile=vo.getUploadFile();
			if(!uploadFile.isEmpty()) {
				String filename=uploadFile.getOriginalFilename();
				uploadFile.transferTo(new File("D:/"+filename));
			}
			
			boardDAO.insertBoard(vo);
			return "redirect:getBoardList.do";
	}
	
	
//	UpdateBoardController.java �ۼ���
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) { //@ModelAttribute("board") 
//		System.out.println("�ۼ���ó�� ����");
//		System.out.println("�ۼ��� �̸� : "+vo.getVOwriter());
//		System.out.println("��ȣ : "+vo.getSeq());
//		System.out.println("���� : "+vo.getTitle());
//		System.out.println("�ۼ��� : "+vo.getWriter());
//		System.out.println("���� : "+vo.getContent());
//		System.out.println("����� : "+vo.getRegDate());
//		System.out.println("��ȸ�� : "+vo.getCnt());
		
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";
	}
	
//	DeleteBoardController.java �ۻ���
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO boardDAO) {
			System.out.println("�ۻ���ó�� ����");
			
			boardDAO.deleteBoard(vo);
			return "getBoardList.do";
	}
	
//	GetBoardController.java �ۻ���ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("�ۻ���ȸó�� ����");
		
		//Model ���� ����
		model.addAttribute("board", boardDAO.getBoardList(vo)); //List
		return "getBoard.jsp";
//		mav.addObject("board", boardDAO.getBoard(vo));	//Mode1 ���� ����
//		mav.setViewName("getBoard.jsp");	//View ���� ����
//		return mav;
	}
	
//	GetBoardListController.java �۸�� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
//			@RequestParam(value="searchCondition", 
//		defaultValue="TITLE", required=false) String condition, 
//		@RequestParam(value="searchKeyword", defaultValue="", required=false)
//		String keyword, BoardDAO boardDA O, Model model) {
//
//		System.out.println("�˻����� : "+condition);
//		System.out.println("�˻��ܾ� : "+keyword);
//		else if (path.equals("/getBoardList.do")) {
			//model  ���� ����
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp";
		
	}
	
	
	
}