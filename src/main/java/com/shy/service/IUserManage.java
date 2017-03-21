package com.shy.service;

import com.shy.entity.User;

public interface IUserManage {
	public void addUser(User user);
	public void modifyUser(User user);
	public void deleteUser(User user);
}
