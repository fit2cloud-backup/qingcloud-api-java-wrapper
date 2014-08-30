package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

/**
 * {
 *  "action":"RunInstancesResponse",
 *  "instances":["i-5qyeem9d"],
 *  "job_id":"j-lz8jp11b",
 *  "ret_code":0
 *  }
 *  {
 *   "message":"PermissionDenied, access denied for zone [pek1]",
 *   "ret_code":1400
 *  }
 * @author jason
 *
 */
public class RunInstancesResponse {
	private String action;
	private List<String> instances;
	private String job_id;
	private Integer ret_code;
	private String message;
    
	public static RunInstancesResponse fromJson(String jsonRunInstancesResponse){
		Gson gson = new Gson();
		RunInstancesResponse runInstancesResponse = gson.fromJson(jsonRunInstancesResponse, RunInstancesResponse.class);
		return runInstancesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getInstances() {
		return instances;
	}

	public void setInstances(List<String> instances) {
		this.instances = instances;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
