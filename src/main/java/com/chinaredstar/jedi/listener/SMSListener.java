package com.chinaredstar.jedi.listener;

import com.chinaredstar.jedi.constant.Constant;
import com.chinaredstar.jedi.entity.SMRequestBody;
import com.chinaredstar.jedi.service.SMService;
import com.chinaredstar.jedi.utils.JsonUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bo.wang on 2017/7/26.
 */
@Component
@RabbitListener(queues = Constant.RH_SMS_SEND_QUEUE)
public class SMSListener {
    @Autowired
    SMService SMService;

    @RabbitHandler
    public void process(Message msg) throws Exception{
        String jsonstr=String.valueOf(msg.getBody());
        SMRequestBody smRequestBody = JsonUtil.toBean(jsonstr, SMRequestBody.class);
        SMService.sendMsg(smRequestBody);
    }
}
