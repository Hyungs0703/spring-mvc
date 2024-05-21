package com.sparta.springmvc.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello World!!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "GET Method요청 ";
    }
    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "Post메서드 요청 ";
    }
    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "put 메소드 요청";
    }
    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE 메소드 요청 ";
    }
}
