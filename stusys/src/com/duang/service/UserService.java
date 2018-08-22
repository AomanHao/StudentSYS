package com.duang.service;

import java.util.List;

import com.duang.dao.UserDao;
import com.duang.model.User;

public class UserService {

	public List<User> getAllUser(){
		return new UserDao().getAllUser();
	}
	

	/**
	 * 添加一个
	 */
	public void addStudent(User user){
		new UserDao().addUser(user);
	}
	
	
	/**
	 * 通过ID查找
	 * @return 
	 */
	public User getByID(int id){
		return new UserDao().getById(id);
	}
	
	/**
	 * 通过ID修改
	 * @param student
	 */
	public void modiftStudent(User user){
		System.out.println(user.getName());
		new UserDao().modifyUser(user);
	}
	
	/**
	 * 通过ID删除
	 * @param id
	 */
	public void delUser(int id){
		new UserDao().delUser(id);
	}
	
	
	public List<User> login(String name,String pwd){
		return new UserDao().login(name,pwd);
	}
}
