package org.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 阮威敏
 * @date 2023/8/8
 */
@Data
@ConfigurationProperties(prefix = "xxx")
public class XxxProperties {

    private String name = "xxx";

}
