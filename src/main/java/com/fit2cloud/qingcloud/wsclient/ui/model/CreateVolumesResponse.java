package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class CreateVolumesResponse {
	
	private String action;
	private String job_id;
	private List<String> volumes;
	private Integer ret_code;
	private String message;
	
	public static CreateVolumesResponse fromJson(String jsonCreateVolumesResponse){
		Gson gson = new Gson();
		CreateVolumesResponse createVolumesResponse = gson.fromJson(jsonCreateVolumesResponse, CreateVolumesResponse.class);
		return createVolumesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public List<String> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
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
