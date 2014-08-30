package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteRouterStaticsResponse {
	
	public static DeleteRouterStaticsResponse fromJson(String jsonDeleteRouterStaticsResponse){
		Gson gson = new Gson();
		DeleteRouterStaticsResponse deleteRouterStaticsResponse = gson.fromJson(jsonDeleteRouterStaticsResponse, DeleteRouterStaticsResponse.class);
		return deleteRouterStaticsResponse;
	}

}
