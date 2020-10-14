package com.khj.biz.user.impl;

import com.khj.biz.user.UserService;
import com.khj.biz.user.UserVO;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserServiceImpl() {
	}

	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	
	public UserVO getUser(UserVO vo){
		return userDAO.getUser(vo);
	}
	
}
