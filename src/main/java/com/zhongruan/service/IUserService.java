package com.zhongruan.service;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IUserService {
    public List<UserInfo> findAll();
    public void insertUser(UserInfo userInfo);
    public void delUser(int id);
    public void updateUser(UserInfo userInfo);
    public UserInfo findOne(int id);
    public Boolean log(UserInfo userInfo);
}
