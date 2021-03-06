package com.lsw.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lsw.biz.user.UserService;
import com.lsw.biz.user.UserVO;

public class UserServiceClient {
	public static void main(String[] args) {
		//1.Spring 컨테이너를 구동
		AbstractApplicationContext ct = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2.Spring 컨테이너로 부터 UserServiceImpl 객체를 lookup요청한다.
		UserService userService = (UserService) ct.getBean("userService");
		
		//3.로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo); //???
		
		if (user != null) {
			System.out.println(user.getName()+"님 환영합니다.");
		}  else {
			System.out.println("로그인 실패");
		}
		
		//4.Spring컨테이너를 종료
		ct.close();
	}
}
