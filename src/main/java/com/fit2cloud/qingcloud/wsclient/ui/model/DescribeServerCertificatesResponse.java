package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.ServerCertificate;
import com.google.gson.Gson;

import java.util.List;

public class DescribeServerCertificatesResponse {
	private String action;
	private List<ServerCertificate> server_certificate_set;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;

	public static DescribeServerCertificatesResponse fromJson(
			String jsonDescribeSecurityGroupsResponse) {
		Gson gson = new Gson();
		DescribeServerCertificatesResponse describeSecurityGroupsResponse = gson
				.fromJson(jsonDescribeSecurityGroupsResponse,
						DescribeServerCertificatesResponse.class);
		return describeSecurityGroupsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<ServerCertificate> getServer_certificate_set() {
		return server_certificate_set;
	}

	public void setServer_certificate_set(List<ServerCertificate> server_certificate_set) {
		this.server_certificate_set = server_certificate_set;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
