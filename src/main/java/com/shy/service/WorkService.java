package com.shy.service;

import com.shy.entity.Work;

public interface WorkService {
	
	public void addWork(Work work);
	public Work getWork(String id);
	public void updateWork(Work work);
	public void deleteWork(Work work);
	
}
