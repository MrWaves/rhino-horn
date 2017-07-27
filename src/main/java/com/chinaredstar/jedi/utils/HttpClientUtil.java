package com.chinaredstar.jedi.utils;

import com.chinaredstar.jedi.constant.Constant;
import com.chinaredstar.jedi.entity.HttpResult;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by bo.wang on 2017/7/27.
 */
public class HttpClientUtil {

    /**
     * 通过url调用短信接口
     * @param url
     * @param jsonStr
     * @return
     * @throws IOException
     */
    public static HttpResult httpPostJSONStr(String url,String jsonStr) throws IOException{
        HttpResult httpResult=new HttpResult();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        StringEntity stringEntity = new StringEntity(jsonStr, Constant.CHARSET);
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HTTP.CONTENT_TYPE,Constant.APPLICATION_JSON);
        httpPost.setEntity(stringEntity);
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        int status=httpResponse.getStatusLine().getStatusCode();
        if (status==200){
            HttpEntity httpEntity=httpResponse.getEntity();
            String desc = EntityUtils.toString(httpEntity, Constant.CHARSET);
            EntityUtils.consume(httpEntity);
            httpResult.setHttpCode("200");
            httpResult.setDesc(desc);
        }else {
            httpResult.setHttpCode(status+"");
            httpResult.setDesc("短信接口调用失败。");
        }
        if (httpResponse!=null)
            httpResponse.close();
        if (httpClient!=null)
            httpClient.close();
        return httpResult;
    }
}
