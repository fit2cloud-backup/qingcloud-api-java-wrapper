package com.fit2cloud.qingcloud.wsclient.domain.model;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class QingCloudBotStatus {
    public static final String STANDBY="standby"; //待命中, 不会被分配资源
    public static final String ACTIVE="active"; //可用状态，正常分配资源
    public static final String FAULTY="faulty"; //故障
    public static final String RESCUING="rescuing"; //修复中
    public static final String DOWN="down";//设备下线 （文档里没写 坑死我了）

}
