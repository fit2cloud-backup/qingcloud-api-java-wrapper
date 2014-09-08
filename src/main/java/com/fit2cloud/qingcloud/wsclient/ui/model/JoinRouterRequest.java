package com.fit2cloud.qingcloud.wsclient.ui.model;



public class JoinRouterRequest extends Request {
	private String vxnet;
	private String router;
	private String ip_network;
	private Integer features;
	private String zone;
	public String getVxnet() {
		return vxnet;
	}
	public void setVxnet(String vxnet) {
		this.vxnet = vxnet;
	}
	public String getRouter() {
		return router;
	}
	public void setRouter(String router) {
		this.router = router;
	}
	public String getIp_network() {
		return ip_network;
	}
	public void setIp_network(String ip_network) {
		this.ip_network = ip_network;
	}
	public Integer getFeatures() {
		return features;
	}
	public void setFeatures(Integer features) {
		this.features = features;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
