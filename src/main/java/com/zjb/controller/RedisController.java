package com.zjb.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.zjb.Entity.User;
import com.zjb.utils.LeeJSONResult;
import com.zjb.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2009\8\20 0020.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    StringRedisTemplate strRedis;
    @Autowired
    RedisOperator redis;

    @GetMapping("/test")
    public LeeJSONResult redisTest(String str) {
        strRedis.opsForValue().set("token", str);
        String token = strRedis.opsForValue().get("token");
        return LeeJSONResult.ok(token);
    }

    @GetMapping("/redisJson")
    public LeeJSONResult getRedisList() {
        User user = new User();
        user.setAge(18);
        user.setName("慕课网");
        user.setPassWord("123456");

        User u1 = new User();
        u1.setAge(19);
        u1.setName("imooc");
        u1.setPassWord("123456");

        User u2 = new User();
        u2.setAge(17);
        u2.setName("hello imooc");
        u2.setPassWord("123456");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(u1);
        userList.add(u2);

        String jsonString = JSON.toJSONString(userList);
        redis.set("redisJson", jsonString, 2000);
        String redisJson = redis.get("redisJson");
        return LeeJSONResult.ok(redisJson);
    }
}

