package com.chinaredstar.jedi.service;

import com.chinaredstar.jedi.entity.HttpResult;
import com.chinaredstar.jedi.entity.SMRequestBody;
/**
 * Created by bo.wang on 2017/7/27.
 */
public interface SMService {
    /**
     * 发送短信
     * @param smRequestBody
     * @return
     */
    public HttpResult sendMsg(SMRequestBody smRequestBody);
}
