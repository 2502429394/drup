package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@RestController
//定义获取的为Json数据格式
@RequestMapping("/user")
public class UserController {


    @Resource
    UserMapper userMapper;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userMapper.findAll();
    };

    @PostMapping("/updateUsers")
    public String updateUsers(@RequestBody User user){
        userMapper.save(user);
        return "success";
    };

    @PutMapping("updateUser")
    public  String updateUsers(@RequestBody User user){
        userMapper.update(user);
    }
}
