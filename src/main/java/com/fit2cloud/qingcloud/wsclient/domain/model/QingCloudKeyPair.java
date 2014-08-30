package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudKeyPair {
    private String keypair_id;
    private String keypair_name;
    private String description;
    private String encrypt_method;
    private String pub_key;
    private List<String> instance_ids;
    
	public String getKeypair_id() {
		return keypair_id;
	}
	public void setKeypair_id(String keypair_id) {
		this.keypair_id = keypair_id;
	}
	public String getKeypair_name() {
		return keypair_name;
	}
	public void setKeypair_name(String keypair_name) {
		this.keypair_name = keypair_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEncrypt_method() {
		return encrypt_method;
	}
	public void setEncrypt_method(String encrypt_method) {
		this.encrypt_method = encrypt_method;
	}
	public String getPub_key() {
		return pub_key;
	}
	public void setPub_key(String pub_key) {
		this.pub_key = pub_key;
	}
	public List<String> getInstance_ids() {
		return instance_ids;
	}
	public void setInstance_ids(List<String> instance_ids) {
		this.instance_ids = instance_ids;
	}
    
}
