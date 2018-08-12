package com.zjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018\8\12 0012.
 */
@Controller
@RequestMapping("err")
public class ErrorController {
    @GetMapping("/error")
    public void error() {
        int a = 1 / 0;
    }
}
