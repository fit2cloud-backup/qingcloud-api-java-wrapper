package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteVxnetsResponse {
	
	public static DeleteVxnetsResponse fromJson(String jsonDeleteVxnetsResponse){
		Gson gson = new Gson();
		DeleteVxnetsResponse deleteVxnetsResponse = gson.fromJson(jsonDeleteVxnetsResponse, DeleteVxnetsResponse.class);
		return deleteVxnetsResponse;
	}

}
