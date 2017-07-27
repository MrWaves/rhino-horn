package com.chinaredstar.jedi.entity;

import lombok.Data;
/**
 * 用于请求短信接口的请求体
 * Created by bo.wang on 2017/7/27.
 */
@Data
public class SMRequestBody {
    private String account;
    private String password;
    private String phones;
    private String content;
}
