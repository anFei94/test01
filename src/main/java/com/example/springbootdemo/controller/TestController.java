package com.example.springbootdemo.controller;

import com.example.springbootdemo.SpringbootdemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringbootdemoApplication.class)
@Slf4j
public class TestController {

    //private Logger log = LoggerFactory.getLogger(TestController.class);

    @Test
    public void test01(){
        System.out.println("test01......");
    }

    @Test
    public void test02(){
        System.out.println(MessageFormat.format("你是{1}的{2}", "a", "f"));
    }

    @Test
    public void test03(){
        ArrayList<String> strings = Lists.newArrayList("a", "b", "b","v", "d", "e");
        for (int i = 0; i < strings.size(); i++) {
            if ("b".equals(strings.get(i)))
            strings.remove(i);
            System.out.println(strings.get(i));
            System.out.println(i);
        }
        ArrayList<Object> objects = new ArrayList<>();
    }

    @Test
    public void test04(){
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

    }

    private static String format(Date time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(time);
    }

    @Test
    public void test05(){
        log.debug("cs222");
        log.error("{}de{}ff{}","你好","测试","没有响应");
    }

    @Test
    public void test07(){
        log.debug("cs");
        log.error("{}de{}ff{}","你好","测试","没有响应");
        log.debug("dev1111");
    }

    @Test
    public void test06(){
        log.debug("cs2222fff22");
        log.error("{}de{}ff{}","你好","测试","没有响应222222222");
        log.debug("dev1123");
    }

}
