package com.example.p2p_loan.service.impl;

import com.example.p2p_loan.mybatis.mapper.BidInfoMapper;
import com.example.p2p_loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    BidInfoMapper bidInfoMapper;

    @Override
    public Map initMycenterLoanByUserId(int userId) {
        List<Map> bidInfoList = bidInfoMapper.selectBidInfoByUserIdLimit(userId,0,5);
        Map<String,List> result = new HashMap();
        result.put("bidInfoList",bidInfoList);
        return result;
    }
}
