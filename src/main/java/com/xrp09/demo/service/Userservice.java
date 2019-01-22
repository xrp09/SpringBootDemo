package com.xrp09.demo.service;


import com.xrp09.demo.mapper.UserMapper;
import com.xrp09.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice implements IUserService{


    @Autowired
    private UserMapper usermapper ;


    @Override
    public List<User> getUsers() {
        return usermapper.findAll();
    }

    @Override
    public List<User> queryDataByName( String name) {
        return usermapper.findname(name);
    }

    @Override
    public void delete(String name) {
        usermapper.delete(name);
    }

    @Override
    public void insert(User user) {
        usermapper.insert(user);
    }
}
