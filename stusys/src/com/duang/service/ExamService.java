package com.duang.service;

import java.util.List;

import com.duang.dao.ExamDao;
import com.duang.model.Exam;



public class ExamService {
	
	/**
	 * 获取全部
	 * @author LI JIA
	 *
	 */
	public List<Exam> getAllExam(){
		return new ExamDao().getAllExam();
	}
	
	
	/**
	 * 添加一个
	 * @param student
	 */
	public void addExam(Exam exam){
		new ExamDao().addExam(exam);
	}
	
	
	/**
	 * 通过ID查找
	 * @param student
	 * @return 
	 */
	public Exam getByID(int id){
		return new ExamDao().getById(id);
	}
	
	/**
	 * 通过ID修改
	 * @param student
	 */
	public void modiftExam(Exam exam){
		System.out.println(exam.getName());
		new ExamDao().modifyExam(exam);
	}
	
	/**
	 * 通过ID删除
	 * @param id
	 */
	public void delExam(int id){
		new ExamDao().delExam(id);
	}
}
