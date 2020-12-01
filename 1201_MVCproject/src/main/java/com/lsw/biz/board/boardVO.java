package com.lsw.biz.board;

import java.sql.Timestamp;

public class boardVO {
	private String id, name, pass;
	private Timestamp reg_date;
	
	@Override
	public String toString() {
		return "boardVO [id=" + id + ", name=" + name + ", pass=" + pass + ", reg_date=" + reg_date + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
}
