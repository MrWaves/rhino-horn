package com.chinaredstar.jedi.mapper;

import com.chinaredstar.jedi.entity.UserEntity;

public interface UsersMapper {

    void insert(UserEntity user);

    UserEntity getById(Long id);

}
