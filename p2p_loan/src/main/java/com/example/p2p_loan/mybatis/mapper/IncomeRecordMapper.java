package com.example.p2p_loan.mybatis.mapper;

import com.example.p2p_commons.mybatis.entity.IncomeRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IncomeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IncomeRecord record);

    int insertSelective(IncomeRecord record);

    IncomeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IncomeRecord record);

    int updateByPrimaryKey(IncomeRecord record);
}