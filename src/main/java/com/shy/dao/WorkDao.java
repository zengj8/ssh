package com.shy.dao;

import com.shy.entity.Work;

public interface WorkDao {
	
	public void addWork(Work work);
	public Work getWork(String Id);
	public void updateWork(Work work);
	public void deleteWork(Work work);
	
}
