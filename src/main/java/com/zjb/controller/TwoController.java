package com.zjb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zjb on 2018/9/4.
 * 用于测试拦截器
 */
@Controller
@RequestMapping("tow")
public class TwoController {

    @RequestMapping("ceshi")
    public String ceshi() {
        return null;
    }
}
