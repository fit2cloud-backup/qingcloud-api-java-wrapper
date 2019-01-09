package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudInstanceExtra {
    private Integer bandwidth;
    private Integer iops;
    private String block_bus;
    private Integer gpu_class;
    private Integer features;
    private Integer gpu;
    private Integer cpu_max;
    private String cpu_model;
    private Integer mem_max;
    private String hypervisor;
    private Integer os_disk_size;

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public String getBlock_bus() {
        return block_bus;
    }

    public void setBlock_bus(String block_bus) {
        this.block_bus = block_bus;
    }

    public Integer getGpu_class() {
        return gpu_class;
    }

    public void setGpu_class(Integer gpu_class) {
        this.gpu_class = gpu_class;
    }

    public Integer getFeatures() {
        return features;
    }

    public void setFeatures(Integer features) {
        this.features = features;
    }

    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public Integer getCpu_max() {
        return cpu_max;
    }

    public void setCpu_max(Integer cpu_max) {
        this.cpu_max = cpu_max;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public Integer getMem_max() {
        return mem_max;
    }

    public void setMem_max(Integer mem_max) {
        this.mem_max = mem_max;
    }

    public String getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    public Integer getOs_disk_size() {
        return os_disk_size;
    }

    public void setOs_disk_size(Integer os_disk_size) {
        this.os_disk_size = os_disk_size;
    }
}
