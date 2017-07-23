package com.chinaredstar.jedi.entity;

import com.chinaredstar.jedi.enums.Gender;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserEntity implements Serializable {
    private Long userId;
    private String userName;
    private Gender gender;
    private String phoneNum;
    private String email;
    private String wechatNum;
    private Date createdAt;
    private String createdBy;

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", wechatNum='" + wechatNum + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}
