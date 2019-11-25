package com.huawei.service.proxy.jdk;

import com.huawei.servers.UserServiceCglib;

public class CGLIBProxy {
    public static void main(String[] args) {
        UserServiceCglib userServiceCglib = new UserServiceCglib();
        UserServiceCglib proxy = (UserServiceCglib)new CglibProxyFactory(userServiceCglib).getProxy();
        proxy.getByid("1");
    }
}
