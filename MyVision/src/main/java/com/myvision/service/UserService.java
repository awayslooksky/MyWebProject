package com.myvision.service;

import com.myvision.bean.User;
import com.myvision.dao.UserDao;

import java.io.IOException;

public class UserService {
    public User loginVerify(User user) throws IOException {
        UserDao userDao = new UserDao();
        User u = userDao.findUserByNameAndPassword(user);
        return u;
    }
}
