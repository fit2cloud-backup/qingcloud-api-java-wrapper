package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.Map;

import com.google.gson.Gson;

public class QingCloudRouterStatics {
	private String router_id;
	private String vxnet_id;
	private Integer static_type;
	private String router_static_id;
	private String create_time;
	private Integer val1;
	private String val2;
	private Integer val3;
	private String val4;

	public String getRouter_id() {
		return router_id;
	}

	public void setRouter_id(String router_id) {
		this.router_id = router_id;
	}

	public String getVxnet_id() {
		return vxnet_id;
	}

	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}

	public String getRouter_static_id() {
		return router_static_id;
	}

	public void setRouter_static_id(String router_static_id) {
		this.router_static_id = router_static_id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public Integer getVal1() {
		return val1;
	}

	public void setVal1(Integer val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public Integer getVal3() {
		return val3;
	}

	public void setVal3(Integer val3) {
		this.val3 = val3;
	}

	public String getVal4() {
		return val4;
	}

	public void setVal4(String val4) {
		this.val4 = val4;
	}

	public Integer getStatic_type() {
		return static_type;
	}

	public void setStatic_type(Integer static_type) {
		this.static_type = static_type;
	}

	@Override
	public String toString() {
		return "QingCloudRouterStatics [router_id=" + router_id + ", vxnet_id="
				+ vxnet_id + ", static_type=" + static_type
				+ ", router_static_id=" + router_static_id + ", create_time="
				+ create_time + ", val1=" + val1 + ", val2=" + val2 + ", val3="
				+ val3 + ", val4=" + val4 + "]";
	}
}