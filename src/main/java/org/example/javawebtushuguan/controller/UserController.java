package org.example.javawebtushuguan.controller;

import org.example.javawebtushuguan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 3. 解决跨域问题（前端和后端端口相同可省略，不同必须加）
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/load")
    public int load(String name,String password){
        return userService.load(name,password);
    }

    @GetMapping("user/register")
    public int register(String name,String password){
        return userService.register(name,password);
    }

}
