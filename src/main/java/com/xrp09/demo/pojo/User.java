package com.xrp09.demo.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {

    private int userid;
    private String name;

    private int age;
    @JsonIgnore//使属性不显示
    private String love;
    @JsonInclude(JsonInclude.Include.NON_NULL)//如果该字段是null则不予显示
    private String desc;



    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh") //时间格式输出
    private Date test;

    public Date getTest() {
        return test;
    }

    public void setTest(Date test) {
        this.test = test;
    }

    public User() {
    }

    public User(String name, int age, String love, String desc) {
        this.name = name;
        this.age = age;
        this.love = love;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
