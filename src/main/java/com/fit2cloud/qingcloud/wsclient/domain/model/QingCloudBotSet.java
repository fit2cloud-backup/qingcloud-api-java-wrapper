package com.fit2cloud.qingcloud.wsclient.domain.model;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class QingCloudBotSet {
    private String bot_id;
    private String hyper_node_name;
    private String host_machine;
    private Double virtual_disk;
    private Double free_disk;
    private Double use_disk;
    private Integer memory_max;
    private Integer used_memory;
    private Integer free_memory;
    private Integer real_free_memory;
    private Integer total_vcpu;
    private Integer used_vcpu;
    private Integer free_vcpu;
    private Integer cpu_cores;
    private Integer cpu_idle;
    private Integer conntrack;
    private Integer running;
    private String status;
    private String create_time;
    private String status_time;

    public String getBot_id() {
        return bot_id;
    }

    public void setBot_id(String bot_id) {
        this.bot_id = bot_id;
    }

    public String getHyper_node_name() {
        return hyper_node_name;
    }

    public void setHyper_node_name(String hyper_node_name) {
        this.hyper_node_name = hyper_node_name;
    }

    public String getHost_machine() {
        return host_machine;
    }

    public void setHost_machine(String host_machine) {
        this.host_machine = host_machine;
    }

    public Double getVirtual_disk() {
        return virtual_disk;
    }

    public void setVirtual_disk(Double virtual_disk) {
        this.virtual_disk = virtual_disk;
    }

    public Double getFree_disk() {
        return free_disk;
    }

    public void setFree_disk(Double free_disk) {
        this.free_disk = free_disk;
    }

    public Double getUse_disk() {
        return use_disk;
    }

    public void setUse_disk(Double use_disk) {
        this.use_disk = use_disk;
    }

    public Integer getMemory_max() {
        return memory_max;
    }

    public void setMemory_max(Integer memory_max) {
        this.memory_max = memory_max;
    }

    public Integer getUsed_memory() {
        return used_memory;
    }

    public void setUsed_memory(Integer used_memory) {
        this.used_memory = used_memory;
    }

    public Integer getFree_memory() {
        return free_memory;
    }

    public void setFree_memory(Integer free_memory) {
        this.free_memory = free_memory;
    }

    public Integer getReal_free_memory() {
        return real_free_memory;
    }

    public void setReal_free_memory(Integer real_free_memory) {
        this.real_free_memory = real_free_memory;
    }

    public Integer getTotal_vcpu() {
        return total_vcpu;
    }

    public void setTotal_vcpu(Integer total_vcpu) {
        this.total_vcpu = total_vcpu;
    }

    public Integer getUsed_vcpu() {
        return used_vcpu;
    }

    public void setUsed_vcpu(Integer used_vcpu) {
        this.used_vcpu = used_vcpu;
    }

    public Integer getFree_vcpu() {
        return free_vcpu;
    }

    public void setFree_vcpu(Integer free_vcpu) {
        this.free_vcpu = free_vcpu;
    }

    public Integer getCpu_cores() {
        return cpu_cores;
    }

    public void setCpu_cores(Integer cpu_cores) {
        this.cpu_cores = cpu_cores;
    }

    public Integer getCpu_idle() {
        return cpu_idle;
    }

    public void setCpu_idle(Integer cpu_idle) {
        this.cpu_idle = cpu_idle;
    }

    public Integer getConntrack() {
        return conntrack;
    }

    public void setConntrack(Integer conntrack) {
        this.conntrack = conntrack;
    }

    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time;
    }
}
