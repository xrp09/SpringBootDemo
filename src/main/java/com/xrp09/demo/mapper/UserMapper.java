package com.xrp09.demo.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper<User> {

    public List<User> findAll();
    public List<User> findname(String name);
    public void insert(User user);
    public void delete(String name);
}
