package com.duang.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Class;
import com.duang.util.HibernateSessionFactory;

public class ClassDao {

	public List<com.duang.model.Class> getAllClass(){
		String hql="from Class";//from后面接的是类名，而不是数据库中的table名
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<com.duang.model.Class> list=query.list();
		tran.commit();
		session.close();
		for(com.duang.model.Class classes:list){
			System.out.println(classes.getId()+"\t"+classes.getName()+"\t");
		}
		return list;
	}
	
	
	/**
	 * 添加一个班级
	 * @param classes
	 */
	public void addClass(com.duang.model.Class banji){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.save(banji);
		tran.commit();
		session.close();
	}
	
	
	/**
	 * 通过id查询班级
	 * @param id
	 * @return
	 */
	public com.duang.model.Class getClassById(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		com.duang.model.Class banji=(com.duang.model.Class) session.get(com.duang.model.Class.class, id);
		tran.commit();
		session.close();
		System.out.println(banji.getId());
		System.out.println(banji.getName());
		return banji;
	}
	
	
	/**
	 * 修改班级信息
	 * @param classes
	 */
	public void modifyClass(com.duang.model.Class banji){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println(banji.getId());
		session.update(banji);
		tran.commit();
		session.close();
	}
	
	
	/**
	 * 通过id删除班级
	 * @param id
	 */
	public void delClass(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.delete(new com.duang.model.Class(id));
		tran.commit();
		session.close();
	}
	
	public static void main(String[] args) {
		new ClassDao().getAllClass();
	}
}
