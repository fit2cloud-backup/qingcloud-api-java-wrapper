package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudJob;
import com.google.gson.Gson;

public class DescribeJobsResponse {
	private String action;
	private List<QingCloudJob> job_set;
	private Integer ret_code;
	private Integer total_count;
	private String message;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudJob> getJob_set() {
		return job_set;
	}

	public void setJob_set(List<QingCloudJob> job_set) {
		this.job_set = job_set;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static DescribeJobsResponse fromJson(String jsonDescribeJobsResponse){
		Gson gson = new Gson();
		DescribeJobsResponse describeJobsResponse = gson.fromJson(jsonDescribeJobsResponse, DescribeJobsResponse.class);
		return describeJobsResponse;
	}

}
