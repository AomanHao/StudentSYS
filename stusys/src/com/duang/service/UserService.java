package com.duang.service;

import java.util.List;

import com.duang.dao.UserDao;
import com.duang.model.User;

public class UserService {

	public List<User> getAllUser(){
		return new UserDao().getAllUser();
	}
	

	/**
	 * ���һ��
	 */
	public void addStudent(User user){
		new UserDao().addUser(user);
	}
	
	
	/**
	 * ͨ��ID����
	 * @return 
	 */
	public User getByID(int id){
		return new UserDao().getById(id);
	}
	
	/**
	 * ͨ��ID�޸�
	 * @param student
	 */
	public void modiftStudent(User user){
		System.out.println(user.getName());
		new UserDao().modifyUser(user);
	}
	
	/**
	 * ͨ��IDɾ��
	 * @param id
	 */
	public void delUser(int id){
		new UserDao().delUser(id);
	}
	
	
	public List<User> login(String name,String pwd){
		return new UserDao().login(name,pwd);
	}
}
