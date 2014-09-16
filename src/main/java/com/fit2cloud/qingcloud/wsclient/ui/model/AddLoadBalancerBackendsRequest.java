package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerBackendBase;

public class AddLoadBalancerBackendsRequest extends Request {
	private String loadbalancer_listener;
	private String zone;
	private List<QingCloudLoadBalancerBackendBase> backends;

	public String getLoadbalancer_listener() {
		return loadbalancer_listener;
	}

	public void setLoadbalancer_listener(String loadbalancer_listener) {
		this.loadbalancer_listener = loadbalancer_listener;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<QingCloudLoadBalancerBackendBase> getBackends() {
		return backends;
	}

	public void setBackends(List<QingCloudLoadBalancerBackendBase> backends) {
		this.backends = backends;
	}

}
