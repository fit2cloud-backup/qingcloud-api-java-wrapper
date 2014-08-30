package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class LeaveRouterResponse {
	
	public static LeaveRouterResponse fromJson(String jsonLeaveRouterResponse){
		Gson gson = new Gson();
		LeaveRouterResponse leaveRouterResponse = gson.fromJson(jsonLeaveRouterResponse, LeaveRouterResponse.class);
		return leaveRouterResponse;
	}

}
