package com.huawei.service.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory  {
    //原始对象
    private Object target;

    //构造代理对象时需要传递原始对象
    public ProxyFactory(Object tar){
        super();
        this.target= tar;
    }
    //获取代理对象
    public Object getProxy(){
        //获取一个类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //获取原始对象实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        Invoke invoke = new Invoke(target);
        return Proxy.newProxyInstance(classLoader,interfaces,invoke);
    }



}
