package com.huawei.service.proxy.jdk;

import com.huawei.servers.UserService;
import com.huawei.servers.UserServiceImpl;

public class JdkProxy {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = (UserService)new ProxyFactory(userService).getProxy();
        proxy.getByid("1");
    }
}
