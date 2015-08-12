package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DescribeZonesRequest extends Request {
	private List<String> zones;
	private List<String> status;

	public List<String> getZones() {
		return zones;
	}

	public void setZones(List<String> zones) {
		this.zones = zones;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}
}
