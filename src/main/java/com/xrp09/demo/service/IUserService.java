package com.xrp09.demo.service;

import com.xrp09.demo.pojo.User;

import java.util.List;

public interface IUserService {

    public List<User> getUsers()throws Exception;

    public List<User> queryDataByName(String name);
    public void insert(User user);
    public void delete(String name);
}
