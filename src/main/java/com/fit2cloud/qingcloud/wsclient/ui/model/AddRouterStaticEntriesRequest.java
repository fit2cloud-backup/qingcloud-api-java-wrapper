package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.RouterStaticEntry;

import java.util.List;


public class AddRouterStaticEntriesRequest extends Request {
	private String router_static;
	private List<RouterStaticEntry> entries;
	private List<String> val2;
	private String zone;

	public String getRouter_static() {
		return router_static;
	}

	public void setRouter_static(String router_static) {
		this.router_static = router_static;
	}

	public List<RouterStaticEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<RouterStaticEntry> entries) {
		this.entries = entries;
	}

	public List<String> getVal2() {
		return val2;
	}

	public void setVal2(List<String> val2) {
		this.val2 = val2;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
