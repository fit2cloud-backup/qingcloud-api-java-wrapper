package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeJobsRequest extends Request {
    
	private List<String> jobs;
	private List<String> status;
	private String job_action;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	public List<String> getJobs() {
		return jobs;
	}
	public void setJobs(List<String> jobs) {
		this.jobs = jobs;
	}
	public List<String> getStatus() {
		return status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}
	public String getJob_action() {
		return job_action;
	}
	public void setJob_action(String job_action) {
		this.job_action = job_action;
	}
	public Integer getVerbose() {
		return verbose;
	}
	public void setVerbose(Integer verbose) {
		this.verbose = verbose;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
