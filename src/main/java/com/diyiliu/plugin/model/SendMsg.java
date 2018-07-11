package com.diyiliu.plugin.model;

/**
 * Description: SendMsg
 * Author: DIYILIU
 * Update: 2018-06-26 16:07
 */
public class SendMsg {
    private Integer serial;

    private String cmd;

    private String device;

    private byte[] content = new byte[0];

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }
}
