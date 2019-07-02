package com.zhongruan.service.impl;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.dao.IUserInfo;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserInfo userInfo;

    @Override
    public List<UserInfo> findAll(){
        return userInfo.findAll();
    }

    @Override
    public void insertUser(UserInfo user){ userInfo.insertUser(user);}

    @Override
    public void delUser(int id){ userInfo.delUser(id);}

    @Override
    public void updateUser(UserInfo user) {
        userInfo.updateUser(user);
    }

    @Override
    public UserInfo findOne(int id) {
        return userInfo.findOne(id);
    }

    @Override
    public Boolean log(UserInfo userInfo) {
        UserInfo userInfo1 = this.userInfo.log(userInfo);
        if(null != userInfo1){
            return true;
        }
        return false;
    }
}
