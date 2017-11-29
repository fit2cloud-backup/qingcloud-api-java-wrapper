package com.fit2cloud.qingcloud.wsclient.ui.model;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class DescribeBotsRequest extends Request{
    private String bots;
    private String place_group_id;
    private String status;
    private Integer offset;
    private Integer limit;
    private String zone;

    public String getBots() {
        return bots;
    }

    public void setBots(String bots) {
        this.bots = bots;
    }

    public String getPlace_group_id() {
        return place_group_id;
    }

    public void setPlace_group_id(String place_group_id) {
        this.place_group_id = place_group_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
