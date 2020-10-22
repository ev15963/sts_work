package com.lsw.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsw.biz.user.UserService;
import com.lsw.biz.user.UserVO;

@Service("userService") //�߰�
public class UserServiceImpl implements UserService{
	
//	private UserDAO UserDAO;
//	UserServiceImpl�� UserDAO Ŭ������ ���� ���õ� ������̼� �߰�
	
	
	@Autowired //�߰�
	private UserDAO UserDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.UserDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return UserDAO.getUser(vo); //dao �߰��ϱ�
	}

}
