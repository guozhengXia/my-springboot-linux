package com.honor.linux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Author fighting
 * @Date 2021-07-11 17:37
 */
@RestController
public class TestController {

    @GetMapping("/get")
    public String get(){
        System.out.println("get 方法被调用了, 时间："+ LocalDateTime.now());
        return "success";
    }
}
