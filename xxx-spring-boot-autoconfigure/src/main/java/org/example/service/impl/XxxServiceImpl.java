package org.example.service.impl;

import org.example.config.XxxProperties;
import org.example.service.XxxService;

/**
 * @author 阮威敏
 * @date 2023/8/8
 */
public class XxxServiceImpl implements XxxService {

    private final XxxProperties xxxProperties;

    public XxxServiceImpl(XxxProperties xxxProperties) {
        this.xxxProperties = xxxProperties;
    }

    @Override
    public String getName() {
        return xxxProperties.getName();
    }
}
