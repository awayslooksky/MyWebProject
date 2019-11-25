package com.huawei.dao;

public class UserDaoImpl implements UserDao {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public void seyHello() {
        System.out.println("hello" +username);
    }
}
