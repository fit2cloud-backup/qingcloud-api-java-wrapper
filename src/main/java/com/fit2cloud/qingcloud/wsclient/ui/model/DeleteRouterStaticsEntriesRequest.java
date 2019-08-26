package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteRouterStaticsEntriesRequest extends Request {
    
	private List<String> router_static_entries;
	private String zone;

	public List<String> getRouter_static_entries() {
		return router_static_entries;
	}

	public void setRouter_static_entries(List<String> router_static_entries) {
		this.router_static_entries = router_static_entries;
	}

	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
