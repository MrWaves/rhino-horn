package com.chinaredstar.jedi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by bo.wang on 2017/7/27.
 */
@Data
@Component
@ConfigurationProperties(prefix = "DH")
@PropertySource("classpath:properties/dhsms.properties")
public class DHSMSSettings {
    private String url;
    private String account;
    private String password;
    private String yx_account;
    private String yx_password;
}
