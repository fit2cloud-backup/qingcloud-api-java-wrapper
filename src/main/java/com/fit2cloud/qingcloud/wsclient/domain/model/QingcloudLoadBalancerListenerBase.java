package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingcloudLoadBalancerListenerBase {
	private Integer listener_port;
	private String listener_protocol;
	private String backend_protocol;
	private String loadbalancer_listener_name;
	private String balance_mode; 	
	private String session_sticky;
	private Integer forwardfor;
	private String healthy_check_method;
	private String healthy_check_option;

	private Integer tunnel_timeout =3600;
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
	public String getLoadbalancer_listener_name() {
		return loadbalancer_listener_name;
	}
	public void setLoadbalancer_listener_name(String loadbalancer_listener_name) {
		this.loadbalancer_listener_name = loadbalancer_listener_name;
	}
	public String getBalance_mode() {
		return balance_mode;
	}
	public void setBalance_mode(String balance_mode) {
		this.balance_mode = balance_mode;
	}
	public String getSession_sticky() {
		return session_sticky;
	}
	public void setSession_sticky(String session_sticky) {
		this.session_sticky = session_sticky;
	}
	public Integer getForwardfor() {
		return forwardfor;
	}
	public void setForwardfor(Integer forwardfor) {
		this.forwardfor = forwardfor;
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

	public Integer getTunnel_timeout() {
		return tunnel_timeout;
	}

	public void setTunnel_timeout(Integer tunnel_timeout) {
		this.tunnel_timeout = tunnel_timeout;
	}
}
