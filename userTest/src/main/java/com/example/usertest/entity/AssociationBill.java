package com.example.usertest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * * @description: 对账单的关联单据  结算单关联的正反向财务单据
 * * @author: 邱美昌
 * * @create: 2019-05-13 09:53
 **/
@Data
public class AssociationBill {

    /**
     * 单据ID
     */
    private java.lang.Long billId;

    /**
     * 单据名称
     **/
    private java.lang.String billName;

    /**
     * 单据编号
     */
    private java.lang.String billNumber;

    /**
     * 单据状态
     */
    private java.lang.String billStatus;

    /**
     * 单据类型 1-对账调整单   2-对账单    3-结算单
     **/
    private java.lang.Integer billType;



    /**
     * 单据类型 退货对账 和 退货结算
     **/
    private java.lang.String billTypeStr;



    /**创建时间**/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date createTime;
}
