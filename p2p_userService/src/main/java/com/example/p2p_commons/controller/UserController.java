package com.example.p2p_commons.controller;

import com.example.p2p_commons.commons.ReturnObject;
import com.example.p2p_commons.mybatis.entity.User;
import com.example.p2p_commons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/judgeUserLogin")
    public @ResponseBody ReturnObject<User> judgeUserLogin(String phone, String loginPassword){
        ReturnObject<User> returnObject = new ReturnObject<>();
        User user = userService.selectByPhone(phone,loginPassword);
        if(user != null){
            returnObject.setCode(200);
            returnObject.setResult(user);
            returnObject.setMsg("校验成功");
        }else {
            returnObject.setCode(-1);
            returnObject.setResult(user);
            returnObject.setMsg("校验失败");
        }
        return returnObject;
    }
}
