package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class JoinRouterResponse {
	
	public static JoinRouterResponse fromJson(String jsonJoinRouterResponse){
		Gson gson = new Gson();
		JoinRouterResponse joinRouterResponse = gson.fromJson(jsonJoinRouterResponse, JoinRouterResponse.class);
		return joinRouterResponse;
	}

}
