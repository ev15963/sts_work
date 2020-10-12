package com.lsw.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		//1. spring �����̳ʸ� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� UserServiceImpl ��ü�� Lookup �Ѵ�.
		UserService userSerivce = (UserService) container.getBean("userService");
		
		//3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userSerivce.getUser(vo); //��������
		if(user != null) {
			System.out.println(user.getName()+"�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		//4. spring �����̳ʸ� ����
		container.close();
	}
}