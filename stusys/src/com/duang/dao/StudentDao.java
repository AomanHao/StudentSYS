package com.duang.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Student;
import com.duang.util.HibernateSessionFactory;

public class StudentDao {

	/**
	 * �õ�����ѧ����Ϣ
	 * @return
	 */
	public List<Student> getAllStudent(){
		String hql="from Student";//from����ӵ������������������ݿ��е�table��
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Student> list=query.list();
		tran.commit();
		session.close();
		for(Student student:list){
			System.out.println(student.getId()+"\t"+student.getName()+"\t");
		}
		return list;
	}
	
	/**
	 * ���һ��ѧ��
	 * @param student
	 */
	public void addStudent(Student student){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.save(student);
		tran.commit();
		session.close();
	}
	
	/**
	 * ͨ��ID��ѯѧ����Ϣ
	 * @param id
	 * @return
	 */
	public Student getById(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, id);
		tran.commit();
		session.close();
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		// ? System.out.println(stu.getBanji().getCode());ͨ��lazy=��false�������
		return stu;
	}
	
	/**
	 * ͨ��ID�޸�ѧ����Ϣ
	 * @param student
	 */
	public void modifyStudent(Student student){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println(student.getId());
		session.update(student);
		tran.commit();
		session.close();
	}
	
	/**
	 * ͨ��IDɾ��ѧ����Ϣ
	 * @param id
	 */
	public void delStudent(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.delete(new Student(id));
		tran.commit();
		session.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentDao().getById(2);;
	}

}
