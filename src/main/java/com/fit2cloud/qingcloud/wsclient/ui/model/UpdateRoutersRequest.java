package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class UpdateRoutersRequest extends Request {
	private List<String> routers;
	private String zone;

	public List<String> getRouters() {
		return routers;
	}

	public void setRouters(List<String> routers) {
		this.routers = routers;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
