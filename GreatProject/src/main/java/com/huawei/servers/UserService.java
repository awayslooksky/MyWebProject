package com.huawei.servers;

import com.huawei.dao.UserDaoImpl;

public interface UserService {
    public UserDaoImpl getByid(String userid);
    public boolean add();
    public boolean delete(String userid);
    public boolean update();
}
