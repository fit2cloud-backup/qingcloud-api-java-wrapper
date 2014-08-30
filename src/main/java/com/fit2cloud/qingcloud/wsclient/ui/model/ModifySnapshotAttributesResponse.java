package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifySnapshotAttributesResponse {
	
	public static ModifySnapshotAttributesResponse fromJson(String jsonModifySnapshotAttributesResponse){
		Gson gson = new Gson();
		ModifySnapshotAttributesResponse modifySnapshotAttributesResponse = gson.fromJson(jsonModifySnapshotAttributesResponse, ModifySnapshotAttributesResponse.class);
		return modifySnapshotAttributesResponse;
	}

}
