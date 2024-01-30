package com.example.usertest.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

import java.io.Serializable;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/
@Data
public class SaleAccountAdjustment implements Serializable {

    /**主键**/
    private java.lang.Long id;

    /**调整单号**/
    private java.lang.String adjustmentNo;

    /**审核状态 0-待审核 1-已审核  2-已拒绝**/
    private java.lang.Integer checkType;

    /**客户id**/
    private java.lang.Long customId;

    /**客户名称**/
    private java.lang.String customName;

    /**对账单id**/
    private java.lang.Long accountId;

    /**对账单号**/
    private java.lang.String accountNo;

    /**销售对账调整单需要关联销售订单和销售出库单号**/
    private java.lang.String relationBill;

    /**关联销售订单号**/
    private java.lang.String relationSaleNo;

    /**关联销售出库单号**/
    private java.lang.String relationPullNo;

    /**调整原因**/
    private java.lang.String adjustmentReason;

    /**预留字段**/
    private java.lang.String reserve;

    /**拒绝理由：2-200字符**/
    private java.lang.String reason;

    /**备注**/
    private java.lang.String remark;

    /**创建时间**/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date createTime;

    /**创建人**/
    private java.lang.Long createUser;

    /**修改人**/
    private java.lang.Long updateUser;

    /**修改时间**/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date updateTime;

    /**是否删除**/
    private java.lang.Integer deleted;



}

