package com.xrp09.demo.mapper;


import com.xrp09.demo.pojo.User;
import com.xrp09.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends MyMapper<User> {

    public List<User> findAll();
    public List<User> findname(String name);
    public int insert(User user);
    public void delete(String name);
}
