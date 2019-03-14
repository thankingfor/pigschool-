package com.pigschool.xyzshow.controller;

import com.pigschool.xyzshow.common.JsonReturn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author lyf
 * @create 2019-03-04 19:32
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "你好";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/exception")
    public String exception(){
        int i = 1 / 0;
        return "index";
    }

    @ResponseBody
    @RequestMapping("/time")
    public String test(){
        Date date = new Date();
        long time = date.getTime();
        return String.valueOf(time);
    }
}
