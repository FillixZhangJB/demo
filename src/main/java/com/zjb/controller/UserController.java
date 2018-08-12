package com.zjb.controller;

import com.zjb.Entity.User;
import com.zjb.util.LeeJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2018\8\11 0011.
 */
//@Controller
@RestController  //@RestController = @Controller + @ResponseBody  返回json字符串
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setAge(11);
        user.setName("zjb");
        user.setPassWord("123456");
        user.setBirthDay(new Date());
        user.setDesc(null);
        return user;
    }

    @GetMapping("/getUserJson")
//    @ResponseBody
    public LeeJSONResult getUserJson() {
        User user = new User();
        user.setAge(11);
        user.setName("zjb");
        user.setPassWord("123456");
        user.setBirthDay(new Date());
        user.setDesc("测试热部署");
        return LeeJSONResult.ok(user);
    }
}
