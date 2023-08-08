package org.example.config;

import org.example.service.XxxService;
import org.example.service.impl.XxxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 阮威敏
 * @date 2023/8/8
 */
@Configuration
@EnableConfigurationProperties(XxxProperties.class)
@ConditionalOnClass(XxxService.class)
@ConditionalOnProperty(prefix = "xxx", value = "enable", matchIfMissing = true)
public class XxxAutoConfiguration {

    @Autowired
    private XxxProperties xxxProperties;

    @Bean
    @ConditionalOnMissingBean(XxxService.class)
    public XxxService xxxService() {
        return new XxxServiceImpl(xxxProperties);
    }
}
