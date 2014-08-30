package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class LeaveVxnetResponse {
	
	public static LeaveVxnetResponse fromJson(String jsonLeaveVxnetResponse){
		Gson gson = new Gson();
		LeaveVxnetResponse leaveVxnetResponse = gson.fromJson(jsonLeaveVxnetResponse, LeaveVxnetResponse.class);
		return leaveVxnetResponse;
	}

}
