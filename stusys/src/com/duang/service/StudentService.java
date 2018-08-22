package com.duang.service;

import java.util.List;

import com.duang.dao.StudentDao;
import com.duang.model.Student;


public class StudentService {
	
	/**
	 * 获取全部学生
	 * @author LI JIA
	 *
	 */
	public List<Student> getAllStudent(){
		return new StudentDao().getAllStudent();
	}
	
	
	/**
	 * 添加一个学生
	 * @param student
	 */
	public void addStudent(Student student){
		new StudentDao().addStudent(student);
	}
	
	
	/**
	 * 通过ID查找学生
	 * @param student
	 * @return 
	 */
	public Student getByID(int id){
		return new StudentDao().getById(id);
	}
	
	/**
	 * 通过ID修改学生信息
	 * @param student
	 */
	public void modiftStudent(Student student){
		System.out.println(student.getName());
		new StudentDao().modifyStudent(student);
	}
	
	/**
	 * 通过ID删除学生
	 * @param id
	 */
	public void delStudent(int id){
		new StudentDao().delStudent(id);
	}
}
