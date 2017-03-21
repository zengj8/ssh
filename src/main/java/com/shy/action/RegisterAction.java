package com.shy.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.shy.entity.User;
import com.shy.service.IUserManage;
import com.shy.service.UserService;

public class RegisterAction extends ActionSupport {
	
	private User user;
	
	@Resource  
	private UserService userService;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String addUser() {
		System.out.println("-------userAction.addUser--------"+user.getName());
		user.setSum(0);
		userService.addUser(user);
		return "success";
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();  
		String id = request.getParameter("user.id");
        String name = request.getParameter("user.name");  
        String password = request.getParameter("user.password");
        String age = request.getParameter("user.age");
        String sex = request.getParameter("user.sex");
        
        return SUCCESS;
	}
}
