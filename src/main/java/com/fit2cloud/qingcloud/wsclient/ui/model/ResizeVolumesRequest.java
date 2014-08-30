package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ResizeVolumesRequest extends Request {
	private List<String> volumes;
    private Integer size;
    private String zone;
    
	public List<String> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
    

}
