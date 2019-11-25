package com.huawei.servers;

import com.huawei.dao.UserDaoImpl;

public class UserServiceCglib  {

    public UserDaoImpl getByid(String userid) {
        System.out.println("执行的具体的业务逻辑：getById");
        return new UserDaoImpl();
    }

    public boolean add(UserDaoImpl user) {
        System.out.println("执行具体的业务逻辑： add....");
        return true;
    }

    public boolean delete(String userid) {
        System.out.println("执行具体的业务逻辑：delete...");
        return true;
    }

    public boolean update(UserDaoImpl user) {
        System.out.println("执行具体的业务逻辑：update。。。");
        return true;
    }
}
