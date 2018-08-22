package com.duang.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Exam;
import com.duang.util.HibernateSessionFactory;

public class ExamDao {
	/**
	 * 得到所有
	 * @return
	 */
	public List<Exam> getAllExam(){
		String hql="from Exam";//from后面接的是类名，而不是数据库中的table名
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Exam> list=query.list();
		tran.commit();
		session.close();
		for(Exam exam:list){
			System.out.println(exam.getId()+"\t"+exam.getName()+"\t");
		}
		return list;
	}
	
	/**
	 * 添加
	 * @param student
	 */
	public void addExam(Exam exam){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.save(exam);
		tran.commit();
		session.close();
	}
	
	/**
	 * 通过ID查询
	 * @param id
	 * @return
	 */
	public Exam getById(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Exam exam=(Exam) session.get(Exam.class, id);
		tran.commit();
		session.close();
		System.out.println(exam.getId());
		System.out.println(exam.getName());
		return exam;
	}
	
	/**
	 * 通过ID修改
	 * @param student
	 */
	public void modifyExam(Exam exam){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println(exam.getId());
		session.update(exam);
		tran.commit();
		session.close();
	}
	
	/**
	 * 通过ID删除
	 * @param id
	 */
	public void delExam(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.delete(new Exam(id));
		tran.commit();
		session.close();
	}
	
}
