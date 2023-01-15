package com.dailycodebuffer.Springboot.tutorial.controller;

/* @Auther: wuyang
 * @Date: 2023/01/07/13:45
 * @Description:
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.message}")   // 访问application.properties 变量
    private String welcomeMessage;
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return welcomeMessage;
    }
}
