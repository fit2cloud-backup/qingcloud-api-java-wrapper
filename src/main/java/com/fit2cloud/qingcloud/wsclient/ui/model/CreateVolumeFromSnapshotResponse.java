package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateVolumeFromSnapshotResponse {
	
	public static CreateVolumeFromSnapshotResponse fromJson(String jsonCreateVolumeFromSnapshotResponse){
		Gson gson = new Gson();
		CreateVolumeFromSnapshotResponse createVolumeFromSnapshotResponse = gson.fromJson(jsonCreateVolumeFromSnapshotResponse, CreateVolumeFromSnapshotResponse.class);
		return createVolumeFromSnapshotResponse;
	}

}
