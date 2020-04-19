package com.example.springbootdemo.test;

import com.example.springbootdemo.SpringbootdemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootdemoApplication.class)
public class TestController {

    @Test
    public void test(){
        System.out.println("参数Junit");
    }
}
