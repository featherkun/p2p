package com.example.p2p_loan.mybatis.mapper;

import com.example.p2p_commons.mybatis.entity.LoanInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanInfo record);

    int insertSelective(LoanInfo record);

    LoanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanInfo record);

    int updateByPrimaryKeyWithBLOBs(LoanInfo record);

    int updateByPrimaryKey(LoanInfo record);
}