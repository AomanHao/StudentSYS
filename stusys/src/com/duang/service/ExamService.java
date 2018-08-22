package com.duang.service;

import java.util.List;

import com.duang.dao.ExamDao;
import com.duang.model.Exam;



public class ExamService {
	
	/**
	 * ��ȡȫ��
	 * @author LI JIA
	 *
	 */
	public List<Exam> getAllExam(){
		return new ExamDao().getAllExam();
	}
	
	
	/**
	 * ���һ��
	 * @param student
	 */
	public void addExam(Exam exam){
		new ExamDao().addExam(exam);
	}
	
	
	/**
	 * ͨ��ID����
	 * @param student
	 * @return 
	 */
	public Exam getByID(int id){
		return new ExamDao().getById(id);
	}
	
	/**
	 * ͨ��ID�޸�
	 * @param student
	 */
	public void modiftExam(Exam exam){
		System.out.println(exam.getName());
		new ExamDao().modifyExam(exam);
	}
	
	/**
	 * ͨ��IDɾ��
	 * @param id
	 */
	public void delExam(int id){
		new ExamDao().delExam(id);
	}
}
