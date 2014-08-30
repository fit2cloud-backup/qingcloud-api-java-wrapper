package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateVxnetsResponse {
	
	public static CreateVxnetsResponse fromJson(String jsonCreateVxnetsResponse){
		Gson gson = new Gson();
		CreateVxnetsResponse createVxnetsResponse = gson.fromJson(jsonCreateVxnetsResponse, CreateVxnetsResponse.class);
		return createVxnetsResponse;
	}

}
