package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangbohan on 15/8/19.
 */
public class QingCloudUser {
    private String notify_email;
    private Integer user_type;
    private String gravatar_email;
    private String currency;
    private Date create_time;
    private String company_phone;
    private String user_id;
    private String company_name;
    private String user_name;
    private String email;
    private String phone;
    private String birthday;
    private String address;
    private String lang;
    private String gender;
    private List<String> zones;

    public String getNotify_email() {
        return notify_email;
    }

    public void setNotify_email(String notify_email) {
        this.notify_email = notify_email;
    }

    public String getGravatar_email() {
        return gravatar_email;
    }

    public void setGravatar_email(String gravatar_email) {
        this.gravatar_email = gravatar_email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getZones() {
        return zones;
    }

    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
