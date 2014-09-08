package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeRouterStaticsRequest extends Request {
    
	private List<String> router_statics;
	private String router;
	private String static_type;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	public List<String> getRouter_statics() {
		return router_statics;
	}
	public void setRouter_statics(List<String> router_statics) {
		this.router_statics = router_statics;
	}
	public String getRouter() {
		return router;
	}
	public void setRouter(String router) {
		this.router = router;
	}
	public String getStatic_type() {
		return static_type;
	}
	public void setStatic_type(String static_type) {
		this.static_type = static_type;
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
