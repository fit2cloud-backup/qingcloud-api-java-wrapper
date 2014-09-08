package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteRouterStaticsRequest extends Request {
    
	private List<String> router_statics;
	private String zone;
	public List<String> getRouter_statics() {
		return router_statics;
	}
	public void setRouter_statics(List<String> router_statics) {
		this.router_statics = router_statics;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
