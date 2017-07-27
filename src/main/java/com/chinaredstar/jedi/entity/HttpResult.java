package com.chinaredstar.jedi.entity;

import lombok.Data;

/**
 * Created by bo.wang on 2017/7/27.
 */
@Data
public class HttpResult {
    private String httpCode;
    private String desc;

    public HttpResult(String httpCode, String desc) {
        this.httpCode = httpCode;
        this.desc = desc;
    }

    public HttpResult() {
    }
}
