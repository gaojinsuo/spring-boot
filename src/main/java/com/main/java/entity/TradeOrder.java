package com.main.java.entity;

import lombok.Data;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gaojinsuo on 2016/11/3.
 */
@Data
@Table(name="trade_order")
public class TradeOrder {
    private Long id;//ID
    private String mercOrdrNo;//交易订单号
    private String consNo;//消费订单号
    private String merchantId;//商户号
    private String appId;//应用ID
    private String userId;//用户号
    private String tradeType;//交易类型
    private String tradeCurCode;//交易订单币种
    private String expStlCurCode;//期望结算币种
    private BigDecimal tradeAmount;//交易订单金额
    private BigDecimal refundAmount;//可退款金额
    private Date tradeTime;//交易下单时间
    private Integer validNo;//交易有效分钟数
    private String tradeDesc;//订单描述
    private Integer status;//交易状态
    private String pageRetUrl;//交易完成跳转页面URL
    private String notifyUrl;//接收交易结果通知URL
    private String h5Url; // h5跳转地址
    private String version;//版本号
    private String appType;//前端应用类型
    private String appVersion;//前端应用版本号
    private String tradeIp;//交易IP
    private String userIp;//用户IP
    private Boolean acPayFlg;//有无账户标志
    private String usrAcNo;//用户主户
    private Boolean rfdFlg;//退款标志
    private BigDecimal feeAmt;//交易服务费金额
    private String usrToken;//用户令牌
    private String crdType;//资金卡类型
    private Date ordExpDt;//订单过期时间
    private String goodsNm;//商品名称
    private String goodsDesc;//商品描述
    private String rsv1;//预留字段1
    private String rsv2;//预留字段2
    private String rsv3;//预留字段3
    private String bnkNo;//银行卡号
    private String usrDevType;//设备类型
    private String usrDevVer;//系统版本号
    private String usrDevMac;//设备号
    private String usrPhoneType;//机型
    private String usrDevRsv1;//扩展字段1
    private String usrDevRsv2;//扩展字段2
    private String usrDevRsv3;//扩展字段3
    private BigDecimal gopPrice;//牌价, 冗余支付表中的字段
    private BigDecimal gopAmount; //实际支付果仁数, 冗余支付表中的字段
    private String payNo;//支付订单号
    private Date payTime;//订单日期
    private Integer isRefund;//退款状态，'0':未退款，'1':有退款
    private Integer payStl;//支付渠道
    private Date createTime;//订单创建时间
    private Date updateTime;//订单修改时间
}
