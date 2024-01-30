package com.example.usertest.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.List;


/**
 * * @description: 描述
 * * @author: Qiumc
 * * @create: 2018-09-31 15:25
 **/
@Data
public class SaleBalanceVo extends SaleBalance {

    /**
     * 销售结算类型 0-销售结算 1-退货结算
     */
    private String saleBalanceTypeDesc;

    /**
     * 开票状态 0-未开票  1-已开票
     */
    private String invoiceDesc;

    /**
     * 开票类型 0-普通  1-专用
     */
    private String invoiceTypeDesc;


    /**
     * 对账单ID
     */
    private List<Long> saleAccountIds;

    /**
     *
     */
    private String skuCode;

    /**
     * 结算单ID
     */
    private List<Long> saleBalanceIds;

    /**
     * 结算单关联发票信息
     */
    private Invoice invoiceVo;

    /**
     * 发票金额
     **/
    private java.math.BigDecimal invoiceMoney;

    /**
     * 发票数量
     */
    private java.lang.Integer invoiceCount;

    /**
     * 发票ID
     */
    private java.lang.Long invoiceId;

    /**
     * 关联发票
     */
    List<BalanceInvoiceVo> balanceInvoices;

    /**
     * 结算金额：0  大于零   1  小于零
     */
    private Integer greaterOrLess;

    /**
     * 拒绝原因
     **/
    private java.lang.String refuseReason;


    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date startTime;
    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date endTime;


    /**
     * 创建人 (展示)
     */
    private java.lang.String createUserDesc;

    /**
     * 结算单明细
     */
    private List<SaleBalanceDetailVo> saleBalanceDetailVos;

    /**
     * 结算单明细分组
     */
    private List<List<SaleBalanceDetailVo>> saleBalanceDetailsGrouping;

    /**
     * 结算单 关联单据 正向关联反向，反向关联正向
     */
    private List<AssociationBill> associationBillList;


    /**
     * 关联对账单
     */
    private List<SaleAccount> saleAccounts;

    /**
     * 商品运费
     **/
    private java.math.BigDecimal freight;


    /**
     * 一张结算单 关联多张发票
     */
    private List<InvoiceVo> invoices;

    private List<BalanceInvoice> invoiceList;

    /**
     * 发票总额：已关联发票的金额之和
     */
    private BigDecimal invoiceTotalPrice;

    /**
     * 总额差异：结算总额-发票总额
     */
    private BigDecimal defferencePrice;

    /**对账单号**/
    private java.lang.String accountNo;

    /**多种单号**/
    private java.lang.String oddNumbers;

    /**简短创建时间**/
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private java.util.Date simpleCreateTime;


    public SaleBalanceVo() {
    }

}
