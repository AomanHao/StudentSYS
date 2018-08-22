package com.duang.service;

import java.util.List;

import com.duang.dao.StudentDao;
import com.duang.model.Student;


public class StudentService {
	
	/**
	 * ��ȡȫ��ѧ��
	 * @author LI JIA
	 *
	 */
	public List<Student> getAllStudent(){
		return new StudentDao().getAllStudent();
	}
	
	
	/**
	 * ���һ��ѧ��
	 * @param student
	 */
	public void addStudent(Student student){
		new StudentDao().addStudent(student);
	}
	
	
	/**
	 * ͨ��ID����ѧ��
	 * @param student
	 * @return 
	 */
	public Student getByID(int id){
		return new StudentDao().getById(id);
	}
	
	/**
	 * ͨ��ID�޸�ѧ����Ϣ
	 * @param student
	 */
	public void modiftStudent(Student student){
		System.out.println(student.getName());
		new StudentDao().modifyStudent(student);
	}
	
	/**
	 * ͨ��IDɾ��ѧ��
	 * @param id
	 */
	public void delStudent(int id){
		new StudentDao().delStudent(id);
	}
}
