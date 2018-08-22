package com.duang.service;

import java.util.List;

import com.duang.dao.GradeDao;
import com.duang.model.Grade;


public class GradeService {
	
	/**
	 * ��ȡȫ��
	 *
	 */
	public List<Grade> getAllGrade(){
		return new GradeDao().getAll();
	}
	
	public List<Grade> getAllOrderByExamId(){
		return new GradeDao().getAllOrderByExamId();
	}
	
	public List<Grade> getAllOrderByStuId(){
		return new GradeDao().getAllOrderByStuId();
	}
	
	/**
	 * ���һ��
	 * @param student
	 */
	public void addGrade(Grade grade){
		new GradeDao().addGrade(grade);
	}
	
	
	/**
	 * ͨ��ID����
	 * @param student
	 * @return 
	 */
	public Grade getById(int id){
		return new GradeDao().getById(id);
	}
	
	/**
	 * ͨ��ID�޸�
	 * @param student
	 */
	public void modifyGrade(Grade grade){
		new GradeDao().modifyGrade(grade);
	}
	
	/**
	 * ͨ��IDɾ��
	 * @param id
	 */
	public void delGrade(int id){
		new GradeDao().delGrade(id);
	}
}
