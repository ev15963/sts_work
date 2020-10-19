package com.lsw.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// else if (path.equals("/logout.do")) {
		System.out.println("�α׾ƿ�ó��");

		// logout_proc.jsp
		// 1. �������� ����� ���� ��ü�� ���� ���� �Ѵ�.
		HttpSession session = request.getSession();
		session.invalidate();

		// 2. ���� ������, ���� ȭ������ �̵��Ѵ�.
		// response.sendRedirect("login.jsp");

//		return "login";
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:login.jsp"); //redirect:
		return mav;
	}

}