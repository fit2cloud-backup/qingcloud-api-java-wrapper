package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class AttachVolumesRequest extends Request {
	private List<String> volumes;
    private String instance;
    private String zone;
    
	public List<String> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
}
