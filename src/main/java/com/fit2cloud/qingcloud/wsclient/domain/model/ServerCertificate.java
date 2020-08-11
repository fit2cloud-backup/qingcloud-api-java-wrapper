package com.fit2cloud.qingcloud.wsclient.domain.model;

public class ServerCertificate {
    private String server_certificate_id;
    private String server_certificate_name;
    private String private_key;
    private String description;
    private String create_time;

    public String getServer_certificate_id() {
        return server_certificate_id;
    }

    public void setServer_certificate_id(String server_certificate_id) {
        this.server_certificate_id = server_certificate_id;
    }

    public String getServer_certificate_name() {
        return server_certificate_name;
    }

    public void setServer_certificate_name(String server_certificate_name) {
        this.server_certificate_name = server_certificate_name;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(String private_key) {
        this.private_key = private_key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
