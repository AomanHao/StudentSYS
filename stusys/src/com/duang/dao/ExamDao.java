package com.duang.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Exam;
import com.duang.util.HibernateSessionFactory;

public class ExamDao {
	/**
	 * �õ�����
	 * @return
	 */
	public List<Exam> getAllExam(){
		String hql="from Exam";//from����ӵ������������������ݿ��е�table��
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
	 * ���
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
	 * ͨ��ID��ѯ
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
	 * ͨ��ID�޸�
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
	 * ͨ��IDɾ��
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
