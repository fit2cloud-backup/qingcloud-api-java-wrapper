package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;
import java.util.List;

/**
 * {"action":"DeleteKeyPairsResponse","job_id":"j-0oja1f6w","ret_code":0}
 * @author jason
 *
 */
public class DeleteKeyPairsResponse {
	private String action;
	private List<String> keypairs;
	private Integer ret_code;
	private String message;
	
	/**
	 * {
			  "action":"DeleteKeyPairsResponse",
			  "keypairs":[
			    "kp-2yjg8qnj",
			    "kp-ld23cdzc"
			  ],
			  "ret_code":0
		}
	 * @param jsonDeleteKeyPairsResponse
	 * @return DeleteKeyPairsResponse
	 */
	public static DeleteKeyPairsResponse fromJson(String jsonDeleteKeyPairsResponse){
		Gson gson = new Gson();
		DeleteKeyPairsResponse deleteKeyPairsResponse = gson.fromJson(jsonDeleteKeyPairsResponse, DeleteKeyPairsResponse.class);
		return deleteKeyPairsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getKeypairs() {
		return keypairs;
	}

	public void setKeypairs(List<String> keypairs) {
		this.keypairs = keypairs;
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
