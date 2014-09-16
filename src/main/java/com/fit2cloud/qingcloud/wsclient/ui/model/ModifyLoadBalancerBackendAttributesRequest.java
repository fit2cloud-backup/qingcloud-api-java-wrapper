package com.fit2cloud.qingcloud.wsclient.ui.model;

public class ModifyLoadBalancerBackendAttributesRequest extends Request {

	private String loadbalancer_backend;
	private String zone;
	private Integer port;
	private Integer weight;

	public String getLoadbalancer_backend() {
		return loadbalancer_backend;
	}

	public void setLoadbalancer_backend(String loadbalancer_backend) {
		this.loadbalancer_backend = loadbalancer_backend;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
