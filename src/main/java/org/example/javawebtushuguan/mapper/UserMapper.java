package org.example.javawebtushuguan.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.javawebtushuguan.entity.User;

@Mapper
public interface UserMapper {
    //登陆
    public User load(String name);
    //注册
    public int register(String name, String password);
}
