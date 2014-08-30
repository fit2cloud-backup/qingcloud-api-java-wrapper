package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyLoadBalancerAttributesResponse {
	
	public static ModifyLoadBalancerAttributesResponse fromJson(String jsonModifyLoadBalancerAttributesResponse){
		Gson gson = new Gson();
		ModifyLoadBalancerAttributesResponse modifyLoadBalancerAttributesResponse = gson.fromJson(jsonModifyLoadBalancerAttributesResponse, ModifyLoadBalancerAttributesResponse.class);
		return modifyLoadBalancerAttributesResponse;
	}

}
