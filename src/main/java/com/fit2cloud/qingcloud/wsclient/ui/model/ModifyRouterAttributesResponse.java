package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyRouterAttributesResponse {
	
	public static ModifyRouterAttributesResponse fromJson(String jsonModifyRouterAttributesResponse){
		Gson gson = new Gson();
		ModifyRouterAttributesResponse modifyRouterAttributesResponse = gson.fromJson(jsonModifyRouterAttributesResponse, ModifyRouterAttributesResponse.class);
		return modifyRouterAttributesResponse;
	}

}
