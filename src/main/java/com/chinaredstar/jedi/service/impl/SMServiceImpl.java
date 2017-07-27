package com.chinaredstar.jedi.service.impl;

import com.chinaredstar.jedi.config.DHSMSSettings;
import com.chinaredstar.jedi.entity.HttpResult;
import com.chinaredstar.jedi.entity.SMRequestBody;
import com.chinaredstar.jedi.service.SMService;
import com.chinaredstar.jedi.utils.HttpClientUtil;
import com.chinaredstar.jedi.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
/**
 * Created by bo.wang on 2017/7/27.
 */
@Service
public class SMServiceImpl implements SMService {
    @Autowired
    DHSMSSettings dhsmsSettings;

    @Override
    public HttpResult sendMsg(SMRequestBody smRequestBody){
        smRequestBody.setAccount(dhsmsSettings.getAccount());
        smRequestBody.setPassword(dhsmsSettings.getPassword());
        String requestJSON = JsonUtil.toJSON(smRequestBody);
        try{
            HttpResult httpResult = HttpClientUtil.httpPostJSONStr(dhsmsSettings.getUrl(), requestJSON);
            return httpResult;
        }catch (IOException e){
            return new HttpResult("300","");
        }
    }
}
