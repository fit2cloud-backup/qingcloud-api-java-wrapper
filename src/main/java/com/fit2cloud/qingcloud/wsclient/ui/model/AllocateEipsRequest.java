package com.fit2cloud.qingcloud.wsclient.ui.model;


public class AllocateEipsRequest extends Request {
    private Integer bandwidth;
    private String eip_name;
    private Integer count;
    private Integer need_icp;
    private String billing_mode;
    private String zone;
    private String eip_group;
    private Integer associate_mode;

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getEip_name() {
		return eip_name;
	}

	public void setEip_name(String eip_name) {
		this.eip_name = eip_name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getNeed_icp() {
		return need_icp;
	}

	public void setNeed_icp(Integer need_icp) {
		this.need_icp = need_icp;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getBilling_mode() {
		return billing_mode;
	}

	public void setBilling_mode(String billing_mode) {
		this.billing_mode = billing_mode;
	}

	public String getEip_group() {
		return eip_group;
	}

	public void setEip_group(String eip_group) {
		this.eip_group = eip_group;
	}

	public Integer getAssociate_mode() {
		return associate_mode;
	}

	public void setAssociate_mode(Integer associate_mode) {
		this.associate_mode = associate_mode;
	}
}
