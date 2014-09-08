package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudRouterVxnet {
	private String router_id;
	private String vxnet_id;
	private String manager_ip;
	private String ip_network;
	private String dyn_ip_start;
	private String dyn_ip_end;
	private Integer features;
	private String create_time;
	public String getRouter_id() {
		return router_id;
	}
	public void setRouter_id(String router_id) {
		this.router_id = router_id;
	}
	public String getVxnet_id() {
		return vxnet_id;
	}
	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}
	public String getManager_ip() {
		return manager_ip;
	}
	public void setManager_ip(String manager_ip) {
		this.manager_ip = manager_ip;
	}
	public String getIp_network() {
		return ip_network;
	}
	public void setIp_network(String ip_network) {
		this.ip_network = ip_network;
	}
	public String getDyn_ip_start() {
		return dyn_ip_start;
	}
	public void setDyn_ip_start(String dyn_ip_start) {
		this.dyn_ip_start = dyn_ip_start;
	}
	public String getDyn_ip_end() {
		return dyn_ip_end;
	}
	public void setDyn_ip_end(String dyn_ip_end) {
		this.dyn_ip_end = dyn_ip_end;
	}
	public Integer getFeatures() {
		return features;
	}
	public void setFeatures(Integer features) {
		this.features = features;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "QingCloudRouterVxnet [router_id=" + router_id + ", vxnet_id="
				+ vxnet_id + ", manager_ip=" + manager_ip + ", ip_network="
				+ ip_network + ", dyn_ip_start=" + dyn_ip_start
				+ ", dyn_ip_end=" + dyn_ip_end + ", features=" + features
				+ ", create_time=" + create_time + "]";
	}
}
