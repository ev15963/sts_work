package com.lsw.view.user;

import javax.servlet.http.HttpSession;

public class LogoutController{

	public String logout(HttpSession session) {
		// else if (path.equals("/logout.do")) {
		System.out.println("로그아웃처리");

		session.invalidate();
		return "login.jsp";
		
		// logout_proc.jsp
		// 1. 브라우져와 연결된 세션 객체를 강제 종료 한다.
//		HttpSession session = request.getSession();
//		session.invalidate();

		// 2. 세션 종료후, 메인 화면으로 이동한다.
		// response.sendRedirect("login.jsp");

//		return "login";
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("redirect:login.jsp"); //redirect:
//		return mav;
	}

}
