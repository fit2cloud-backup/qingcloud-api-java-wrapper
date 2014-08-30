package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class PowerOnRoutersResponse {
	
	public static PowerOnRoutersResponse fromJson(String jsonPowerOnRoutersResponse){
		Gson gson = new Gson();
		PowerOnRoutersResponse powerOnRoutersResponse = gson.fromJson(jsonPowerOnRoutersResponse, PowerOnRoutersResponse.class);
		return powerOnRoutersResponse;
	}

}
