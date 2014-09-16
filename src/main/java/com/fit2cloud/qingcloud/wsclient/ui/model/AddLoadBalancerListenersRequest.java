package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingcloudLoadBalancerListenerBase;

public class AddLoadBalancerListenersRequest extends Request {

	private String loadbalancer;
	private List<QingcloudLoadBalancerListenerBase> listeners;
	private String zone;

	public String getLoadbalancer() {
		return loadbalancer;
	}

	public void setLoadbalancer(String loadbalancer) {
		this.loadbalancer = loadbalancer;
	}

	public List<QingcloudLoadBalancerListenerBase> getListeners() {
		return listeners;
	}

	public void setListeners(List<QingcloudLoadBalancerListenerBase> listeners) {
		this.listeners = listeners;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
