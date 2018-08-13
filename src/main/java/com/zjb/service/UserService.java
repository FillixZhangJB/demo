package com.zjb.service;

import com.zjb.model.DUser;

import java.util.List;

/**
 * Created by Administrator on 2018\8\14 0014.
 */
public interface UserService {
    void insert();

    void update(DUser user);

    void delete(DUser user);

    DUser queryById(DUser user);

    List<DUser> queryList(DUser user);
}
