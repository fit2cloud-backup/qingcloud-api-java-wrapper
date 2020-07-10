package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateS2ServerResponse {
    private String action;
    private String s2_server_id;
    private String job_id;
    private Integer ret_code;
    private String message;

    public static CreateS2ServerResponse fromJson(String jsonCreateS2ServersResponse) {
        Gson gson = new Gson();
        CreateS2ServerResponse createS2ServersResponse = gson.fromJson(jsonCreateS2ServersResponse, CreateS2ServerResponse.class);
        return createS2ServersResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getS2_server_id() {
        return s2_server_id;
    }

    public void setS2_server_id(String s2_server_id) {
        this.s2_server_id = s2_server_id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
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
