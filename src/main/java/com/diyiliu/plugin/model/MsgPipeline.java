package com.diyiliu.plugin.model;

import io.netty.channel.ChannelHandlerContext;
import lombok.Data;

/**
 * Description: MsgPipeline
 * Author: DIYILIU
 * Update: 2018-06-27 14:03
 */

@Data
public class MsgPipeline {

    private boolean isOk;

    private long time;

    private ChannelHandlerContext context;
}
