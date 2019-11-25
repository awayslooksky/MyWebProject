package com.huawei.service.proxy.jdk;

import com.huawei.servers.QieruCglib;
import com.huawei.servers.UserServiceCglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    //原始对象
    private  Object target;
    public CglibProxyFactory(Object target){
        super();
        this.target=target;
    }
    public Object getProxy(){
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置被增强的类
        enhancer.setSuperclass(UserServiceCglib.class);
        //设置回调对象
        enhancer.setCallback(this);
        //生成代理对象并返回
        Object o = enhancer.create();
        return o;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        QieruCglib qieruCglib = new QieruCglib();
        qieruCglib.before();
        //调用超级类的业务方法
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
