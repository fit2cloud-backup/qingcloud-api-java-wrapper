package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudImage {
    private String processor_type;
    private String platform;
    private String image_name;
    private String image_id;
    private String os_family;
    private Integer size;
    private String description;
    private String visibility;
    private String provider;
    private String owner;
    private String recommended_type;
    private String status;
    private String transition_status;
    private String create_time;
    private String status_time;
	public String getProcessor_type() {
		return processor_type;
	}
	public void setProcessor_type(String processor_type) {
		this.processor_type = processor_type;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getOs_family() {
		return os_family;
	}
	public void setOs_family(String os_family) {
		this.os_family = os_family;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getRecommended_type() {
		return recommended_type;
	}
	public void setRecommended_type(String recommended_type) {
		this.recommended_type = recommended_type;
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
}
