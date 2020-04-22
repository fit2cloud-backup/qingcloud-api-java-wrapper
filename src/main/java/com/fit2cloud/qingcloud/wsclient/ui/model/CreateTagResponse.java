package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;


public class CreateTagResponse {
	private String action;
	private String tag_id;
	private Integer ret_code;
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

	public String getTag_id() {
		return tag_id;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static CreateTagResponse fromJson(String jsonCreateSnapshotsResponse){
		Gson gson = new Gson();
		CreateTagResponse createSnapshotsResponse = gson.fromJson(jsonCreateSnapshotsResponse, CreateTagResponse.class);
		return createSnapshotsResponse;
	}

}
