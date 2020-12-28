package com.diyiliu.plugin.model;

import lombok.Data;

/**
 * Description: SendMsg
 * Author: DIYILIU
 * Update: 2018-06-26 16:07
 */

@Data
public class SendMsg {
    private Integer serial;

    private String cmd;

    private String device;

    private byte[] content = new byte[0];
}
