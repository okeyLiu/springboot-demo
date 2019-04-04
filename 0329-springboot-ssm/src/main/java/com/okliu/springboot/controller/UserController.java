package com.okliu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okliu.springboot.dao.UserMapper;
import com.okliu.springboot.entity.User;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "user/{name}")
    public User findUser(@PathVariable String name) {
        //调用dao层
        User user = userMapper.selectUserByName(name);
        return user;
    }

}