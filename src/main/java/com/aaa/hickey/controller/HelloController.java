package com.aaa.hickey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value="hello")
    public String Hello(){
        System.out.println("这是我的Idea第一次使用");
        System.out.println("shenme ");
        ArrayList<Object> objects = new ArrayList<>();
        return "Hello Word";
    }
}
