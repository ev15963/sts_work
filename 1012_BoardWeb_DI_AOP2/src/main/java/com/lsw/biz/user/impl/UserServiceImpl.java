package com.lsw.biz.user.impl;

import com.lsw.biz.user.UserService;
import com.lsw.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
//	private LogAdvice log;

	public UserServiceImpl() {
//		log = new LogAdvice();
	}
	
	public void setUserDAO(UserDAO userDAO) {
//		log.printLog();
		this.userDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
//		log.printLog();
		return userDAO.getUser(vo);
	}
	
	
}