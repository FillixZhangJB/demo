package com.zjb.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjb.mapper.DUserMapper;
import com.zjb.model.DUser;
import com.zjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
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

    @Override
    public void update(DUser user) {
//        this.userMapper.updateByPrimaryKey(user);
        this.userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delete(DUser user) {
        this.userMapper.deleteByPrimaryKey(user);
    }

    @Override
    public DUser queryById(DUser user) {
        DUser dUser = this.userMapper.selectByPrimaryKey(user.getId());
        return dUser;
    }

    @Override
    public List<DUser> queryList(DUser user) {
        Example example = new Example(DUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("username", "%" + user.getUsername() + "%");
        List<DUser> dUsers = this.userMapper.selectByExample(example);
        return dUsers;
    }

    public Object queryListByPage(DUser user, int pageNum, int size) {
        PageHelper.startPage(pageNum, size);
        Example example = new Example(DUser.class);
        Example.Criteria criteria = example.createCriteria();
        Page<DUser> page = new Page<DUser>();
        List<DUser> dUsers = this.userMapper.selectByExample(example);
        return dUsers;
    }

}
