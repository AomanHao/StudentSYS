package com.duang.action;

import java.util.List;

import com.duang.model.Student;
import com.duang.model.Class;
import com.duang.service.ClassService;
import com.duang.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * action�������� ������
 * ������������:�������ݣ��������ݣ���װ���ݣ���ת��ҳ��
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
	 * ��ȡȫ��ѧ��
	 * @author LI JIA
	 *
	 */
	public String getAllStudent(){
		StudentService service=new StudentService();
		list=service.getAllStudent();
		return SUCCESS;
	}
	
	/**
	 * Ԥ���ѧ��
	 * @author LI JIA
	 *
	 */
	public String preAddStudent(){
		ClassService classService=new ClassService();
		this.classList=classService.getAllClass();
		return SUCCESS;
	}
	
	/**
	 * ���ѧ��
	 * @author LI JIA
	 *
	 */
	public String addStudent(){
		StudentService studentService=new StudentService();
		studentService.addStudent(student);
		return this.getAllStudent();//����getAllStudent�Ƿ�ֹ���غ��б���û��ѧ����Ϣ��
	}


	/**
	 * ׼���޸�ѧ����Ϣ����ת���޸�ѧ����Ϣҳ��
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
	 * �޸�ѧ����Ϣ
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
	 * ɾ��ѧ����Ϣ
	 * @return
	 */
	public String delStudent(){
		StudentService service=new StudentService();
		service.delStudent(student.getId());
		return this.getAllStudent();
	}
	
	/**
	 * �鿴ѧ����ϸ��Ϣ
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
