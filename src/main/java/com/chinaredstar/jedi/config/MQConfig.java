package com.chinaredstar.jedi.config;

import com.chinaredstar.jedi.constant.Constant;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by bo.wang on 2017/7/25.
 */

@Configuration
public class MQConfig {
    @Bean
    public Queue smsSendQueue(){
        return new Queue(Constant.RH_SMS_SEND_QUEUE);
    }
}
