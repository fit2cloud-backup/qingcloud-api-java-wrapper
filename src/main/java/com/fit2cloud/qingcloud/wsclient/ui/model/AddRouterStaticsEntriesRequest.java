package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterStatics;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterStaticsEntries;

import java.util.List;


public class AddRouterStaticsEntriesRequest extends Request {
	private String router_static;
	private List<QingCloudRouterStaticsEntries> entries;
	private String zone;

	public String getRouter_static() {
		return router_static;
	}

	public void setRouter_static(String router_static) {
		this.router_static = router_static;
	}

	public List<QingCloudRouterStaticsEntries> getEntries() {
		return entries;
	}

	public void setEntries(List<QingCloudRouterStaticsEntries> entries) {
		this.entries = entries;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
