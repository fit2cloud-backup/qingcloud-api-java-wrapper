package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class UpdateRoutersResponse {
	
	public static UpdateRoutersResponse fromJson(String jsonUpdateRoutersResponse){
		Gson gson = new Gson();
		UpdateRoutersResponse updateRoutersResponse = gson.fromJson(jsonUpdateRoutersResponse, UpdateRoutersResponse.class);
		return updateRoutersResponse;
	}

}
