package org.example.javawebtushuguan.service;

import org.example.javawebtushuguan.entity.User;

public interface UserService {
    //登陆
    public int load(String name,String password);

    //注册
    public int register(String name,String password);
}
