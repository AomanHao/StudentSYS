package com.duang.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.duang.model.User;
import com.duang.util.HibernateSessionFactory;

public class UserDao {

	/**
	 * ��ȡ�û���Ϣ�б�
	 * @return
	 */
	public List<User> getAllUser(){
		String hql="from User";
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<User> list=query.list();
		tran.commit();
		session.close();
		for(User user:list){
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getPwd());
		}
		return list;
	}
	
	/**
	 * ����û�
	 * @param user
	 */
	public void addUser(User user){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.save(user);
		tran.commit();
		session.close();
	}
	
	/**
	 * ͨ��id�����û�
	 * @param id
	 * @return
	 */
	public User getById(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		User usr=(User) session.get(User.class, id);
		tran.commit();
		session.close();
		System.out.println(usr.getId());
		System.out.println(usr.getName());
		// ? System.out.println(stu.getBanji().getCode());
		return usr;
	}
	
	/**
	 * �޸��û���Ϣ
	 * @param user
	 */
	public void modifyUser(User user){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		System.out.println(user.getId());
		session.update(user);
		tran.commit();
		session.close();
	}
	
	/**
	 * ɾ���û�
	 * @param id
	 */
	public void delUser(int id){
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		session.delete(new User(id));
		tran.commit();
		session.close();
	}
	
	public List<User> login(String name,String pwd){
		String hql="from User";
		Session session=HibernateSessionFactory.getSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<User> list=query.list();
		tran.commit();
		session.close();
		for(User user:list){
			System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getPwd());
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserDao().getAllUser();
	}

}
