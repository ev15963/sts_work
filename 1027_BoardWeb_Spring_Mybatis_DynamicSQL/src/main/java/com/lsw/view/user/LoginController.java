package com.lsw.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lsw.biz.user.UserVO;
import com.lsw.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 처리 이동");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";

	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	// Servlet API 사용
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("로그인 인증 처리..");
		UserVO user = userDAO.getUser(vo); //
		if (user != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		} else
			return "login.jsp";
	}

	// //1. 사용자 입력 정보 호출
	// String id =request.getParameter("id");
	// String password =request.getParameter("password");
	//
	// //2. DB 연동 처리
	// UserVO vo = new UserVO();
	// vo.setId(id);
	// vo.setPassword(password);
	//
	// UserDAO userDAO = new UserDAO();
	// UserVO user = userDAO.getUser(vo);

	// 3. 화면 네비게이션
	// ModelAndView mav = new ModelAndView();
	// if (user != null) {
	// mav.setViewName("redirect:getBoardList.do");
	// } else {
	// mav.setViewName("redirect:login.jsp"); //viewresolver => getview() =>
	// "./login.jsp"
	// }
	// return mav;

}
