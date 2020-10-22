package com.freeflux.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

	public GetBoardListController() {
	}

	@RequestMapping(value="/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");

		mav.addObject("boardList", boardDAO.getBoardList(vo));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}

}
