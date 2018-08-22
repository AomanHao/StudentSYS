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
	 * ��ȡȫ���û�
	 * @return
	 */
	public String getAllUser(){
		UserService service=new UserService();
		list=service.getAllUser();
		return "success";
	}
	
	/**
	 * ���
	 * @author LI JIA
	 *
	 */
	public String addUser(){
		UserService userService=new UserService();
		userService.addStudent(user);
		return this.getAllUser();
	}
	
	

	/**
	 * ɾ���û�
	 * @return
	 */
	public String delUser(){
		UserService service=new UserService();
		service.delUser(user.getId());
		return this.getAllUser();
	}
	
	/**
	 * Ԥ�޸��û�
	 * @return
	 */
	public String preModifyUser(){
		UserService service=new UserService();
		user=service.getByID(user.getId());
		return SUCCESS;
	}
	
	/**
	 * �޸��û�
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
