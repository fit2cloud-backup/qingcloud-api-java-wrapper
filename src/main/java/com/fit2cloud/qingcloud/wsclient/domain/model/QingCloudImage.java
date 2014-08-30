package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudImage {
    private String processor_type;
    private String platform;
    private String provider;
    private String image_name;
    private String image_id;
    private String os_family;
    private Integer image_size;
    
    
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
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
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
	public Integer getImage_size() {
		return image_size;
	}
	public void setImage_size(Integer image_size) {
		this.image_size = image_size;
	}
    
    
}
