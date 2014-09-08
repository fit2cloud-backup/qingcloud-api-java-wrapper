package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ModifyRouterStaticAttributesRequest extends Request {
	private String router_static;
	private String router_static_name;
	private String val1;
	private String val2;
	private String val3;
	private String val4;
	private String zone;
	public String getRouter_static() {
		return router_static;
	}
	public void setRouter_static(String router_static) {
		this.router_static = router_static;
	}
	public String getRouter_static_name() {
		return router_static_name;
	}
	public void setRouter_static_name(String router_static_name) {
		this.router_static_name = router_static_name;
	}
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
	public String getVal4() {
		return val4;
	}
	public void setVal4(String val4) {
		this.val4 = val4;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
