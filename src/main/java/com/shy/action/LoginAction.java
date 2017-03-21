package com.shy.action;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.junit.runner.Request;
import org.springframework.web.client.HttpServerErrorException;

import com.shy.entity.User;
import com.shy.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userId;
	
	private User user;
	
	@Resource  
	private UserService userService;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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
	
	public String userLogin() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
//		System.out.println("id = " + request.getParameter("user.id"));
		String id = request.getParameter("user.id");
		if(userService.getUser(id) != null) {
//			Map session = ActionContext.getContext().getSession();
//			session.put("userId", id);
			ServletActionContext.getRequest().getSession().setAttribute("userId", id);
			this.userId = id;
			return SUCCESS;
		}
		return "fail";
	}

//	@Override
//	public String execute() throws Exception {
//		
//		HttpServletRequest request=ServletActionContext.getRequest();
//		
//		System.out.println(request.getCharacterEncoding());
//		
//		if("root".equals(user.getName()) && "root123".equals(user.getPassword()))
//		{
//			Map session=ActionContext.getContext().getSession();
//			session.put("user.name", user.getName());
//			
//			System.out.println("登录成功,用户名="+user.getName());
//			return "success";
//		}
//		
//		System.out.println("登录失败，用户名="+user.getName());
//		return "fail";
//	}
	
}
