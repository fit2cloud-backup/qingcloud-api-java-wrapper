package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.Map;

public class QingCloudJob {
	private String job_id;
	private String job_action;
	private String create_time;
	private Map<String, Object> resources;
	private String owner;
	private String status;
	private String status_time;
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_action() {
		return job_action;
	}
	public void setJob_action(String job_action) {
		this.job_action = job_action;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Map<String, Object> getResources() {
		return resources;
	}
	public void setResources(Map<String, Object> resources) {
		this.resources = resources;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus_time() {
		return status_time;
	}
	public void setStatus_time(String status_time) {
		this.status_time = status_time;
	}
}
