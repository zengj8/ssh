package com.shy.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.shy.entity.Work;
import com.shy.service.WorkService;

public class WorkAction extends ActionSupport {

	private Work work;
	
	@Resource  
	private WorkService workService;

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public WorkService getWorkService() {
		return workService;
	}

	public void setWorkService(WorkService workService) {
		this.workService = workService;
	}
	
	public String addWork() {
		System.out.println("-------workAction.addWork--------" + work.getName());
		
		workService.addWork(work);
		return "success";
	}
	
	public String updateWork() {
		System.out.println("-------WorkAction.updateWork--------" + work.getName());
		workService.updateWork(work);
		return "success";
	}
	
	public String deleteWork() {
		System.out.println("-------WorkAction.deleteWork--------" + work.getName());
		workService.deleteWork(work);
		return "success";
	}
	
}
