package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeRouterVxnetsRequest extends Request {
    
	private String router;
	private String vxnet;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	public String getRouter() {
		return router;
	}
	public void setRouter(String router) {
		this.router = router;
	}
	public String getVxnet() {
		return vxnet;
	}
	public void setVxnet(String vxnet) {
		this.vxnet = vxnet;
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
