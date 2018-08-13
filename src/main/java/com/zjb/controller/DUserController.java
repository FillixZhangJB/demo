package com.zjb.controller;

import com.zjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018\8\14 0014.
 */
@RestController
@RequestMapping("duser")
public class DUserController {
    @Autowired
    UserService userService;

    @GetMapping("insert")
    public String insert() {
        this.userService.insert();
        return "success";
    }
}
