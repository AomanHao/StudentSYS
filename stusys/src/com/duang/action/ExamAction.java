package com.duang.action;

import java.util.List;

import com.duang.model.Exam;
import com.duang.service.ExamService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * action的作用是 控制器
 * 控制器的作用:接收数据，整理数据，封装数据，跳转到页面
 * @author LI JIA
 *
 */


public class ExamAction  extends ActionSupport implements ModelDriven<Exam>{
	
	List<Exam> list;
	private Exam exam=new Exam();

	public List<Exam> getList() {
		return list;
	}

	public void setList(List<Exam> list) {
		this.list = list;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	/**
	 * 获取全部
	 * @author LI JIA
	 *
	 */
	public String getAllExam(){
		ExamService service=new ExamService();
		list=service.getAllExam();
		return SUCCESS;
	}
	

	/**
	 * 添加
	 * @author LI JIA
	 *
	 */
	public String addExam(){
		ExamService studentService=new ExamService();
		studentService.addExam(exam);
		return this.getAllExam();
	}


	/**
	 * 准备修改信息，跳转到修改信息页面
	 * @return
	 */
	public String preModifyExam(){
		ExamService service=new ExamService();
		int id=exam.getId();
		exam =service.getByID(id);
		return SUCCESS;
	}
	
	/**
	 * 修改
	 * @param student
	 * @return
	 */
	public String modifyExam(){
		ExamService service=new ExamService();
		//System.out.println(student.getId());
		service.modiftExam(exam);
		return this.getAllExam();
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String delExam(){
		ExamService service=new ExamService();
		service.delExam(exam.getId());
		return this.getAllExam();
	}
	
	/**
	 * 查看详细信息
	 * @return
	 */
	public String getExamInfoById(){
		ExamService service=new ExamService();
		exam=service.getByID(exam.getId());
		
		return SUCCESS;
	}
	
	@Override
	public Exam getModel() {
		// TODO Auto-generated method stub
		return this.exam;
	}
}
