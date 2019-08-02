package com.fit2cloud.qingcloud.wsclient.domain.model;


public class QingCloudEIP {
	private String eip_id;
    private String eip_name;
    private String description;
    private Integer bandwidth;
    private String status;
    private String transition_status;
    private String icp_codes;
    private Integer associate_mode;
    private String billing_mode;
    
    private String create_time;
    private String status_time;
    
    private QingCloudResource resource;
    
    private QingCloudEIPGroup eip_group;
    
    private String eip_addr;

	public String getEip_id() {
		return eip_id;
	}

	public void setEip_id(String eip_id) {
		this.eip_id = eip_id;
	}

	public String getEip_name() {
		return eip_name;
	}

	public void setEip_name(String eip_name) {
		this.eip_name = eip_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransition_status() {
		return transition_status;
	}

	public void setTransition_status(String transition_status) {
		this.transition_status = transition_status;
	}

	public String getIcp_codes() {
		return icp_codes;
	}

	public void setIcp_codes(String icp_codes) {
		this.icp_codes = icp_codes;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getStatus_time() {
		return status_time;
	}

	public void setStatus_time(String status_time) {
		this.status_time = status_time;
	}

	public QingCloudResource getResource() {
		return resource;
	}

	public void setResource(QingCloudResource resource) {
		this.resource = resource;
	}

	public QingCloudEIPGroup getEip_group() {
		return eip_group;
	}

	public void setEip_group(QingCloudEIPGroup eip_group) {
		this.eip_group = eip_group;
	}

	public String getEip_addr() {
		return eip_addr;
	}

	public void setEip_addr(String eip_addr) {
		this.eip_addr = eip_addr;
	}


	public Integer getAssociate_mode() {
		return associate_mode;
	}

	public void setAssociate_mode(Integer associate_mode) {
		this.associate_mode = associate_mode;
	}

	public String getBilling_mode() {
		return billing_mode;
	}

	public void setBilling_mode(String billing_mode) {
		this.billing_mode = billing_mode;
	}
}
