package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateRoutersRequest extends Request {

	private String router_name;
	private Integer count;
	private String security_group;
	private String zone;
	private Integer router_type;
	private String vpc_network;

	public String getRouter_name() {
		return router_name;
	}

	public void setRouter_name(String router_name) {
		this.router_name = router_name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getRouter_type() {
		return router_type;
	}

	public void setRouter_type(Integer router_type) {
		this.router_type = router_type;
	}

	public String getVpc_network() {
		return vpc_network;
	}

	public void setVpc_network(String vpc_network) {
		this.vpc_network = vpc_network;
	}
}
