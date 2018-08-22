package com.duang.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Grade;
import com.duang.util.HibernateSessionFactory;

public class GradeDao {
	
	/**
	 * 查询全部学生成绩
	 * @return
	 */
	public List<Grade> getAll(){
		String hql="from Grade";
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Grade> list=query.list();
		tran.commit();
		session.close();
		for(Grade grade:list){
			System.out.println(grade.getId()+"\t"+grade.getStudent().getName()+"\t"+grade.getScore());
		}
		return list;
	}
	
	public List<Grade> getAllOrderByExamId(){
		String hql="from Grade order by exam_id";
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Grade> list=query.list();
		tran.commit();
		session.close();
		for(Grade grade:list){
			System.out.println(grade.getExam().getName()+"\t"+grade.getStudent().getName()+"\t"+grade.getScore());
		}
		return list;
	}
	
	public List<Grade> getAllOrderByStuId(){
		String hql="from Grade order by stu_id";
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Grade> list=query.list();
		tran.commit();
		session.close();
		for(Grade grade:list){
			System.out.println(grade.getExam().getName()+"\t"+grade.getStudent().getName()+"\t"+grade.getScore());
		}
		return list;
	}
	
	public void addGrade(Grade grade){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.save(grade);
		tran.commit();
		session.close();
	}
	
	public Grade getById(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Grade grade=(Grade) session.get(Grade.class, id);
		tran.commit();
		session.close();
		return grade;
	}
	
	/**
	 * 通过ID修改
	 * @param student
	 */
	public void modifyGrade(Grade grade){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println(grade.getId());
		session.update(grade);
		tran.commit();
		session.close();
	}
	
	/**
	 * 通过ID删除
	 * @param id
	 */
	public void delGrade(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.delete(new Grade(id));
		tran.commit();
		session.close();
	}
	
	public static void main(String[] args) {
		new GradeDao().getAllOrderByExamId();
	}
}
