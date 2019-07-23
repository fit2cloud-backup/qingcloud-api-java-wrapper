package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudVxnetDetail {

    private String vxnet_name;
    private Integer vxnet_type;
    private String vxnet_id;
    private String create_time;
    private String description;
    private List<String> instance_ids;
    private QingcloudRouter router;
	private String network_acl_id;
	private String vpc_router_id;

	public String getVxnet_name() {
		return vxnet_name;
	}
	public void setVxnet_name(String vxnet_name) {
		this.vxnet_name = vxnet_name;
	}
	public Integer getVxnet_type() {
		return vxnet_type;
	}
	public void setVxnet_type(Integer vxnet_type) {
		this.vxnet_type = vxnet_type;
	}
	public String getVxnet_id() {
		return vxnet_id;
	}
	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getInstance_ids() {
		return instance_ids;
	}
	public void setInstance_ids(List<String> instance_ids) {
		this.instance_ids = instance_ids;
	}
	public QingcloudRouter getRouter() {
		return router;
	}
	public void setRouter(QingcloudRouter router) {
		this.router = router;
	}
	@Override
	public String toString() {
		return "QingCloudVxnetDetail [vxnet_name=" + vxnet_name
				+ ", vxnet_type=" + vxnet_type + ", vxnet_id=" + vxnet_id
				+ ", create_time=" + create_time + ", description="
				+ description + ", instance_ids=" + instance_ids + ", router="
				+ router + "]";
	}

	public String getNetwork_acl_id() {
		return network_acl_id;
	}

	public void setNetwork_acl_id(String network_acl_id) {
		this.network_acl_id = network_acl_id;
	}

	public String getVpc_router_id() {
		return vpc_router_id;
	}

	public void setVpc_router_id(String vpc_router_id) {
		this.vpc_router_id = vpc_router_id;
	}
}
