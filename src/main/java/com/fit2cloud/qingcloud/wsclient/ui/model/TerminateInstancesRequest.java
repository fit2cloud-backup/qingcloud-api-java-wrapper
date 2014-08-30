package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class TerminateInstancesRequest extends Request {
    private List<String> instances;
    private String zone;

	public List<String> getInstances() {
		return instances;
	}

	public void setInstances(List<String> instances) {
		this.instances = instances;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
