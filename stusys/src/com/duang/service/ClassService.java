package com.duang.service;

import java.util.List;

import com.duang.dao.ClassDao;
import com.duang.model.Class;

public class ClassService {

	public List<com.duang.model.Class> getAllClass(){
		return new ClassDao().getAllClass();
	}
	

	/**
	 * 添加
	 * @param 
	 */
	public void addClass(com.duang.model.Class banji){
		new ClassDao().addClass(banji);;
	}
	
	
	/**
	 * 通过ID查找
	 * @return 
	 */
	public com.duang.model.Class getByID(int id){
		return new ClassDao().getClassById(id);
	}
	
	/**
	 * 通过ID修改学生信息
	 */
	public void modiftClass(com.duang.model.Class banji){
		System.out.println(banji.getName());
		new ClassDao().modifyClass(banji);
	}
	
	/**
	 * 通过ID删除学生
	 */
	public void delClass(int id){
		new ClassDao().delClass(id);
	}
}
