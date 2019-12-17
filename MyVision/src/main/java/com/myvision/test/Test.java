package com.myvision.test;

import com.myvision.bean.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class Test {
    @Autowired
    User user;

    @org.junit.Test
    public void test(){
        user.setUsername("aa");
        System.out.println(user.getUsername());
    }
}
