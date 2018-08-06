package com.dodostudio.dodomeloncms.service.impl;

import com.dodostudio.dodomeloncms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dodostudio.dodomeloncms.mapper.UserMapper;
import com.dodostudio.dodomeloncms.model.User;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响


    public User  getUserById(Integer id){
       return userMapper.selectByPrimaryKey(id);
    }

}
