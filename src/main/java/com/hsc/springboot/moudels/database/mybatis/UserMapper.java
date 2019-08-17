package com.hsc.springboot.moudels.database.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User_mybatis findUserByUsername(String username);

    void updateUserByUsername(User_mybatis user);

    void deleteUserByUsername(String username);

    void saveUser(User_mybatis user);

    List<User_mybatis> getUserList();
}