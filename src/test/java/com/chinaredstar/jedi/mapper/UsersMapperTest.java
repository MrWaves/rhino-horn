package com.chinaredstar.jedi.mapper;

import com.chinaredstar.jedi.entity.UserEntity;
import com.chinaredstar.jedi.enums.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersMapperTest {
    @Autowired
    private UsersMapper usersMapper;

//    @Test
//    public void insert() throws Exception {
//        UserEntity user=new UserEntity();
//        user.setUserName("李四");
//        user.setGender(Gender.MAN);
//        user.setPhoneNum("130xxxxxxxx");
//        user.setCreatedAt(new Date());
//        user.setCreatedBy("xman");
//        usersMapper.insert(user);
//        System.out.println(user.getUserId());
//    }

    @Test
    public void getById() throws Exception {
        System.out.println(usersMapper.getById(1L).toString());
    }

}