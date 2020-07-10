package com.fit2cloud.qingcloud.wsclient.ui.model;

/* Bug1.官方文档给出的网络请求参数是vxnet_id,但实际调用时发现会报错，内容是：missing parameter [vxnet]；
 *      因此增加了vxnet的请求参数来代替vxnet_id;
 * Bug2.官方文档给出的名称请求参数是name,但实际调用时发现，给name赋值并不能创建出带名称的vnas服务；
 *      因此将name改为s2_server_name;
 */
public class CreateS2ServerRequest extends Request {
    private String vxnet_id;//bug1
    private String vxnet;
    private String service_type;
    private String name;//bug2
    private String s2_server_name;
    private Integer s2_server_type;
    private String private_ip;
    private String description;
    private Integer s2_class;
    private String zone;

    public String getVxnet_id() {
        return vxnet_id;
    }

    public void setVxnet_id(String vxnet_id) {
        this.vxnet_id = vxnet_id;
    }

    public String getVxnet() {
        return vxnet;
    }

    public void setVxnet(String vxnet) {
        this.vxnet = vxnet;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getS2_server_name() {
        return s2_server_name;
    }

    public void setS2_server_name(String s2_server_name) {
        this.s2_server_name = s2_server_name;
    }

    public Integer getS2_server_type() {
        return s2_server_type;
    }

    public void setS2_server_type(Integer s2_server_type) {
        this.s2_server_type = s2_server_type;
    }

    public String getPrivate_ip() {
        return private_ip;
    }

    public void setPrivate_ip(String private_ip) {
        this.private_ip = private_ip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getS2_class() {
        return s2_class;
    }

    public void setS2_class(Integer s2_class) {
        this.s2_class = s2_class;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
