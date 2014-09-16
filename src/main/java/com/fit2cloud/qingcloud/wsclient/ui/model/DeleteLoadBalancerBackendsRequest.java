package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DeleteLoadBalancerBackendsRequest extends Request {
	private List<String> loadbalancer_backends;
	private String zone;

	public List<String> getLoadbalancer_backends() {
		return loadbalancer_backends;
	}

	public void setLoadbalancer_backends(List<String> loadbalancer_backends) {
		this.loadbalancer_backends = loadbalancer_backends;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
