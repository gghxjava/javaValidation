package com.example.usertest.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;
import org.springframework.beans.BeanUtils;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/
@Data
public class SaleAccountDetailVo extends SaleAccountDetail {
    /** 数量（包含单位）**/
    private String skuCountDesc;

    /** 单价（包含单位）**/
    private String skuPriceDesc;

    /**
     * 商品小计（包含单位）
     **/
    private String skuSubtotalDesc;

    /**
     * 客户名称
     **/
    private java.lang.String customName;

    /**
     * 商品图片url
     **/
    private String mainImage;

    /**
     * 申购来源Desc
     **/
    private String shortageSourceTypeDesc;


    /**
     * 上游单据-出入库单-id
     **/
    private java.lang.Long upstreamBillReturnId;

    /**
     * 货主
     */
    private Long cargoOwner;

    public SaleAccountDetailVo(){}
    public SaleAccountDetailVo(SaleAccountDetail pojo){
        if (null != pojo){
            BeanUtils.copyProperties(pojo,this);
//			if (null!=pojo.getSkuCount()){
//				this.setSkuCountDesc(pojo.getSkuCount()+" "+pojo.getSkuUnitName());
//			}
//			if (null != pojo.getSkuPrice()) {
//				this.setSkuPriceDesc(pojo.getSkuPrice()+"元/"+pojo.getSkuUnitName());
//			}
//			if (null != pojo.getSkuSubtotal()) {
//				this.setSkuSubtotalDesc(pojo.getSkuSubtotal()+"元");
//			}
        }
    }
}