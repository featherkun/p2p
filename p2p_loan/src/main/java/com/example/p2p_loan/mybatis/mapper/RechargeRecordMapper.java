package com.example.p2p_loan.mybatis.mapper;

import com.example.p2p_commons.mybatis.entity.RechargeRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    RechargeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}