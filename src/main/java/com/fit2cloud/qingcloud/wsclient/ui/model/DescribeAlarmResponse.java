package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAlarmItem;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSnapshot;
import com.google.gson.Gson;

import java.util.List;

public class DescribeAlarmResponse {
    private String action;
    private List<QingCloudAlarmItem> alarm_set;
    private Integer ret_code;
    private Integer total_count = 0;


    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public static DescribeAlarmResponse fromJson(String jsonDescribeAlarmsResponse) {
        Gson gson = new Gson();
        DescribeAlarmResponse describeSAlarmsResponse = gson.fromJson(jsonDescribeAlarmsResponse, DescribeAlarmResponse.class);
        return describeSAlarmsResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }



    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }

    public List<QingCloudAlarmItem> getAlarm_set() {
        return alarm_set;
    }

    public void setAlarm_set(List<QingCloudAlarmItem> alarm_set) {
        this.alarm_set = alarm_set;
    }
}
