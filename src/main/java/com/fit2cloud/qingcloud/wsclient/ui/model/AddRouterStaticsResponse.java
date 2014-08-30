package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class AddRouterStaticsResponse {
	
	public static AddRouterStaticsResponse fromJson(String jsonAddRouterStaticsResponse){
		Gson gson = new Gson();
		AddRouterStaticsResponse addRouterStaticsResponse = gson.fromJson(jsonAddRouterStaticsResponse, AddRouterStaticsResponse.class);
		return addRouterStaticsResponse;
	}

}
