package com.lsw.biz.user.impl;

import com.lsw.biz.user.UserService;
import com.lsw.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	
	private UserDAO UserDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		UserDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return null; //dao �߰��ϱ�
	}

}
