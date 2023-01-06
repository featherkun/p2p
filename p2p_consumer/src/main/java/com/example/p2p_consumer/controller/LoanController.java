package com.example.p2p_consumer.controller;

import com.example.p2p_commons.commons.ReturnObject;
import com.example.p2p_commons.mybatis.entity.User;
import com.example.p2p_consumer.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    LoanService loanService;

    @RequestMapping("/myCenter")
    public String myCenter(HttpSession httpSession){
        User user = (User) httpSession.getAttribute("userSession");
        ReturnObject<Map> returnObject = loanService.initMycenterLoanByUserId(user.getId());
        return "myCenter";
    }
}
