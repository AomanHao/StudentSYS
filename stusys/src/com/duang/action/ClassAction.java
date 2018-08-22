package com.duang.action;

import java.util.List;

import com.duang.model.Class;
import com.duang.service.ClassService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClassAction extends ActionSupport implements ModelDriven<com.duang.model.Class>{

	List<com.duang.model.Class> list;
	private com.duang.model.Class banji=new com.duang.model.Class();
	
	
	public List<com.duang.model.Class> getList() {
		return list;
	}


	public void setList(List<com.duang.model.Class> list) {
		this.list = list;
	}


	public com.duang.model.Class getBanji() {
		return banji;
	}


	public void setBanji(com.duang.model.Class banji) {
		this.banji = banji;
	}

	/**
	 * ��ȡȫ��
	 * @return
	 */
	public String getAllClass(){
		ClassService service=new ClassService();
		list=service.getAllClass();
		return "success";
	}
	
	/**
	 * ���
	 * @author LI JIA
	 *
	 */
	public String addClass(){
		ClassService classService=new ClassService();
		classService.addClass(banji);
		return this.getAllClass();
	}
	
	

	/**
	 * ɾ��
	 * @return
	 */
	public String delClass(){
		ClassService service=new ClassService();
		service.delClass(banji.getId());
		return this.getAllClass();
	}
	
	/**
	 * Ԥ�޸�
	 * @return
	 */
	public String preModifyClass(){
		ClassService service=new ClassService();
		banji=service.getByID(banji.getId());
		return SUCCESS;
	}
	
	
	/**
	 * �޸�
	 * @return
	 */
	public String modifyClass(){
		ClassService service=new ClassService();
		service.modiftClass(banji);
		return this.getAllClass();
	}
	
	@Override
	public Class getModel() {
		// TODO Auto-generated method stub
		return this.banji;
	}
	
	
}
