package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingcloudLoadBalancerListener {
	
	private Integer listener_port;
	private String listener_protocol;
	private String backend_protocol;
	private String balance_mode;
	private Integer forwardfor;
	private String loadbalancer_id;
	private String loadbalancer_listener_id;
	private String loadbalancer_listener_name;
	private String create_time;
	private String healthy_check_method;
	private String healthy_check_option;
	private String session_sticky;
	public Integer getListener_port() {
		return listener_port;
	}
	public void setListener_port(Integer listener_port) {
		this.listener_port = listener_port;
	}
	public String getListener_protocol() {
		return listener_protocol;
	}
	public void setListener_protocol(String listener_protocol) {
		this.listener_protocol = listener_protocol;
	}
	public String getBackend_protocol() {
		return backend_protocol;
	}
	public void setBackend_protocol(String backend_protocol) {
		this.backend_protocol = backend_protocol;
	}
	public String getBalance_mode() {
		return balance_mode;
	}
	public void setBalance_mode(String balance_mode) {
		this.balance_mode = balance_mode;
	}
	public Integer getForwardfor() {
		return forwardfor;
	}
	public void setForwardfor(Integer forwardfor) {
		this.forwardfor = forwardfor;
	}
	public String getLoadbalancer_id() {
		return loadbalancer_id;
	}
	public void setLoadbalancer_id(String loadbalancer_id) {
		this.loadbalancer_id = loadbalancer_id;
	}
	public String getLoadbalancer_listener_id() {
		return loadbalancer_listener_id;
	}
	public void setLoadbalancer_listener_id(String loadbalancer_listener_id) {
		this.loadbalancer_listener_id = loadbalancer_listener_id;
	}
	public String getLoadbalancer_listener_name() {
		return loadbalancer_listener_name;
	}
	public void setLoadbalancer_listener_name(String loadbalancer_listener_name) {
		this.loadbalancer_listener_name = loadbalancer_listener_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getHealthy_check_method() {
		return healthy_check_method;
	}
	public void setHealthy_check_method(String healthy_check_method) {
		this.healthy_check_method = healthy_check_method;
	}
	public String getHealthy_check_option() {
		return healthy_check_option;
	}
	public void setHealthy_check_option(String healthy_check_option) {
		this.healthy_check_option = healthy_check_option;
	}
	public String getSession_sticky() {
		return session_sticky;
	}
	public void setSession_sticky(String session_sticky) {
		this.session_sticky = session_sticky;
	}
}
