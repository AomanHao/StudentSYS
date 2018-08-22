package com.duang.service;

import java.util.List;

import com.duang.dao.ClassDao;
import com.duang.model.Class;

public class ClassService {

	public List<com.duang.model.Class> getAllClass(){
		return new ClassDao().getAllClass();
	}
	

	/**
	 * ���
	 * @param 
	 */
	public void addClass(com.duang.model.Class banji){
		new ClassDao().addClass(banji);;
	}
	
	
	/**
	 * ͨ��ID����
	 * @return 
	 */
	public com.duang.model.Class getByID(int id){
		return new ClassDao().getClassById(id);
	}
	
	/**
	 * ͨ��ID�޸�ѧ����Ϣ
	 */
	public void modiftClass(com.duang.model.Class banji){
		System.out.println(banji.getName());
		new ClassDao().modifyClass(banji);
	}
	
	/**
	 * ͨ��IDɾ��ѧ��
	 */
	public void delClass(int id){
		new ClassDao().delClass(id);
	}
}
