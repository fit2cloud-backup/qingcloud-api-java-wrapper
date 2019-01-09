package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class RunInstancesRequest extends Request {
	private String image_id;
	private String instance_type=null;
	private Integer instance_class=null;
	private Integer cpu=null;
	private Integer memory=null;
	private Integer count=1;
	private String instance_name="";
	private List<String> vxnets=null;
	private String security_group=null;
	private String login_mode=null;
	private String login_keypair = null;
	private String login_passwd = null;
	
	private Integer need_newsid=0;
	private List<String> volumes = null;
	private Integer need_userdata = 0;
	private String userdata_type = null;
	private String userdata_value = null;
	private String userdata_path = null;
	private String userdata_file = null;
	private String repl = null;
	
	private String zone;
	private String hostname = null;

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public RunInstancesRequest() {
	}

	public String getImage_id() {
		return image_id;
	}


	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}


	public String getInstance_type() {
		return instance_type;
	}


	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
	}

	public Integer getInstance_class() {
		return instance_class;
	}

	public void setInstance_class(Integer instance_class) {
		this.instance_class = instance_class;
	}

	public Integer getCpu() {
		return cpu;
	}


	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}


	public Integer getMemory() {
		return memory;
	}


	public void setMemory(Integer memory) {
		this.memory = memory;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(Integer count) {
		this.count = count;
	}


	public String getInstance_name() {
		return instance_name;
	}


	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}


	public List<String> getVxnets() {
		return vxnets;
	}


	public void setVxnets(List<String> vxnets) {
		this.vxnets = vxnets;
	}


	public String getSecurity_group() {
		return security_group;
	}


	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}


	public String getLogin_mode() {
		return login_mode;
	}


	public void setLogin_mode(String login_mode) {
		this.login_mode = login_mode;
	}


	public String getLogin_keypair() {
		return login_keypair;
	}


	public void setLogin_keypair(String login_keypair) {
		this.login_keypair = login_keypair;
	}


	public String getLogin_passwd() {
		return login_passwd;
	}


	public void setLogin_passwd(String login_passwd) {
		this.login_passwd = login_passwd;
	}


	public Integer getNeed_newsid() {
		return need_newsid;
	}


	public void setNeed_newsid(Integer need_newsid) {
		this.need_newsid = need_newsid;
	}

	public List<String> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
	}

	public Integer getNeed_userdata() {
		return need_userdata;
	}

	public void setNeed_userdata(Integer need_userdata) {
		this.need_userdata = need_userdata;
	}


	public String getUserdata_type() {
		return userdata_type;
	}


	public void setUserdata_type(String userdata_type) {
		this.userdata_type = userdata_type;
	}


	public String getUserdata_value() {
		return userdata_value;
	}


	public void setUserdata_value(String userdata_value) {
		this.userdata_value = userdata_value;
	}


	public String getUserdata_path() {
		return userdata_path;
	}


	public void setUserdata_path(String userdata_path) {
		this.userdata_path = userdata_path;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public String getUserdata_file() {
		return userdata_file;
	}

	public void setUserdata_file(String userdata_file) {
		this.userdata_file = userdata_file;
	}

	public String getRepl() {
		return repl;
	}

	public void setRepl(String repl) {
		this.repl = repl;
	}

	public String toJson(){
		Gson gson = new GsonBuilder().create();
		String jsonRequest = gson.toJson(this);
		System.out.println(jsonRequest);
		return jsonRequest;
	}

}
