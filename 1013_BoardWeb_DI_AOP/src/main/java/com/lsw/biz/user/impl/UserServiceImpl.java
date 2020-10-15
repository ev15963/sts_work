package com.lsw.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsw.biz.user.UserService;
import com.lsw.biz.user.UserVO;

@Service("userService") //추가
public class UserServiceImpl implements UserService{
	
//	private UserDAO userDAO;
//	UserServiceImpl과 UserDAO 클래스에 각각 관련된 어노테이션 추가
	
	
	@Autowired //추가
	private UserDAO userDAO;
	
	public UserServiceImpl() {
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo); //dao 추가하기
	}

}
