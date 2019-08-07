package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ResizeRouterRequest extends Request {
	private List<String> routers;
    private Integer router_type;
    private String owner;
    private String zone;

	public List<String> getRouters() {
		return routers;
	}

	public void setRouters(List<String> routers) {
		this.routers = routers;
	}

	public Integer getRouter_type() {
		return router_type;
	}

	public void setRouter_type(Integer router_type) {
		this.router_type = router_type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
