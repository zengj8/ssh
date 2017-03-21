package com.shy.service;

import javax.annotation.Resource;

import com.shy.dao.UserDao;
import com.shy.entity.User;

public class UserServiceImpl implements UserService {

	@Resource  
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		System.out.println("------UserServiceImpl.addUser--------"+user.getName());
		userDao.AddUser(user);
		
	}

	@Override
	public User getUser(String id) {
		System.out.println("------UserServiceImpl.getUser--------"+id);
		return userDao.getUser(id);
	}

}
