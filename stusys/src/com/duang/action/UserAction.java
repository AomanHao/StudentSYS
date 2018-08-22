package com.duang.action;

import java.util.List;

import com.duang.model.User;
import com.duang.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction  extends ActionSupport implements ModelDriven<User> {

	List<User> list;
	private User user=new User();

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 获取全部用户
	 * @return
	 */
	public String getAllUser(){
		UserService service=new UserService();
		list=service.getAllUser();
		return "success";
	}
	
	/**
	 * 添加
	 * @author LI JIA
	 *
	 */
	public String addUser(){
		UserService userService=new UserService();
		userService.addStudent(user);
		return this.getAllUser();
	}
	
	

	/**
	 * 删除用户
	 * @return
	 */
	public String delUser(){
		UserService service=new UserService();
		service.delUser(user.getId());
		return this.getAllUser();
	}
	
	/**
	 * 预修改用户
	 * @return
	 */
	public String preModifyUser(){
		UserService service=new UserService();
		user=service.getByID(user.getId());
		return SUCCESS;
	}
	
	/**
	 * 修改用户
	 * @return
	 */
	public String modifyUser(){
		UserService service=new UserService();
		service.modiftStudent(user);
		return this.getAllUser();
	}
	

	public String userLogin(){
		UserService userService = new UserService();
		List<User> list=userService.login(user.getName(), user.getPwd());
		if(list !=null){
			return "success";
		}
		else
		{
			return "input";
		}
	}
	
	/*
	public String register(){
		return "regsuccess";
	}*/
	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
	
}
