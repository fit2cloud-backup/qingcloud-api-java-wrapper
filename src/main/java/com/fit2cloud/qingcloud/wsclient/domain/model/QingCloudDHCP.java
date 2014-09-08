package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudDHCP {
	private String val2;
	private String router_static_id;

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public String getRouter_static_id() {
		return router_static_id;
	}

	public void setRouter_static_id(String router_static_id) {
		this.router_static_id = router_static_id;
	}

	@Override
	public String toString() {
		return "QingCloudDHCP [val2=" + val2 + ", router_static_id="
				+ router_static_id + "]";
	}
}
