package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ApplySnapshotsResponse {
	private String action;
	private Integer ret_code;
	private String job_id;
	private String message;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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
	public static ApplySnapshotsResponse fromJson(String jsonApplySnapshotsResponse){
		Gson gson = new Gson();
		ApplySnapshotsResponse applySnapshotsResponse = gson.fromJson(jsonApplySnapshotsResponse, ApplySnapshotsResponse.class);
		return applySnapshotsResponse;
	}

}
