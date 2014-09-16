package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class CreateLoadBalancerRequest extends Request {
    
	private List<String> eips;
	private Integer loadbalancer_type;
	private String loadbalancer_name;
	private String security_group;
	private String zone;
	public List<String> getEips() {
		return eips;
	}
	public void setEips(List<String> eips) {
		this.eips = eips;
	}
	public Integer getLoadbalancer_type() {
		return loadbalancer_type;
	}
	public void setLoadbalancer_type(Integer loadbalancer_type) {
		this.loadbalancer_type = loadbalancer_type;
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
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
}
