package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteLoadBalancerListenersResponse {
	
	public static DeleteLoadBalancerListenersResponse fromJson(String jsonDeleteLoadBalancerListenersResponse){
		Gson gson = new Gson();
		DeleteLoadBalancerListenersResponse deleteLoadBalancerListenersResponse = gson.fromJson(jsonDeleteLoadBalancerListenersResponse, DeleteLoadBalancerListenersResponse.class);
		return deleteLoadBalancerListenersResponse;
	}

}
