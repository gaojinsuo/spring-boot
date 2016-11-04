package com.main.java.dao;

import com.main.java.entity.TradeOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * Created by gaojinsuo on 2016/11/3.
 */
@Mapper
public interface TradeOrderService{
    @Select("select * from trade_order where consNo=#{consNo}")
    List<TradeOrder> OrderSearchForConsNo(String consNo);

}
