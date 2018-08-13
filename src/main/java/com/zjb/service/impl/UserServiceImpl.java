package com.zjb.service.impl;

import com.zjb.mapper.DUserMapper;
import com.zjb.model.DUser;
import com.zjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Administrator on 2018\8\14 0014.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    DUserMapper userMapper;

    @Override
    public void insert() {
        DUser user = new DUser();
        user.setId(UUID.randomUUID().toString());
        user.setUsername("ceshi");
        user.setPassword("ceshi");
        this.userMapper.insert(user);
    }
}
