/**
 * 
 */
package com.freeflux.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freeflux.biz.user.UserVO;
import com.freeflux.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	public LoginController() {
	}

	@RequestMapping(value="/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("로그인 처리");
		
		if(userDAO.getUser(vo) != null){
			return "getBoardList.do";
		}else{
			return "login.jsp";
		}
	}

}
