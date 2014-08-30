package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyVolumeAttributesResponse {
	
	private String action;
	private Integer ret_code;
	private String message;
	
	public static ModifyVolumeAttributesResponse fromJson(String jsonModifyVolumeAttributesResponse){
		Gson gson = new Gson();
		ModifyVolumeAttributesResponse modifyVolumeAttributesResponse = gson.fromJson(jsonModifyVolumeAttributesResponse, ModifyVolumeAttributesResponse.class);
		return modifyVolumeAttributesResponse;
	}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
