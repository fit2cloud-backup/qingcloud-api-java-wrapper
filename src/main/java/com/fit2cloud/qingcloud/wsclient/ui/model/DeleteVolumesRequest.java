package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteVolumesRequest extends Request {
	private List<String> volumes;
    private String zone;
    
	public List<String> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

	

}
