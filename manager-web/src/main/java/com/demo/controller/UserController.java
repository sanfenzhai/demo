package com.demo.controller;


import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;
    @RequestMapping("/addUser")
    public String addUser(User user){
        userservice.addUser(user);
        return "ok";
    }
}
