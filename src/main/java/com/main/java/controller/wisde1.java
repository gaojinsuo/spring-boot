package com.main.java.controller;

import com.main.java.dao.TradeOrderService;
import com.main.java.entity.TradeOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojinsuo on 2016/11/3.
 */
@RestController
public class wisde1 {
//    @Value("${book.author}")
//    private String author;
//    @Value("${book.name}")
//    private String name;
    @Autowired
    public TradeOrderService tradeOrderService;
    String conson = "MN786776607566180353";
    @RequestMapping("/hello")
    public String hello(){
        List<TradeOrder> tradeOrders = tradeOrderService.OrderSearchForConsNo(conson);
        return tradeOrders.get(0).getAppId();
    }
}
