package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class PowerOffRoutersResponse {
	
	public static PowerOffRoutersResponse fromJson(String jsonPowerOffRoutersResponse){
		Gson gson = new Gson();
		PowerOffRoutersResponse powerOffRoutersResponse = gson.fromJson(jsonPowerOffRoutersResponse, PowerOffRoutersResponse.class);
		return powerOffRoutersResponse;
	}

}
