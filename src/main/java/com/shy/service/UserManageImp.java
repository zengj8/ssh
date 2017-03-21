package com.shy.service;

import javax.annotation.Resource;

import com.shy.dao.UserDao;
import com.shy.entity.User;

public class UserManageImp implements IUserManage {
	
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
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		userDao.AddUser(user);
		
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("------UserManageImp.modifyUser--------"+user.getName());
		userDao.modifyUser(user);

	}

	@Override
	public void deleteUser(User user) {
		System.out.println("------UserManageImp.deleteUser--------"+user.getName());
		userDao.deleteUser(user);
	}
}
