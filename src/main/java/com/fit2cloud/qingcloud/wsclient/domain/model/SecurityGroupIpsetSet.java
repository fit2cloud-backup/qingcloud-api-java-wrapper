package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class SecurityGroupIpsetSet {

    private String  security_group_ipset_id;
    private Integer is_applied;
    private String val;
    private Integer ipset_type;
    private String create_time;
    private String owner;
    private String security_group_ipset_name;
    private String description;
    private List<QingCloudResource> resources;

    public String getSecurity_group_ipset_id() {
        return security_group_ipset_id;
    }

    public void setSecurity_group_ipset_id(String security_group_ipset_id) {
        this.security_group_ipset_id = security_group_ipset_id;
    }

    public Integer getIs_applied() {
        return is_applied;
    }

    public void setIs_applied(Integer is_applied) {
        this.is_applied = is_applied;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Integer getIpset_type() {
        return ipset_type;
    }

    public void setIpset_type(Integer ipset_type) {
        this.ipset_type = ipset_type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecurity_group_ipset_name() {
        return security_group_ipset_name;
    }

    public void setSecurity_group_ipset_name(String security_group_ipset_name) {
        this.security_group_ipset_name = security_group_ipset_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<QingCloudResource> getResources() {
        return resources;
    }

    public void setResources(List<QingCloudResource> resources) {
        this.resources = resources;
    }
}
