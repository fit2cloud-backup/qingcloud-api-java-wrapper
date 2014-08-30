package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;
import java.util.List;

/**
 * 
 * @author jason
 *
 */
public class DettachKeyPairsResponse {
	private String action;
	private String job_id;
	private Integer ret_code;
	private String message;
	
	/**
	 * {
		  "action":"DetachKeyPairsResponse",
		  "job_id":"j-bm6ym3r8",
		  "ret_code":0
		}
	 * @param jsonDettachKeyPairsResponse
	 * @return DettachKeyPairsResponse
	 */
	public static DettachKeyPairsResponse fromJson(String jsonDettachKeyPairsResponse){
		Gson gson = new Gson();
		DettachKeyPairsResponse dettachKeyPairsResponse = gson.fromJson(jsonDettachKeyPairsResponse, DettachKeyPairsResponse.class);
		return dettachKeyPairsResponse;
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
