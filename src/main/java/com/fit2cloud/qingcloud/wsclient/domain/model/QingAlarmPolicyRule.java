package com.fit2cloud.qingcloud.wsclient.domain.model;


public class QingAlarmPolicyRule {
    private String alarm_policy_id;
    private String alarm_policy_rule_id;
    private String meter;
    private String condition_type;
    private String thresholds;
    private String data_processor;
    private String consecutive_periods;
    private String period_start_hhmm;
    private String period_end_hhmm;


    public String getAlarm_policy_id() {
        return alarm_policy_id;
    }

    public void setAlarm_policy_id(String alarm_policy_id) {
        this.alarm_policy_id = alarm_policy_id;
    }

    public String getAlarm_policy_rule_id() {
        return alarm_policy_rule_id;
    }

    public void setAlarm_policy_rule_id(String alarm_policy_rule_id) {
        this.alarm_policy_rule_id = alarm_policy_rule_id;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getCondition_type() {
        return condition_type;
    }

    public void setCondition_type(String condition_type) {
        this.condition_type = condition_type;
    }

    public String getThresholds() {
        return thresholds;
    }

    public void setThresholds(String thresholds) {
        this.thresholds = thresholds;
    }

    public String getData_processor() {
        return data_processor;
    }

    public void setData_processor(String data_processor) {
        this.data_processor = data_processor;
    }

    public String getConsecutive_periods() {
        return consecutive_periods;
    }

    public void setConsecutive_periods(String consecutive_periods) {
        this.consecutive_periods = consecutive_periods;
    }

    public String getPeriod_start_hhmm() {
        return period_start_hhmm;
    }

    public void setPeriod_start_hhmm(String period_start_hhmm) {
        this.period_start_hhmm = period_start_hhmm;
    }

    public String getPeriod_end_hhmm() {
        return period_end_hhmm;
    }

    public void setPeriod_end_hhmm(String period_end_hhmm) {
        this.period_end_hhmm = period_end_hhmm;
    }
}
