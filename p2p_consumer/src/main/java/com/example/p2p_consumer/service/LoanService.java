package com.example.p2p_consumer.service;

import com.example.p2p_commons.commons.ReturnObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@FeignClient(name = "p2p-loan")
public interface LoanService {
    @RequestMapping("/loan/initMycenterLoanByUserId")
    public ReturnObject<Map> initMycenterLoanByUserId(@RequestParam("userId") int userId);
}
