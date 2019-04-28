package com.diyiliu.plugin.model;

/**
 * Description: DataProcessAdapter
 * Author: DIYILIU
 * Update: 2019-04-28 09:20
 */
public class DataProcessAdapter implements IDataProcess {

    @Override
    public Header dealHeader(byte[] bytes) {
        return null;
    }

    @Override
    public void parse(byte[] content, Header header) {

    }

    @Override
    public byte[] pack(Header header, Object... argus) {
        return new byte[0];
    }

    @Override
    public void init() {

    }
}
