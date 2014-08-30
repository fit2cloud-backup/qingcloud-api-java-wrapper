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
public class CreateKeyPairResponse {
	private String action;
	private String private_key;
	private String keypair_id;
	private Integer ret_code;
	private String message;
    
	/**
	 * {
		  "action":"CreateKeyPairResponse",
		  "private_key":"-----BEGIN DSA PRIVATE KEY-----....",
		  "keypair_id":"kp-z0goby7d",
		  "ret_code":0
		}
	 * @param jsonRunInstancesResponse
	 * @return CreateKeyPairResponse
	 */
	public static CreateKeyPairResponse fromJson(String jsonCreateKeyPairResponse){
		Gson gson = new Gson();
		CreateKeyPairResponse createKeyPairResponse = gson.fromJson(jsonCreateKeyPairResponse, CreateKeyPairResponse.class);
		return createKeyPairResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPrivate_key() {
		return private_key;
	}

	public void setPrivate_key(String private_key) {
		this.private_key = private_key;
	}

	public String getKeypair_id() {
		return keypair_id;
	}

	public void setKeypair_id(String keypair_id) {
		this.keypair_id = keypair_id;
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
