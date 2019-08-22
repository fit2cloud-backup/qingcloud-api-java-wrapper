package com.fit2cloud.qingcloud.wsclient.domain.model;


import java.util.List;

public class QingCloudRouterStatics {
	private String router_id;
	private String vxnet_id;
	private String router_static_name;
	private Integer static_type;
	private String router_static_id;
	private String create_time;
	private String val1;
	private String val2;
	private String val3;
	private String val4;

    private List<RouterStaticEntry> entry_set;

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



	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal3() {
		return val3;
	}

	public void setVal3(String val3) {
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

	public String getRouter_static_name() {
		return router_static_name;
	}

	public void setRouter_static_name(String router_static_name) {
		this.router_static_name = router_static_name;
	}


	public List<RouterStaticEntry> getEntry_set() {
		return entry_set;
	}

	public void setEntry_set(List<RouterStaticEntry> entry_set) {
		this.entry_set = entry_set;
	}
}