package com.duang.service;

import java.util.List;

import com.duang.dao.GradeDao;
import com.duang.model.Grade;


public class GradeService {
	
	/**
	 * 获取全部
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
	 * 添加一个
	 * @param student
	 */
	public void addGrade(Grade grade){
		new GradeDao().addGrade(grade);
	}
	
	
	/**
	 * 通过ID查找
	 * @param student
	 * @return 
	 */
	public Grade getById(int id){
		return new GradeDao().getById(id);
	}
	
	/**
	 * 通过ID修改
	 * @param student
	 */
	public void modifyGrade(Grade grade){
		new GradeDao().modifyGrade(grade);
	}
	
	/**
	 * 通过ID删除
	 * @param id
	 */
	public void delGrade(int id){
		new GradeDao().delGrade(id);
	}
}
