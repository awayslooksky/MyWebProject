package com.huawei.service.proxy.jdk;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class SecurityAspect {
   /* static {
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("我是普通代码块");
    }*/
    //权限校验的系统逻辑
    @Before(value = "execution(* *.*add(..))")
    public void checkPrivilege(){
        System.out.println("我是权限校验的方法，我需要在方法执行前执行");
    }
    public void test(){
        System.out.println("我是后置通知方法");
    }
    public static void a(){
        System.out.println("我是静态方法");
    }
    public void b(){
        System.out.println("我是未做关联的普通方法");
    }
}
