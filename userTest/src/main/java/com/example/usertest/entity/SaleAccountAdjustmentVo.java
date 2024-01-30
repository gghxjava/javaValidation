package com.example.usertest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/

@Data
public class SaleAccountAdjustmentVo extends SaleAccountAdjustment {

    /**
     * 审核状态 0-待审核 1-已审核  2-已拒绝
     */
    private String checkTypeDesc;

    /**
     * 对账单时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date accountCreateTime;


    /**客户编号-用户对账确认**/
    private java.lang.String customNo;

    /**
     * 调价明细
     */
    private List<SaleAccountAdjustmentDetailVo> detailList;



    /**
     * 添加时间 开始
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date startTime;

    /**
     * 时间 结束
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date endTime;


    public SaleAccountAdjustmentVo(){}
}