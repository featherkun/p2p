package com.example.p2p_commons.service;

import com.example.p2p_commons.mybatis.entity.User;
import com.example.p2p_commons.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Boolean judgeUserLogin(Integer phone,String loginPassword){
        User user = userMapper.selectByPrimaryKey(phone);
        if(user != null && loginPassword.equals(user.getLoginPassword())){
            User update = new User();
            update.setId(user.getId());
            Date date = new Date();
            update.setLastLoginTime(date);
            userMapper.updateByPrimaryKeySelective(update);
            user.setLastLoginTime(date);
            return true;
        }
        return false;
    }

    public User selectByPhone(String phone, String loginPassword){
        User user = userMapper.selectByPhone(phone);
        if(user != null && loginPassword.equals(user.getLoginPassword())){
            User update = new User();
            update.setId(user.getId());
            Date date = new Date();
            update.setLastLoginTime(date);
            userMapper.updateByPrimaryKeySelective(update);
            user.setLastLoginTime(date);
            user.setLastLoginTime(date);
            return user;
        }else {
            return null;
        }

    }
}
