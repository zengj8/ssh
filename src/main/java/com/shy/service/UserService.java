package com.shy.service;

import com.shy.entity.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String id);
}
