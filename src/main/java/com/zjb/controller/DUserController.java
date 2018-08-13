package com.zjb.controller;

import com.zjb.model.DUser;
import com.zjb.service.UserService;
import com.zjb.utils.LeeJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("update")
    public LeeJSONResult update() {
        DUser user = new DUser();
        user.setPassword("333");
//        user.setUsername("333");
        user.setId("7f4aab4c-e08c-449c-87a3-5e9810ea4d95");
        userService.update(user);
        return LeeJSONResult.ok("updated success");
    }

    @GetMapping("delete")
    public LeeJSONResult delete() {
        DUser user = new DUser();
        user.setId("7f4aab4c-e08c-449c-87a3-5e9810ea4d95");
        this.userService.delete(user);
        return LeeJSONResult.ok("deleted success");
    }

    @GetMapping("queryById")
    public LeeJSONResult queryById() {
        DUser user = new DUser();
        user.setId("93a4a89a-aab2-4799-9d6d-86b193cda296");
        DUser dUser = this.userService.queryById(user);
        return LeeJSONResult.ok(dUser);
    }

    @GetMapping("queryList")
    public LeeJSONResult queryList() {
        DUser dUser = new DUser();
        dUser.setUsername("ceshi");
        List<DUser> dUsers = this.userService.queryList(dUser);
        return LeeJSONResult.ok(dUsers);
    }
}
