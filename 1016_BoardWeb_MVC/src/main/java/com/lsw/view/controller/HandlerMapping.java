package com.lsw.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.lsw.view.board.GetBoardController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		this.mappings.put("/login.do", new LoginController());
//		this.mappings.put("/getBoardList.do", new GetBoardListController());
		this.mappings.put("/getBoard.do", new GetBoardController());
//		this.mappings.put("/insertBoard.do", new InsertBoardController());
//		this.mappings.put("/updateBoard.do", new UpdateController());
//		this.mappings.put("/deleteBoard.do", new DeleteController());
//		this.mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
