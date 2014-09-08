package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class ModifyRouterAttributesRequest extends Request {
	private String router;
	private String eip;
	private String security_group;
	private String router_name;
	private String description;
	private String zone;

	public String getRouter() {
		return router;
	}

	public void setRouter(String router) {
		this.router = router;
	}

	public String getEip() {
		return eip;
	}

	public void setEip(String eip) {
		this.eip = eip;
	}

	public String getSecurity_group() {
		return security_group;
	}

	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}

	public String getRouter_name() {
		return router_name;
	}

	public void setRouter_name(String router_name) {
		this.router_name = router_name;
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
