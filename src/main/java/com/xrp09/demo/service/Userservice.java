package com.xrp09.demo.service;


import com.xrp09.demo.mapper.UserMapper;
import com.xrp09.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Userservice implements IUserService{


    @Autowired
    private UserMapper usermapper ;


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> getUsers() {
        return usermapper.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> queryDataByName( String name) {
        return usermapper.findname(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(String name) {
        usermapper.deleteuser(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(User user) {
          usermapper.insertuser(user);
    }
}
