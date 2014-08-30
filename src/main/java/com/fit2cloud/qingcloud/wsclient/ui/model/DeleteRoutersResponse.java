package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteRoutersResponse {
	
	public static DeleteRoutersResponse fromJson(String jsonDeleteRoutersResponse){
		Gson gson = new Gson();
		DeleteRoutersResponse deleteRoutersResponse = gson.fromJson(jsonDeleteRoutersResponse, DeleteRoutersResponse.class);
		return deleteRoutersResponse;
	}

}
