package com.duang.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.Exam;
import com.duang.model.Student;
import com.duang.model.User;
import com.duang.model.Class;
import com.duang.util.HibernateSessionFactory;

public class test {
	public void testUser(){
		User user=new User("root","123456");
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(user);
		tran.commit();
		session.close();
	}
	
	
	public void testClass(){
		
		Class banji=new Class("����","123110102");
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(banji);
		tran.commit();
		session.close();
	}

	/*public void testClassAndStudent(){
		
		Class banji=new Class("һ��","123110101");
		
		Student student1=new Student("����", "��", 20,"13555555555","�ɶ��������");
		Student student2=new Student("����", "��", 21,"13666666666","�ɶ��н�ţ��");
		
		student1.setBanji(banji);
		student2.setBanji(banji);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		tran.commit();
		session.close();
	}*/
	
	/*public void testStudent(){
		//���ࣿ����
		Class banji=new Class("һ��","123110101");
		Student student1=new Student("����", "��", 20,"13555555777","�ɶ��������");

		student1.setBanji(banji);
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(student1);
		tran.commit();
		session.close();
	}
	*/
	public void testExam(){
		//ʱ�䣿
		Date startdate=new Date(2015, 03, 05, 14, 30, 00);
		Date enddate=new Date(2015, 03, 05, 14, 30, 00);
		Exam exam=new Exam("���ݽṹ",startdate,enddate,"һ��C201");
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		session.save(exam);
		tran.commit();
		session.close();
	}
	
	public void testGrade(){
		
	}
	public static void main(String[] args) {
		new test().testExam();
	}
}
 