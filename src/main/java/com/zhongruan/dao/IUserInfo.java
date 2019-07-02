package com.zhongruan.dao;

import com.zhongruan.bean.UserInfo;

import java.util.List;

public interface IUserInfo {
    public List<UserInfo> findAll();
    public void insertUser(UserInfo userInfo);
    public void delUser(int id);
    public void updateUser(UserInfo user);
    public UserInfo findOne(int id);
    public UserInfo log(UserInfo userInfo);
}
