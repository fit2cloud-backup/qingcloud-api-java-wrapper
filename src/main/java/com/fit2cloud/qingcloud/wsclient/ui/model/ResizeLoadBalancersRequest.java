package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class ResizeLoadBalancersRequest extends Request {
	private List<String> loadbalancers;
	private Integer loadbalancer_type;
	private String zone;
	public List<String> getLoadbalancers() {
		return loadbalancers;
	}
	public void setLoadbalancers(List<String> loadbalancers) {
		this.loadbalancers = loadbalancers;
	}
	public Integer getLoadbalancer_type() {
		return loadbalancer_type;
	}
	public void setLoadbalancer_type(Integer loadbalancer_type) {
		this.loadbalancer_type = loadbalancer_type;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
