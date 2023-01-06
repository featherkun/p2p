package com.example.p2p_loan.controller;

import com.example.p2p_commons.commons.Constants;
import com.example.p2p_commons.commons.ReturnObject;
import com.example.p2p_loan.service.impl.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @Autowired
    LoanServiceImpl loanService;

    @RequestMapping("/initMycenterLoanByUserId")
    public ReturnObject<Map> initMycenterLoanByUserId(int userId){
        ReturnObject<Map> returnObject = new ReturnObject<>();
        returnObject.setResult(loanService.initMycenterLoanByUserId(userId));
        returnObject.setCode(Constants.SUCCESS);
        returnObject.setMsg("请求成功");
        return returnObject;
    }
}
