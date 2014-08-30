package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class UpdateLoadBalancersResponse {
	
	public static UpdateLoadBalancersResponse fromJson(String jsonUpdateLoadBalancersResponse){
		Gson gson = new Gson();
		UpdateLoadBalancersResponse updateLoadBalancersResponse = gson.fromJson(jsonUpdateLoadBalancersResponse, UpdateLoadBalancersResponse.class);
		return updateLoadBalancersResponse;
	}

}
