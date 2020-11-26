package com.demo.test;
import com.demo.pojo.User;
import com.demo.mapper.UserMapper;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUsername("admin1");
        user.setUserage(23);
        userMapper.insertUser(user);

    }

    @Test
    public void selectUserTest(){
        List<User> list = userMapper.selectUserAll();
        for(User user:list){
            System.out.println(user.getUserid());
            System.out.println(user.getUsername());
            System.out.println(user.getUserage());
        };
    }


}

