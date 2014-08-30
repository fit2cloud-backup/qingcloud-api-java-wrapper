package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteLoadBalancersResponse {
	
	public static DeleteLoadBalancersResponse fromJson(String jsonDeleteLoadBalancersResponse){
		Gson gson = new Gson();
		DeleteLoadBalancersResponse deleteLoadBalancersResponse = gson.fromJson(jsonDeleteLoadBalancersResponse, DeleteLoadBalancersResponse.class);
		return deleteLoadBalancersResponse;
	}

}
