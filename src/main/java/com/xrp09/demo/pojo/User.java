package com.xrp09.demo.pojo;



public class User {

    private int userid;
    private String name;
    private int age;
    private String love;
    private String desc;


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
