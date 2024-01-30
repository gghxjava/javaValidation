package com.example.usertest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;
import java.io.Serializable;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/
@Data
public class SaleAccountDetail implements Serializable {

    /**主键**/
    private java.lang.Long id;

    /**出/入库单明细主键**/
    private java.lang.Long outboundDetailId;

    /**反向对账明细关联正向出库明细ID --> 入库单：记录出库单ID和出库明细商品ID  **/
    private java.lang.Long associationOutboundDetailId;

    /**对账单主键**/
    private java.lang.Long accountId;

    /**对账单号**/
    private java.lang.String accountNo;

    /**批次号**/
    private java.lang.Long batchNo;

    /**sku编码**/
    private java.lang.String skuCode;

    /**sku主键**/
    private java.lang.Long skuId;

    /**商品品牌**/
    private java.lang.String skuType;

    /**sku名称**/
    private java.lang.String skuName;

    /**商品规格**/
    private java.lang.String skuSpec;

    /**数量**/
    private java.math.BigDecimal skuCount;

    /**可退数量**/
    private java.math.BigDecimal skuReturnableCount;

    /**单位名称**/
    private java.lang.String skuUnitName;

    /**平摊运费前的单价**/
    private java.math.BigDecimal skuPriceOld;

    /**单价**/
    private java.math.BigDecimal skuPrice;

    /**商品小计**/
    private java.math.BigDecimal skuSubtotal;

    /**
     * 调价次数
     **/
    private java.lang.Integer passAdjustCount;

    /**共享仓客户支持价格未确定的前提下将商品出库-待确定**/
    private java.lang.String skuDissure;

    /**该商品的货主是否是自己的  0-不是  1-是  商品类型(0-自营  1-代管) **/
    private java.lang.Integer skuOwner;

    /**备注**/
    private java.lang.String remak;

    /****/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date createTime;

    /****/
    private java.lang.Long createUser;

    /**修改人**/
    private java.lang.Long updateUser;

    /****/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date updateTime;

    /**是否删除**/
    private java.lang.Integer deleted;



}

