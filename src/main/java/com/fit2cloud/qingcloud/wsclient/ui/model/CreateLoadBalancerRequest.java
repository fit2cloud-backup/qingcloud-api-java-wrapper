package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class CreateLoadBalancerRequest extends Request {
    
	private List<String> eips;
	private Integer loadbalancer_type;
	private String loadbalancer_name;
	private String security_group;
	private String zone;
	private String vxnet;
	private String private_ip;
	private Integer mode;


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

	public String getVxnet() {
		return vxnet;
	}

	public void setVxnet(String vxnet) {
		this.vxnet = vxnet;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "CreateLoadBalancerRequest{" +
				"eips=" + eips +
				", loadbalancer_type=" + loadbalancer_type +
				", loadbalancer_name='" + loadbalancer_name + '\'' +
				", security_group='" + security_group + '\'' +
				", zone='" + zone + '\'' +
				", vxnet='" + vxnet + '\'' +
				", mode='" + mode + '\'' +
				'}';
	}

	public String getPrivate_ip() {
		return private_ip;
	}

	public void setPrivate_ip(String private_ip) {
		this.private_ip = private_ip;
	}
}
