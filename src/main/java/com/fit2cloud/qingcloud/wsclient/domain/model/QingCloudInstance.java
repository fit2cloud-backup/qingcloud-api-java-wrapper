package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudInstance {
	private String instance_id;
    private String instance_name;
    private String description;
    private String instance_type;
    private Integer vcpus_current;
    private Integer memory_current;
    
    private QingCloudEIP eip;
    
    private String status;
    private String transition_status;
    private String create_time;
    private String status_time;
    private QingCloudImage image;
    private List<QingCloudVxnet> vxnets;
    
    private QingCloudSecurityGroup security_group;
    private List<String> volume_ids;
    private List<String> keypair_ids;
    
    private String graphics_passwd;
    private String alert_status;
    private String owner;
    private Integer sub_code;
    private String graphics_protocol;
    private Integer instance_class;
    private String cpu_topology;
    private String lastest_snapshot_time;
    private String device;
    private String repl;
    
	public String getInstance_id() {
		return instance_id;
	}
	public void setInstance_id(String instance_id) {
		this.instance_id = instance_id;
	}
	public String getInstance_name() {
		return instance_name;
	}
	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstance_type() {
		return instance_type;
	}
	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
	}
	public Integer getVcpus_current() {
		return vcpus_current;
	}
	public void setVcpus_current(Integer vcpus_current) {
		this.vcpus_current = vcpus_current;
	}
	public Integer getMemory_current() {
		return memory_current;
	}
	public void setMemory_current(Integer memory_current) {
		this.memory_current = memory_current;
	}
	public QingCloudEIP getEip() {
		return eip;
	}
	public void setEip(QingCloudEIP eip) {
		this.eip = eip;
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
	public QingCloudImage getImage() {
		return image;
	}
	public void setImage(QingCloudImage image) {
		this.image = image;
	}
	public List<QingCloudVxnet> getVxnets() {
		return vxnets;
	}
	public void setVxnets(List<QingCloudVxnet> vxnets) {
		this.vxnets = vxnets;
	}
	public QingCloudSecurityGroup getSecurity_group() {
		return security_group;
	}
	public void setSecurity_group(QingCloudSecurityGroup security_group) {
		this.security_group = security_group;
	}
	public List<String> getVolume_ids() {
		return volume_ids;
	}
	public void setVolume_ids(List<String> volume_ids) {
		this.volume_ids = volume_ids;
	}
	public List<String> getKeypair_ids() {
		return keypair_ids;
	}
	public void setKeypair_ids(List<String> keypair_ids) {
		this.keypair_ids = keypair_ids;
	}
	public String getGraphics_passwd() {
		return graphics_passwd;
	}
	public void setGraphics_passwd(String graphics_passwd) {
		this.graphics_passwd = graphics_passwd;
	}
	public String getAlert_status() {
		return alert_status;
	}
	public void setAlert_status(String alert_status) {
		this.alert_status = alert_status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Integer getSub_code() {
		return sub_code;
	}
	public void setSub_code(Integer sub_code) {
		this.sub_code = sub_code;
	}
	public String getGraphics_protocol() {
		return graphics_protocol;
	}
	public void setGraphics_protocol(String graphics_protocol) {
		this.graphics_protocol = graphics_protocol;
	}
	public Integer getInstance_class() {
		return instance_class;
	}
	public void setInstance_class(Integer instance_class) {
		this.instance_class = instance_class;
	}
	public String getCpu_topology() {
		return cpu_topology;
	}
	public void setCpu_topology(String cpu_topology) {
		this.cpu_topology = cpu_topology;
	}
	public String getLastest_snapshot_time() {
		return lastest_snapshot_time;
	}
	public void setLastest_snapshot_time(String lastest_snapshot_time) {
		this.lastest_snapshot_time = lastest_snapshot_time;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getRepl() {
		return repl;
	}

	public void setRepl(String repl) {
		this.repl = repl;
	}
}
