package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterStatics;


public class AddRouterStaticsRequest extends Request {
	private String router;
	private List<QingCloudRouterStatics> statics;
	private String zone;
	public String getRouter() {
		return router;
	}
	public void setRouter(String router) {
		this.router = router;
	}
	public List<QingCloudRouterStatics> getStatics() {
		return statics;
	}
	public void setStatics(List<QingCloudRouterStatics> statics) {
		this.statics = statics;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	} 
	
}
