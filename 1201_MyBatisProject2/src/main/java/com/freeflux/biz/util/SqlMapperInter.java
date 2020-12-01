package com.freeflux.biz.util;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.freeflux.biz.board.BoardVO;


public interface SqlMapperInter {
	
	@Select("select * from board_spring")
	public List<BoardVO> selectDataAll();
	
	@Select("select * from board_spring where seq=#{seq}")
	public BoardVO selectData(String arg);
	
	@Insert("insert into board_spring (seq, title, writer, content) values ((select nvl(max(seq), 0)+1 from board_spring), #{title}, #{writer}, #{content})")
	public int insertBoard(BoardVO bVO);
	
	@Update("update board_spring set title=#{title}, content=#{content} where seq=#{seq}")
	public int updateBoard(BoardVO bVO);
	
	@Delete("delete board_spring where seq=#{seq}")
	public int deleteBoard(String arg);
	
	
}
