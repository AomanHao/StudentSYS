package com.duang.action;

import java.util.List;

import com.duang.model.Student;
import com.duang.model.Class;
import com.duang.service.ClassService;
import com.duang.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * action的作用是 控制器
 * 控制器的作用:接收数据，整理数据，封装数据，跳转到页面
 * @author LI JIA
 *
 */


public class StudentAction  extends ActionSupport implements ModelDriven<Student>{
	
	List<Student> list;
	List<Class> classList;
	private Student student=new Student();
	
	public List<Class> getClassList() {
		return classList;
	}

	public void setClassList(List<Class> classList) {
		this.classList = classList;
	}

	
	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * 获取全部学生
	 * @author LI JIA
	 *
	 */
	public String getAllStudent(){
		StudentService service=new StudentService();
		list=service.getAllStudent();
		return SUCCESS;
	}
	
	/**
	 * 预添加学生
	 * @author LI JIA
	 *
	 */
	public String preAddStudent(){
		ClassService classService=new ClassService();
		this.classList=classService.getAllClass();
		return SUCCESS;
	}
	
	/**
	 * 添加学生
	 * @author LI JIA
	 *
	 */
	public String addStudent(){
		StudentService studentService=new StudentService();
		studentService.addStudent(student);
		return this.getAllStudent();//返回getAllStudent是防止返回后列表中没有学生信息了
	}


	/**
	 * 准备修改学生信息，跳转到修改学生信息页面
	 * @return
	 */
	public String preModifyStudent(){
		StudentService service=new StudentService();
		int id=student.getId();
		student =service.getByID(id);
		ClassService classService=new ClassService();
		this.classList=classService.getAllClass();
		return SUCCESS;
	}
	
	/**
	 * 修改学生信息
	 * @param student
	 * @return
	 */
	public String modifyStudent(){
		StudentService service=new StudentService();
		//System.out.println(student.getId());
		service.modiftStudent(student);
		return this.getAllStudent();
	}
	
	/**
	 * 删除学生信息
	 * @return
	 */
	public String delStudent(){
		StudentService service=new StudentService();
		service.delStudent(student.getId());
		return this.getAllStudent();
	}
	
	/**
	 * 查看学生详细信息
	 * @return
	 */
	public String getStudentInfoById(){
		StudentService service=new StudentService();
		student=service.getByID(student.getId());
		
		return SUCCESS;
	}
	
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return this.student;
	}
}
