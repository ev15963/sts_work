package com.lsw.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController{

	public LogoutController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/logout.do")//value=
	public String logout(HttpSession session) {
		// else if (path.equals("/logout.do")) {
		System.out.println("�α׾ƿ�ó��");

		session.invalidate();
		return "login.jsp";
		
		// logout_proc.jsp
		// 1. �������� ����� ���� ��ü�� ���� ���� �Ѵ�.
//		HttpSession session = request.getSession();
//		session.invalidate();

		// 2. ���� ������, ���� ȭ������ �̵��Ѵ�.
		// response.sendRedirect("login.jsp");

//		return "login";
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:login.jsp"); //redirect:
//		return mav;
	}

}