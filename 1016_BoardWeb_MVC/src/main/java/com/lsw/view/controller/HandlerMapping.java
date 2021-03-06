package com.lsw.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.lsw.view.board.DeleteBoardController;
import com.lsw.view.board.GetBoardController;
import com.lsw.view.board.GetBoardListController;
import com.lsw.view.board.InsertBoardController;
import com.lsw.view.board.UpdateBoardController;
import com.lsw.view.user.LoginController;
import com.lsw.view.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		this.mappings.put("/login.do", new LoginController());
		this.mappings.put("/getBoardList.do", new GetBoardListController());
		this.mappings.put("/getBoard.do", new GetBoardController());
		this.mappings.put("/insertBoard.do", new InsertBoardController());
		this.mappings.put("/updateBoard.do", new UpdateBoardController());
		this.mappings.put("/deleteBoard.do", new DeleteBoardController());
		this.mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
