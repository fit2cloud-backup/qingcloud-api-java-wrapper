package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeKeyPairsRequest extends Request {
    private List<String> keypairs;
    private String instance_id;
    private String encrypt_method;
    private String search_word;
    private Integer verbose;
    private Integer offset;
    private Integer limit;
    
    private String zone;

	public List<String> getKeypairs() {
		return keypairs;
	}

	public void setKeypairs(List<String> keypairs) {
		this.keypairs = keypairs;
	}

	public String getInstance_id() {
		return instance_id;
	}

	public void setInstance_id(String instance_id) {
		this.instance_id = instance_id;
	}

	public String getEncrypt_method() {
		return encrypt_method;
	}

	public void setEncrypt_method(String encrypt_method) {
		this.encrypt_method = encrypt_method;
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
