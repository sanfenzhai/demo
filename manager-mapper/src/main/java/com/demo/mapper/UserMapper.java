package com.demo.mapper;

import com.demo.pojo.User;
import java.util.*;

public interface UserMapper {
    List<User> selectUserAll();
    void  insertUser(User user);

}
