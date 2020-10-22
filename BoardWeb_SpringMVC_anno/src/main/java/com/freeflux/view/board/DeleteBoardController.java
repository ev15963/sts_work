package com.freeflux.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.board.BoardVO;
import com.freeflux.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {

	public DeleteBoardController() {
	}

	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");

		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}

}
