package com.shy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shy.entity.Work;

public class WorkDaoImpl implements WorkDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addWork(Work work) {
		
	}

	@Override
	public Work getWork(String Id) {
		return null;
	}

	@Override
	public void updateWork(Work work) {
		
	}

	@Override
	public void deleteWork(Work work) {
		
	}

}
