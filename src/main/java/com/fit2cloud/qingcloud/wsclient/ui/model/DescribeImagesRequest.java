package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeImagesRequest extends Request {
    private List<String> images;
    private String processor_type;
    private String os_family;
    private String visibility;
    private String provider;
    private List<String> status;
    private String search_word;
    private Integer verbose;
    private Integer offset;
    private Integer limit;
    private String zone;
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getProcessor_type() {
		return processor_type;
	}
	public void setProcessor_type(String processor_type) {
		this.processor_type = processor_type;
	}
	public String getOs_family() {
		return os_family;
	}
	public void setOs_family(String os_family) {
		this.os_family = os_family;
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
	public List<String> getStatus() {
		return status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}
	public String getSearch_word() {
		return search_word;
	}
	public void setSearch_word(String search_word) {
		this.search_word = search_word;
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
