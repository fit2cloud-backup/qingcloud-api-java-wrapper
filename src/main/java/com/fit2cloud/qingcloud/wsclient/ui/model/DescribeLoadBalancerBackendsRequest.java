package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeLoadBalancerBackendsRequest extends Request {
	private List<String> loadbalancer_backends;
	private String loadbalancer_listener;
	private String loadbalancer;
	private String zone;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	public List<String> getLoadbalancer_backends() {
		return loadbalancer_backends;
	}
	public void setLoadbalancer_backends(List<String> loadbalancer_backends) {
		this.loadbalancer_backends = loadbalancer_backends;
	}
	public String getLoadbalancer_listener() {
		return loadbalancer_listener;
	}
	public void setLoadbalancer_listener(String loadbalancer_listener) {
		this.loadbalancer_listener = loadbalancer_listener;
	}
	public String getLoadbalancer() {
		return loadbalancer;
	}
	public void setLoadbalancer(String loadbalancer) {
		this.loadbalancer = loadbalancer;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
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
}
