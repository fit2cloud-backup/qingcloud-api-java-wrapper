package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateRoutersResponse {
	
	public static CreateRoutersResponse fromJson(String jsonCreateRoutersResponse){
		Gson gson = new Gson();
		CreateRoutersResponse createRoutersResponse = gson.fromJson(jsonCreateRoutersResponse, CreateRoutersResponse.class);
		return createRoutersResponse;
	}

}
