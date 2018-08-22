package com.duang.action;

import java.util.List;

import com.duang.model.Class;
import com.duang.model.Exam;
import com.duang.model.Grade;
import com.duang.model.Student;
import com.duang.service.ClassService;
import com.duang.service.ExamService;
import com.duang.service.GradeService;
import com.duang.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GradeAction extends ActionSupport implements ModelDriven<Grade>{

	private Grade grade=new Grade();
	List<Grade> list;
	List<Exam> examlist;
	List<Student> stulist;
	
	public List<Class> getClassList() {
		return classList;
	}

	public void setClassList(List<Class> classList) {
		this.classList = classList;
	}

	List<Class> classList;
	
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public List<Grade> getList() {
		return list;
	}

	public void setList(List<Grade> list) {
		this.list = list;
	}

	public List<Exam> getExamlist() {
		return examlist;
	}

	public void setExamlist(List<Exam> examlist) {
		this.examlist = examlist;
	}

	public List<Student> getStulist() {
		return stulist;
	}

	public void setStulist(List<Student> stulist) {
		this.stulist = stulist;
	}

	/**
	 * 获取全部
	 *
	 */
	public String getAllGrade(){
		GradeService service=new GradeService();
		list=service.getAllGrade();
		return SUCCESS;
	}
	
	public String getAllGradeOrderByExamId(){
		GradeService service=new GradeService();
		list=service.getAllOrderByExamId();
		return SUCCESS;
	}
	
	public String preModifyGrade(){
		GradeService service=new GradeService();
		int id=grade.getId();
		grade =service.getById(id);
		return SUCCESS;
	}
	
	
	public String getAllGradeOrderByStuId(){
		GradeService service=new GradeService();
		list=service.getAllOrderByStuId();
		return SUCCESS;
	}
	
	/**
	 * 预添加
	 *
	 */
	public String preAddGrade(){
		ExamService examService=new ExamService();
		StudentService studentService=new StudentService();
		//ClassService classService=new ClassService();
		this.examlist=examService.getAllExam();
		this.stulist=studentService.getAllStudent();
		//this.classList=classService.getAllClass();
		return SUCCESS;
	}
	
	/**
	 * 添加
	 *
	 */
	public String addGrade(){
		GradeService gradeService=new GradeService();
		gradeService.addGrade(grade);
		return this.getAllGrade();
	}


	/**
	 * 修改
	 * @param student
	 * @return
	 */
	public String modifyGrade(){
		GradeService service=new GradeService();
		service.modifyGrade(grade);
		return this.getAllGrade();
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String delGrade(){
		GradeService service=new GradeService();
		service.delGrade(grade.getId());
		return this.getAllGrade();
	}
	
	/**
	 * 查看详细信息
	 * @return
	 */
	public String getGradeInfoById(){
		GradeService service=new GradeService();
		grade=service.getById(grade.getId());
		
		return SUCCESS;
	}
	
	@Override
	public Grade getModel() {
		// TODO Auto-generated method stub
		return this.grade;
	}

}
