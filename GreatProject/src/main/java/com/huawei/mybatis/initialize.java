package com.huawei.mybatis;

public class initialize {
    static {
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("我是普通代码块");
    }
    public initialize(){
        System.out.println("我是无参构造器");
    }
    public void a(){
        System.out.println("我是普通方法");
    }
    public static void b(){
        System.out.println("我是静态方法");
    }
}
