package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudChargeRecord;
import com.google.gson.Gson;

import java.util.List;

public class ChargeRecordsResponse{
    private String action;
    private String total_sum;
    private Integer total_count;
    private Integer ret_code;
    private List<QingCloudChargeRecord> charge_record_set;

    public static ChargeRecordsResponse fromJson(String json){
        Gson gson = new Gson();
        ChargeRecordsResponse chargeRecordsResponse = gson.fromJson(json, ChargeRecordsResponse.class);
        return chargeRecordsResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTotal_sum() {
        return total_sum;
    }

    public void setTotal_sum(String total_sum) {
        this.total_sum = total_sum;
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

    public List<QingCloudChargeRecord> getCharge_record_set() {
        return charge_record_set;
    }

    public void setCharge_record_set(List<QingCloudChargeRecord> charge_record_set) {
        this.charge_record_set = charge_record_set;
    }
}
