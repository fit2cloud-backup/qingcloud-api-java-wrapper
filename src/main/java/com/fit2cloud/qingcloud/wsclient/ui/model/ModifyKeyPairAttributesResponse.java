package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

/**
 * 
 * @author jason
 *
 */
public class ModifyKeyPairAttributesResponse {
	private String action;
	private Integer ret_code;
	private String message;
    
	/**
	 * {
		  "action":"ModifyKeyPairAttributesResponse",
		  "ret_code":0
		}
	 * @param jsonRunInstancesResponse
	 * @return CreateKeyPairResponse
	 */
	public static ModifyKeyPairAttributesResponse fromJson(String jsonModifyKeyPairAttributesResponse){
		Gson gson = new Gson();
		ModifyKeyPairAttributesResponse modifyKeyPairAttributesResponse = gson.fromJson(jsonModifyKeyPairAttributesResponse, 
				ModifyKeyPairAttributesResponse.class);
		return modifyKeyPairAttributesResponse;
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
