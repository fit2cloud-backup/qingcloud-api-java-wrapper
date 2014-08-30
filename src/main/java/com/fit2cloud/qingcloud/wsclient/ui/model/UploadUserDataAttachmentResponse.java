package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class UploadUserDataAttachmentResponse {
	
	public static UploadUserDataAttachmentResponse fromJson(String jsonUploadUserDataAttachmentResponse){
		Gson gson = new Gson();
		UploadUserDataAttachmentResponse uploadUserDataAttachmentResponse = gson.fromJson(jsonUploadUserDataAttachmentResponse, UploadUserDataAttachmentResponse.class);
		return uploadUserDataAttachmentResponse;
	}

}
