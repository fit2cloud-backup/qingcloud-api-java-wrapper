package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeLoadBalancerListenersRequest extends Request {
    
	private List<String> loadbalancer_listeners;
	private String loadbalancer;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	public List<String> getLoadbalancer_listeners() {
		return loadbalancer_listeners;
	}
	public void setLoadbalancer_listeners(List<String> loadbalancer_listeners) {
		this.loadbalancer_listeners = loadbalancer_listeners;
	}
	public String getLoadbalancer() {
		return loadbalancer;
	}
	public void setLoadbalancer(String loadbalancer) {
		this.loadbalancer = loadbalancer;
	}
	public Integer getVerbose() {
		return verbose;
	}
	public void setVerbose(Integer verbose) {
		this.verbose = verbose;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
