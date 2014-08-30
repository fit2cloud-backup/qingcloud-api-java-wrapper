package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DeleteImagesResponse {
	
	public static DeleteImagesResponse fromJson(String jsonDeleteImagesResponse){
		Gson gson = new Gson();
		DeleteImagesResponse deleteImagesResponse = gson.fromJson(jsonDeleteImagesResponse, DeleteImagesResponse.class);
		return deleteImagesResponse;
	}

}
