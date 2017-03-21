package com.shy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shy.entity.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void AddUser(User user) {
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().save(user);
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getName());
		getSession().update(user);
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ user.getName());
		getSession().delete(user);
	}

	@Override
	public User getUser(String id) {
		System.out.println("-------UserDaoImpl.getUser-----------"
				+ id);
		Integer num = Integer.parseInt(id);
		User u = (User)getSession().createQuery("select stu from User stu where id = ?")
                .setParameter(0, num)
                .uniqueResult();
		return u;
	}

}
