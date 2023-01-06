package com.example.p2p_consumer.service;

import com.example.p2p_commons.commons.ReturnObject;
import com.example.p2p_commons.mybatis.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "p2p-userService")
public interface UserService {
    @RequestMapping("/user/judgeUserLogin")
    public ReturnObject<User> judgeUserLogin(@RequestParam("phone") String phone,@RequestParam("loginPassword") String loginPassword);
}
