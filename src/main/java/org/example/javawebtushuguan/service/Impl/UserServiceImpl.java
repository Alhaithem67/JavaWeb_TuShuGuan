package org.example.javawebtushuguan.service.Impl;

import org.example.javawebtushuguan.entity.User;
import org.example.javawebtushuguan.mapper.UserMapper;
import org.example.javawebtushuguan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int load(String name, String password) {
        User user = userMapper.load(name);
        if (user == null) {
            System.out.println("用户不存在...");
            return 0;
        }else{
            if (user.getPassword().equals(password)) {
                System.out.println("登陆成功");
                return 1;
            }else {
                System.out.println("密码错误");
                return 2;
            }
        }
    }

    @Override
    public int register(String name,String password) {
        if (userMapper.register(name,password) == 1) {
            return 1;
        }else {
            return 0;
        }
    }
}
