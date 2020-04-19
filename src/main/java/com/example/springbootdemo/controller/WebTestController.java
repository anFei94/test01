package com.example.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/web")
@Slf4j
public class WebTestController {

    @GetMapping("/test")
    public String webTest01(){
        log.error("{}de{}ff{}","你好","测试","没有响应");
        return "test001";
    }


}
