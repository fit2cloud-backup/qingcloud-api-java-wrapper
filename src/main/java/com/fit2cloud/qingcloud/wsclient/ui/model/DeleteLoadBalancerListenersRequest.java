package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DeleteLoadBalancerListenersRequest extends Request {

	private List<String> loadbalancer_listeners;
	private String zone;

	public List<String> getLoadbalancer_listeners() {
		return loadbalancer_listeners;
	}

	public void setLoadbalancer_listeners(List<String> loadbalancer_listeners) {
		this.loadbalancer_listeners = loadbalancer_listeners;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
