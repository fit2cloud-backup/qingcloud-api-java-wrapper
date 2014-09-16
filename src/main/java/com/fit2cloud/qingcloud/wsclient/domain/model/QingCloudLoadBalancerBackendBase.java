package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudLoadBalancerBackendBase {
	private String resource_id;
	private String loadbalancer_backend_name;
	private Integer port;
	private Integer weight;
	public String getResource_id() {
		return resource_id;
	}
	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}
	public String getLoadbalancer_backend_name() {
		return loadbalancer_backend_name;
	}
	public void setLoadbalancer_backend_name(String loadbalancer_backend_name) {
		this.loadbalancer_backend_name = loadbalancer_backend_name;
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
