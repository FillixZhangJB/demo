package com.zjb.controller;

import com.zjb.Entity.Resource;
import com.zjb.util.LeeJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018\8\11 0011.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    Resource resource;

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/getResource")
    public LeeJSONResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return LeeJSONResult.ok(bean);
    }
}
