package com.chinaredstar.jedi.service.impl;

import com.chinaredstar.jedi.RhinoHornApplication;
import com.chinaredstar.jedi.entity.SMRequestBody;
import com.chinaredstar.jedi.service.SMService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by bo.wang on 2017/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RhinoHornApplication.class)
@Transactional
public class SMServiceImplTest {
    @Autowired
    SMService smService;

    @Test
    public void sendMsg() throws Exception {
        SMRequestBody smRequestBody=new SMRequestBody();
        smRequestBody.setPhones("15950853008");
        smRequestBody.setContent("rhino-horn 第一次测试短信");
        smService.sendMsg(smRequestBody);
    }

}