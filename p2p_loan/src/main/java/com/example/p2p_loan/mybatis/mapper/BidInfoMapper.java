package com.example.p2p_loan.mybatis.mapper;

import com.example.p2p_commons.mybatis.entity.BidInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BidInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BidInfo record);

    int insertSelective(BidInfo record);

    BidInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BidInfo record);

    int updateByPrimaryKey(BidInfo record);

    List<Map> selectBidInfoByUserIdLimit(@Param("userId")int userId, @Param("skipNum")int skipNum, @Param("limitNum")int limitNum);
}