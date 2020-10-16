package com.lsw.view.controller;

public class ViewResolver {
	private String prefix;
	private String suffix;
	
	//dispatcherServlet�� �����ֱ� �޼����� init() ������ ��ü�� ����
	public ViewResolver() {
		
	}
	
	//��ü ���� ��, view �� ���õ� ������ ��ġ ���� (webapp ������ ��� : "./")
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	//dispatcherServlet�� process() ������ ȣ��
	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}
}