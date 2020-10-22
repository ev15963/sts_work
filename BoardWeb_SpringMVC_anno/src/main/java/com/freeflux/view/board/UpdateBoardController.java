package com.freeflux.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {

	public UpdateBoardController() {
	}

	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");

		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}

}
