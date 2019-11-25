package com.huawei.service.proxy.jdk;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Invoke implements InvocationHandler {

    private Object target;

    public Invoke(Object tar){
        target=tar;
    }
    //调用代理对象的业务方法时，会被调用的方法
    @Override
    public Object invoke(Object target, Method method, Object[] objects) throws Throwable {
        target=this.target;
        //增加增强的业务逻辑
        SecurityAspect aspect = new SecurityAspect();
        aspect.checkPrivilege();
        //反射的方式调用原始对象的业务方法
        /**
         * target:原始对象
         * args：调用方法传递的参数
         */
        Object result = method.invoke(target, objects);

        System.out.println("上面都执行完了哦");
        return result;
    }
}
