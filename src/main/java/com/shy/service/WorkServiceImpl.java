package com.shy.service;

import javax.annotation.Resource;

import com.shy.dao.WorkDao;
import com.shy.entity.Work;

public class WorkServiceImpl implements WorkService {

	@Resource  
	private WorkDao workDao;
	
	public WorkDao getWorkDao() {
		return workDao;
	}

	public void setWorkDao(WorkDao workDao) {
		this.workDao = workDao;
	}

	@Override
	public void addWork(Work work) {
		System.out.println("------WorkServiceImpl.addWork--------" + work.getName());
		workDao.addWork(work);
	}

	@Override
	public Work getWork(String id) {
		System.out.println("------workServiceImpl.getwork--------" + id);
		return workDao.getWork(id);
	}

	@Override
	public void updateWork(Work work) {
		
	}

	@Override
	public void deleteWork(Work work) {
		
	}

	

}
