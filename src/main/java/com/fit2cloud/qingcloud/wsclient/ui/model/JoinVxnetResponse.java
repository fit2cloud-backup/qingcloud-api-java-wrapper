package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class JoinVxnetResponse {
	
	public static JoinVxnetResponse fromJson(String jsonJoinVxnetResponse){
		Gson gson = new Gson();
		JoinVxnetResponse joinVxnetResponse = gson.fromJson(jsonJoinVxnetResponse, JoinVxnetResponse.class);
		return joinVxnetResponse;
	}

}
