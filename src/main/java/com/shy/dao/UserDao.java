package com.shy.dao;

import com.shy.entity.User;

public interface UserDao {
	public void AddUser(User user);
	public User getUser(String id);
	public void modifyUser(User user);
	public void deleteUser(User user);
}
