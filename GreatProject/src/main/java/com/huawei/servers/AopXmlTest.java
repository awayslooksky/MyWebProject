package com.huawei.servers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/springconfig.xml")
public class AopXmlTest {
    /*static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springconfig.xml");*/
    @Autowired
    private UserService userService;
    @Test
    public void testAdd(){
        /*UserService userservice = (UserService) context.getBean("userservice");
        this.userService=userservice;*/
        userService.add();
        userService.delete("5");
        /*userService.getByid("");
        userService.delete("");*/
    }
}
