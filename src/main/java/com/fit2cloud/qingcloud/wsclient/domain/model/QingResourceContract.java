package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingResourceContract {
    private String charge_mode;
    private String price;
    private String duration;
    private String end_time;
    private String next_charge_mode;
    private String start_time;

    public String getCharge_mode() {
        return charge_mode;
    }

    public void setCharge_mode(String charge_mode) {
        this.charge_mode = charge_mode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getNext_charge_mode() {
        return next_charge_mode;
    }

    public void setNext_charge_mode(String next_charge_mode) {
        this.next_charge_mode = next_charge_mode;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
}
