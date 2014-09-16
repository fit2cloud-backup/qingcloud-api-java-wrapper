package com.fit2cloud.qingcloud.wsclient.ui.model;



public class ModifyLoadBalancerAttributesRequest extends Request {
    
	private String loadbalancer;
	private String loadbalancer_name;
	private String security_group;
	private String description;
	private String zone;
	public String getLoadbalancer() {
		return loadbalancer;
	}
	public void setLoadbalancer(String loadbalancer) {
		this.loadbalancer = loadbalancer;
	}
	public String getLoadbalancer_name() {
		return loadbalancer_name;
	}
	public void setLoadbalancer_name(String loadbalancer_name) {
		this.loadbalancer_name = loadbalancer_name;
	}
	public String getSecurity_group() {
		return security_group;
	}
	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
}
