package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyLoadBalancerListenerAttributesResponse {
	
	public static ModifyLoadBalancerListenerAttributesResponse fromJson(String jsonModifyLoadBalancerListenerAttributesResponse){
		Gson gson = new Gson();
		ModifyLoadBalancerListenerAttributesResponse modifyLoadBalancerListenerAttributesResponse = gson.fromJson(jsonModifyLoadBalancerListenerAttributesResponse, ModifyLoadBalancerListenerAttributesResponse.class);
		return modifyLoadBalancerListenerAttributesResponse;
	}

}
