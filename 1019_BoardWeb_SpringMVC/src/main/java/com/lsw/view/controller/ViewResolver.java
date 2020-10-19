package com.lsw.view.controller;

import org.springframework.web.servlet.ModelAndView;

public class ViewResolver {
	private String prefix;
	private String suffix;
	
	//dispatcherServlet의 생명주기 메서드인 init() 내에서 객체로 생성
	public ViewResolver() {
		
	}
	
	//객체 생성 후, view 에 관련된 파일의 위치 설정 (webapp 폴더일 경우 : "./")
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	//dispatcherServlet의 process() 내에서 호출
	public String getView(ModelAndView viewName) {
		return prefix + viewName + suffix;
	}
}
