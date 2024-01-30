package com.example.usertest.entity;


import lombok.Data;
import org.springframework.beans.BeanUtils;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/
@Data
public class SaleAccountAdjustmentDetailVo extends SaleAccountAdjustmentDetail {
    /** 显示创建时间 **/
    private String displayCreateTime;






    /**sku编码**/
    private java.lang.String skuCode;

    /**商品品牌**/
    private java.lang.String skuType;

    /**sk名称**/
    private java.lang.String skuName;

    /**商品规格**/
    private java.lang.String skuSpec;

    /**数量**/
    private java.math.BigDecimal skuCount;

    /**单位名称**/
    private java.lang.String skuUnitName;


    public SaleAccountAdjustmentDetailVo(){}
    public SaleAccountAdjustmentDetailVo(SaleAccountAdjustmentDetail pojo){
        if (null != pojo){
            BeanUtils.copyProperties(pojo,this);
        }
    }
}
