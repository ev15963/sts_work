package com.lsw.biz.board;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="boardList")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardListVO {
	public BoardListVO() {
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name = "board")
	private List<BoardVO> boardList;


	
	public void setBoardList(List<BoardVO> boardList) {
		this.boardList = boardList;
	}
	
}
