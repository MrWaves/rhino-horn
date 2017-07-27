package com.chinaredstar.jedi.utils;

import net.sf.json.JSONObject;

/**
 * Created by bo.wang on 2017/7/27.
 */
public class JsonUtil {

    /**
     * 对象转换为JSON字符串
     * @param obj
     * @return
     */
    public static String toJSON(Object obj){
        JSONObject jsonObject = JSONObject.fromObject(obj);
        return jsonObject.toString();
    }

    public static <T> T toBean(String jsonStr,Class<T> type){
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        return (T) JSONObject.toBean(jsonObject, type);
    }
}
