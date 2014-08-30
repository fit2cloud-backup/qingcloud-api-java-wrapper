package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteLoadBalancerBackendsResponse {
	
	public static DeleteLoadBalancerBackendsResponse fromJson(String jsonDeleteLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackendsResponse = gson.fromJson(jsonDeleteLoadBalancerBackendsResponse, DeleteLoadBalancerBackendsResponse.class);
		return deleteLoadBalancerBackendsResponse;
	}

}
