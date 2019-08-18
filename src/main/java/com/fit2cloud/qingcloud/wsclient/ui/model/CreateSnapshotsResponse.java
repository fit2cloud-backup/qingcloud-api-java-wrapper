package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class CreateSnapshotsResponse {
	private String action;
	private List<String> snapshots;
	private Integer ret_code;
	private String job_id;
	private String message;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getSnapshots() {
		return snapshots;
	}

	public void setSnapshots(List<String> snapshots) {
		this.snapshots = snapshots;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static CreateSnapshotsResponse fromJson(String jsonCreateSnapshotsResponse){
		Gson gson = new Gson();
		CreateSnapshotsResponse createSnapshotsResponse = gson.fromJson(jsonCreateSnapshotsResponse, CreateSnapshotsResponse.class);
		return createSnapshotsResponse;
	}

}
