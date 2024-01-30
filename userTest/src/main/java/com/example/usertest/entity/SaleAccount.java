package com.example.usertest.entity;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.example.usertest.anno.ColumnNumberOneAnnotation;
import com.example.usertest.entity.LongJsonDeserializer;
import com.example.usertest.entity.LongJsonSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class SaleAccount implements Serializable {
    //@Id
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long id;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 0.0F,
            fieldName = "对账单号"
    )
    private String accountNo;
    private Integer accountType;
    private Integer accountStatus;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long customId;
    private String customNo;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 3.0F,
            fieldName = "客户名称"
    )
    private String customName;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 4.0F,
            fieldName = "对账金额"
    )
    private BigDecimal accountMoney;
    private BigDecimal skuTotalMoney;
    private BigDecimal skuTotalFreight;
    private BigDecimal freight;
    private Integer balanceGenerator;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long balanceId;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 5.0F,
            fieldName = "结算单号"
    )
    private String balanceNo;
    private Integer balanceStatus;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long upstreamBillSaleId;
    private String upstreamBillSaleNo;
    private String upstreamBillSaleName;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date upstreamBillSaleTime;
    private String upstreamBillSale;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long upstreamBillReturnId;
    private String upstreamBillReturnNo;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 6.0F,
            fieldName = "领用部门"
    )
    private String upstreamBillReturnDept;
    private String upstreamBillReturnName;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date upstreamBillReturnTime;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long inRelationOutBoundId;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long inRelationSaleId;
    private String inRelationSaleNo;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long outRelationSaleId;
    private String upstreamBillNo;
    private String upstreamBillReturn;
    private String orderAreaCode;
    private String prepareOne;
    private String prepareTwo;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long accountSourceId;
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @ColumnNumberOneAnnotation(
            exportOrderNum = 8.0F,
            fieldName = "添加时间"
    )
    private Date createTime;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long createUser;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long updateUser;
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date updateTime;
    private Integer deleted;
    private String remark;

    public SaleAccount() {
    }

    public Long getId() {
        return this.id;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public Integer getAccountType() {
        return this.accountType;
    }

    public Integer getAccountStatus() {
        return this.accountStatus;
    }

    public Long getCustomId() {
        return this.customId;
    }

    public String getCustomNo() {
        return this.customNo;
    }

    public String getCustomName() {
        return this.customName;
    }

    public BigDecimal getAccountMoney() {
        return this.accountMoney;
    }

    public BigDecimal getSkuTotalMoney() {
        return this.skuTotalMoney;
    }

    public BigDecimal getSkuTotalFreight() {
        return this.skuTotalFreight;
    }

    public BigDecimal getFreight() {
        return this.freight;
    }

    public Integer getBalanceGenerator() {
        return this.balanceGenerator;
    }

    public Long getBalanceId() {
        return this.balanceId;
    }

    public String getBalanceNo() {
        return this.balanceNo;
    }

    public Integer getBalanceStatus() {
        return this.balanceStatus;
    }

    public Long getUpstreamBillSaleId() {
        return this.upstreamBillSaleId;
    }

    public String getUpstreamBillSaleNo() {
        return this.upstreamBillSaleNo;
    }

    public String getUpstreamBillSaleName() {
        return this.upstreamBillSaleName;
    }

    public Date getUpstreamBillSaleTime() {
        return this.upstreamBillSaleTime;
    }

    public String getUpstreamBillSale() {
        return this.upstreamBillSale;
    }

    public Long getUpstreamBillReturnId() {
        return this.upstreamBillReturnId;
    }

    public String getUpstreamBillReturnNo() {
        return this.upstreamBillReturnNo;
    }

    public String getUpstreamBillReturnDept() {
        return this.upstreamBillReturnDept;
    }

    public String getUpstreamBillReturnName() {
        return this.upstreamBillReturnName;
    }

    public Date getUpstreamBillReturnTime() {
        return this.upstreamBillReturnTime;
    }

    public Long getInRelationOutBoundId() {
        return this.inRelationOutBoundId;
    }

    public Long getInRelationSaleId() {
        return this.inRelationSaleId;
    }

    public String getInRelationSaleNo() {
        return this.inRelationSaleNo;
    }

    public Long getOutRelationSaleId() {
        return this.outRelationSaleId;
    }

    public String getUpstreamBillNo() {
        return this.upstreamBillNo;
    }

    public String getUpstreamBillReturn() {
        return this.upstreamBillReturn;
    }

    public String getOrderAreaCode() {
        return this.orderAreaCode;
    }

    public String getPrepareOne() {
        return this.prepareOne;
    }

    public String getPrepareTwo() {
        return this.prepareTwo;
    }

    public Long getAccountSourceId() {
        return this.accountSourceId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getCreateUser() {
        return this.createUser;
    }

    public Long getUpdateUser() {
        return this.updateUser;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public void setAccountMoney(BigDecimal accountMoney) {
        this.accountMoney = accountMoney;
    }

    public void setSkuTotalMoney(BigDecimal skuTotalMoney) {
        this.skuTotalMoney = skuTotalMoney;
    }

    public void setSkuTotalFreight(BigDecimal skuTotalFreight) {
        this.skuTotalFreight = skuTotalFreight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public void setBalanceGenerator(Integer balanceGenerator) {
        this.balanceGenerator = balanceGenerator;
    }

    public void setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }

    public void setBalanceStatus(Integer balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    public void setUpstreamBillSaleId(Long upstreamBillSaleId) {
        this.upstreamBillSaleId = upstreamBillSaleId;
    }

    public void setUpstreamBillSaleNo(String upstreamBillSaleNo) {
        this.upstreamBillSaleNo = upstreamBillSaleNo;
    }

    public void setUpstreamBillSaleName(String upstreamBillSaleName) {
        this.upstreamBillSaleName = upstreamBillSaleName;
    }

    public void setUpstreamBillSaleTime(Date upstreamBillSaleTime) {
        this.upstreamBillSaleTime = upstreamBillSaleTime;
    }

    public void setUpstreamBillSale(String upstreamBillSale) {
        this.upstreamBillSale = upstreamBillSale;
    }

    public void setUpstreamBillReturnId(Long upstreamBillReturnId) {
        this.upstreamBillReturnId = upstreamBillReturnId;
    }

    public void setUpstreamBillReturnNo(String upstreamBillReturnNo) {
        this.upstreamBillReturnNo = upstreamBillReturnNo;
    }

    public void setUpstreamBillReturnDept(String upstreamBillReturnDept) {
        this.upstreamBillReturnDept = upstreamBillReturnDept;
    }

    public void setUpstreamBillReturnName(String upstreamBillReturnName) {
        this.upstreamBillReturnName = upstreamBillReturnName;
    }

    public void setUpstreamBillReturnTime(Date upstreamBillReturnTime) {
        this.upstreamBillReturnTime = upstreamBillReturnTime;
    }

    public void setInRelationOutBoundId(Long inRelationOutBoundId) {
        this.inRelationOutBoundId = inRelationOutBoundId;
    }

    public void setInRelationSaleId(Long inRelationSaleId) {
        this.inRelationSaleId = inRelationSaleId;
    }

    public void setInRelationSaleNo(String inRelationSaleNo) {
        this.inRelationSaleNo = inRelationSaleNo;
    }

    public void setOutRelationSaleId(Long outRelationSaleId) {
        this.outRelationSaleId = outRelationSaleId;
    }

    public void setUpstreamBillNo(String upstreamBillNo) {
        this.upstreamBillNo = upstreamBillNo;
    }

    public void setUpstreamBillReturn(String upstreamBillReturn) {
        this.upstreamBillReturn = upstreamBillReturn;
    }

    public void setOrderAreaCode(String orderAreaCode) {
        this.orderAreaCode = orderAreaCode;
    }

    public void setPrepareOne(String prepareOne) {
        this.prepareOne = prepareOne;
    }

    public void setPrepareTwo(String prepareTwo) {
        this.prepareTwo = prepareTwo;
    }

    public void setAccountSourceId(Long accountSourceId) {
        this.accountSourceId = accountSourceId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SaleAccount)) {
            return false;
        } else {
            SaleAccount other = (SaleAccount)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label503: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label503;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label503;
                    }

                    return false;
                }

                Object this$accountNo = this.getAccountNo();
                Object other$accountNo = other.getAccountNo();
                if (this$accountNo == null) {
                    if (other$accountNo != null) {
                        return false;
                    }
                } else if (!this$accountNo.equals(other$accountNo)) {
                    return false;
                }

                label489: {
                    Object this$accountType = this.getAccountType();
                    Object other$accountType = other.getAccountType();
                    if (this$accountType == null) {
                        if (other$accountType == null) {
                            break label489;
                        }
                    } else if (this$accountType.equals(other$accountType)) {
                        break label489;
                    }

                    return false;
                }

                Object this$accountStatus = this.getAccountStatus();
                Object other$accountStatus = other.getAccountStatus();
                if (this$accountStatus == null) {
                    if (other$accountStatus != null) {
                        return false;
                    }
                } else if (!this$accountStatus.equals(other$accountStatus)) {
                    return false;
                }

                label475: {
                    Object this$customId = this.getCustomId();
                    Object other$customId = other.getCustomId();
                    if (this$customId == null) {
                        if (other$customId == null) {
                            break label475;
                        }
                    } else if (this$customId.equals(other$customId)) {
                        break label475;
                    }

                    return false;
                }

                Object this$customNo = this.getCustomNo();
                Object other$customNo = other.getCustomNo();
                if (this$customNo == null) {
                    if (other$customNo != null) {
                        return false;
                    }
                } else if (!this$customNo.equals(other$customNo)) {
                    return false;
                }

                label461: {
                    Object this$customName = this.getCustomName();
                    Object other$customName = other.getCustomName();
                    if (this$customName == null) {
                        if (other$customName == null) {
                            break label461;
                        }
                    } else if (this$customName.equals(other$customName)) {
                        break label461;
                    }

                    return false;
                }

                label454: {
                    Object this$accountMoney = this.getAccountMoney();
                    Object other$accountMoney = other.getAccountMoney();
                    if (this$accountMoney == null) {
                        if (other$accountMoney == null) {
                            break label454;
                        }
                    } else if (this$accountMoney.equals(other$accountMoney)) {
                        break label454;
                    }

                    return false;
                }

                Object this$skuTotalMoney = this.getSkuTotalMoney();
                Object other$skuTotalMoney = other.getSkuTotalMoney();
                if (this$skuTotalMoney == null) {
                    if (other$skuTotalMoney != null) {
                        return false;
                    }
                } else if (!this$skuTotalMoney.equals(other$skuTotalMoney)) {
                    return false;
                }

                label440: {
                    Object this$skuTotalFreight = this.getSkuTotalFreight();
                    Object other$skuTotalFreight = other.getSkuTotalFreight();
                    if (this$skuTotalFreight == null) {
                        if (other$skuTotalFreight == null) {
                            break label440;
                        }
                    } else if (this$skuTotalFreight.equals(other$skuTotalFreight)) {
                        break label440;
                    }

                    return false;
                }

                label433: {
                    Object this$freight = this.getFreight();
                    Object other$freight = other.getFreight();
                    if (this$freight == null) {
                        if (other$freight == null) {
                            break label433;
                        }
                    } else if (this$freight.equals(other$freight)) {
                        break label433;
                    }

                    return false;
                }

                Object this$balanceGenerator = this.getBalanceGenerator();
                Object other$balanceGenerator = other.getBalanceGenerator();
                if (this$balanceGenerator == null) {
                    if (other$balanceGenerator != null) {
                        return false;
                    }
                } else if (!this$balanceGenerator.equals(other$balanceGenerator)) {
                    return false;
                }

                Object this$balanceId = this.getBalanceId();
                Object other$balanceId = other.getBalanceId();
                if (this$balanceId == null) {
                    if (other$balanceId != null) {
                        return false;
                    }
                } else if (!this$balanceId.equals(other$balanceId)) {
                    return false;
                }

                label412: {
                    Object this$balanceNo = this.getBalanceNo();
                    Object other$balanceNo = other.getBalanceNo();
                    if (this$balanceNo == null) {
                        if (other$balanceNo == null) {
                            break label412;
                        }
                    } else if (this$balanceNo.equals(other$balanceNo)) {
                        break label412;
                    }

                    return false;
                }

                Object this$balanceStatus = this.getBalanceStatus();
                Object other$balanceStatus = other.getBalanceStatus();
                if (this$balanceStatus == null) {
                    if (other$balanceStatus != null) {
                        return false;
                    }
                } else if (!this$balanceStatus.equals(other$balanceStatus)) {
                    return false;
                }

                Object this$upstreamBillSaleId = this.getUpstreamBillSaleId();
                Object other$upstreamBillSaleId = other.getUpstreamBillSaleId();
                if (this$upstreamBillSaleId == null) {
                    if (other$upstreamBillSaleId != null) {
                        return false;
                    }
                } else if (!this$upstreamBillSaleId.equals(other$upstreamBillSaleId)) {
                    return false;
                }

                label391: {
                    Object this$upstreamBillSaleNo = this.getUpstreamBillSaleNo();
                    Object other$upstreamBillSaleNo = other.getUpstreamBillSaleNo();
                    if (this$upstreamBillSaleNo == null) {
                        if (other$upstreamBillSaleNo == null) {
                            break label391;
                        }
                    } else if (this$upstreamBillSaleNo.equals(other$upstreamBillSaleNo)) {
                        break label391;
                    }

                    return false;
                }

                Object this$upstreamBillSaleName = this.getUpstreamBillSaleName();
                Object other$upstreamBillSaleName = other.getUpstreamBillSaleName();
                if (this$upstreamBillSaleName == null) {
                    if (other$upstreamBillSaleName != null) {
                        return false;
                    }
                } else if (!this$upstreamBillSaleName.equals(other$upstreamBillSaleName)) {
                    return false;
                }

                label377: {
                    Object this$upstreamBillSaleTime = this.getUpstreamBillSaleTime();
                    Object other$upstreamBillSaleTime = other.getUpstreamBillSaleTime();
                    if (this$upstreamBillSaleTime == null) {
                        if (other$upstreamBillSaleTime == null) {
                            break label377;
                        }
                    } else if (this$upstreamBillSaleTime.equals(other$upstreamBillSaleTime)) {
                        break label377;
                    }

                    return false;
                }

                Object this$upstreamBillSale = this.getUpstreamBillSale();
                Object other$upstreamBillSale = other.getUpstreamBillSale();
                if (this$upstreamBillSale == null) {
                    if (other$upstreamBillSale != null) {
                        return false;
                    }
                } else if (!this$upstreamBillSale.equals(other$upstreamBillSale)) {
                    return false;
                }

                label363: {
                    Object this$upstreamBillReturnId = this.getUpstreamBillReturnId();
                    Object other$upstreamBillReturnId = other.getUpstreamBillReturnId();
                    if (this$upstreamBillReturnId == null) {
                        if (other$upstreamBillReturnId == null) {
                            break label363;
                        }
                    } else if (this$upstreamBillReturnId.equals(other$upstreamBillReturnId)) {
                        break label363;
                    }

                    return false;
                }

                Object this$upstreamBillReturnNo = this.getUpstreamBillReturnNo();
                Object other$upstreamBillReturnNo = other.getUpstreamBillReturnNo();
                if (this$upstreamBillReturnNo == null) {
                    if (other$upstreamBillReturnNo != null) {
                        return false;
                    }
                } else if (!this$upstreamBillReturnNo.equals(other$upstreamBillReturnNo)) {
                    return false;
                }

                label349: {
                    Object this$upstreamBillReturnDept = this.getUpstreamBillReturnDept();
                    Object other$upstreamBillReturnDept = other.getUpstreamBillReturnDept();
                    if (this$upstreamBillReturnDept == null) {
                        if (other$upstreamBillReturnDept == null) {
                            break label349;
                        }
                    } else if (this$upstreamBillReturnDept.equals(other$upstreamBillReturnDept)) {
                        break label349;
                    }

                    return false;
                }

                label342: {
                    Object this$upstreamBillReturnName = this.getUpstreamBillReturnName();
                    Object other$upstreamBillReturnName = other.getUpstreamBillReturnName();
                    if (this$upstreamBillReturnName == null) {
                        if (other$upstreamBillReturnName == null) {
                            break label342;
                        }
                    } else if (this$upstreamBillReturnName.equals(other$upstreamBillReturnName)) {
                        break label342;
                    }

                    return false;
                }

                Object this$upstreamBillReturnTime = this.getUpstreamBillReturnTime();
                Object other$upstreamBillReturnTime = other.getUpstreamBillReturnTime();
                if (this$upstreamBillReturnTime == null) {
                    if (other$upstreamBillReturnTime != null) {
                        return false;
                    }
                } else if (!this$upstreamBillReturnTime.equals(other$upstreamBillReturnTime)) {
                    return false;
                }

                label328: {
                    Object this$inRelationOutBoundId = this.getInRelationOutBoundId();
                    Object other$inRelationOutBoundId = other.getInRelationOutBoundId();
                    if (this$inRelationOutBoundId == null) {
                        if (other$inRelationOutBoundId == null) {
                            break label328;
                        }
                    } else if (this$inRelationOutBoundId.equals(other$inRelationOutBoundId)) {
                        break label328;
                    }

                    return false;
                }

                label321: {
                    Object this$inRelationSaleId = this.getInRelationSaleId();
                    Object other$inRelationSaleId = other.getInRelationSaleId();
                    if (this$inRelationSaleId == null) {
                        if (other$inRelationSaleId == null) {
                            break label321;
                        }
                    } else if (this$inRelationSaleId.equals(other$inRelationSaleId)) {
                        break label321;
                    }

                    return false;
                }

                Object this$inRelationSaleNo = this.getInRelationSaleNo();
                Object other$inRelationSaleNo = other.getInRelationSaleNo();
                if (this$inRelationSaleNo == null) {
                    if (other$inRelationSaleNo != null) {
                        return false;
                    }
                } else if (!this$inRelationSaleNo.equals(other$inRelationSaleNo)) {
                    return false;
                }

                Object this$outRelationSaleId = this.getOutRelationSaleId();
                Object other$outRelationSaleId = other.getOutRelationSaleId();
                if (this$outRelationSaleId == null) {
                    if (other$outRelationSaleId != null) {
                        return false;
                    }
                } else if (!this$outRelationSaleId.equals(other$outRelationSaleId)) {
                    return false;
                }

                label300: {
                    Object this$upstreamBillNo = this.getUpstreamBillNo();
                    Object other$upstreamBillNo = other.getUpstreamBillNo();
                    if (this$upstreamBillNo == null) {
                        if (other$upstreamBillNo == null) {
                            break label300;
                        }
                    } else if (this$upstreamBillNo.equals(other$upstreamBillNo)) {
                        break label300;
                    }

                    return false;
                }

                Object this$upstreamBillReturn = this.getUpstreamBillReturn();
                Object other$upstreamBillReturn = other.getUpstreamBillReturn();
                if (this$upstreamBillReturn == null) {
                    if (other$upstreamBillReturn != null) {
                        return false;
                    }
                } else if (!this$upstreamBillReturn.equals(other$upstreamBillReturn)) {
                    return false;
                }

                Object this$orderAreaCode = this.getOrderAreaCode();
                Object other$orderAreaCode = other.getOrderAreaCode();
                if (this$orderAreaCode == null) {
                    if (other$orderAreaCode != null) {
                        return false;
                    }
                } else if (!this$orderAreaCode.equals(other$orderAreaCode)) {
                    return false;
                }

                label279: {
                    Object this$prepareOne = this.getPrepareOne();
                    Object other$prepareOne = other.getPrepareOne();
                    if (this$prepareOne == null) {
                        if (other$prepareOne == null) {
                            break label279;
                        }
                    } else if (this$prepareOne.equals(other$prepareOne)) {
                        break label279;
                    }

                    return false;
                }

                Object this$prepareTwo = this.getPrepareTwo();
                Object other$prepareTwo = other.getPrepareTwo();
                if (this$prepareTwo == null) {
                    if (other$prepareTwo != null) {
                        return false;
                    }
                } else if (!this$prepareTwo.equals(other$prepareTwo)) {
                    return false;
                }

                label265: {
                    Object this$accountSourceId = this.getAccountSourceId();
                    Object other$accountSourceId = other.getAccountSourceId();
                    if (this$accountSourceId == null) {
                        if (other$accountSourceId == null) {
                            break label265;
                        }
                    } else if (this$accountSourceId.equals(other$accountSourceId)) {
                        break label265;
                    }

                    return false;
                }

                Object this$createTime = this.getCreateTime();
                Object other$createTime = other.getCreateTime();
                if (this$createTime == null) {
                    if (other$createTime != null) {
                        return false;
                    }
                } else if (!this$createTime.equals(other$createTime)) {
                    return false;
                }

                label251: {
                    Object this$createUser = this.getCreateUser();
                    Object other$createUser = other.getCreateUser();
                    if (this$createUser == null) {
                        if (other$createUser == null) {
                            break label251;
                        }
                    } else if (this$createUser.equals(other$createUser)) {
                        break label251;
                    }

                    return false;
                }

                Object this$updateUser = this.getUpdateUser();
                Object other$updateUser = other.getUpdateUser();
                if (this$updateUser == null) {
                    if (other$updateUser != null) {
                        return false;
                    }
                } else if (!this$updateUser.equals(other$updateUser)) {
                    return false;
                }

                label237: {
                    Object this$updateTime = this.getUpdateTime();
                    Object other$updateTime = other.getUpdateTime();
                    if (this$updateTime == null) {
                        if (other$updateTime == null) {
                            break label237;
                        }
                    } else if (this$updateTime.equals(other$updateTime)) {
                        break label237;
                    }

                    return false;
                }

                label230: {
                    Object this$deleted = this.getDeleted();
                    Object other$deleted = other.getDeleted();
                    if (this$deleted == null) {
                        if (other$deleted == null) {
                            break label230;
                        }
                    } else if (this$deleted.equals(other$deleted)) {
                        break label230;
                    }

                    return false;
                }

                Object this$remark = this.getRemark();
                Object other$remark = other.getRemark();
                if (this$remark == null) {
                    if (other$remark != null) {
                        return false;
                    }
                } else if (!this$remark.equals(other$remark)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SaleAccount;
    }

    public int hashCode() {
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $accountNo = this.getAccountNo();
        result = result * 59 + ($accountNo == null ? 43 : $accountNo.hashCode());
        Object $accountType = this.getAccountType();
        result = result * 59 + ($accountType == null ? 43 : $accountType.hashCode());
        Object $accountStatus = this.getAccountStatus();
        result = result * 59 + ($accountStatus == null ? 43 : $accountStatus.hashCode());
        Object $customId = this.getCustomId();
        result = result * 59 + ($customId == null ? 43 : $customId.hashCode());
        Object $customNo = this.getCustomNo();
        result = result * 59 + ($customNo == null ? 43 : $customNo.hashCode());
        Object $customName = this.getCustomName();
        result = result * 59 + ($customName == null ? 43 : $customName.hashCode());
        Object $accountMoney = this.getAccountMoney();
        result = result * 59 + ($accountMoney == null ? 43 : $accountMoney.hashCode());
        Object $skuTotalMoney = this.getSkuTotalMoney();
        result = result * 59 + ($skuTotalMoney == null ? 43 : $skuTotalMoney.hashCode());
        Object $skuTotalFreight = this.getSkuTotalFreight();
        result = result * 59 + ($skuTotalFreight == null ? 43 : $skuTotalFreight.hashCode());
        Object $freight = this.getFreight();
        result = result * 59 + ($freight == null ? 43 : $freight.hashCode());
        Object $balanceGenerator = this.getBalanceGenerator();
        result = result * 59 + ($balanceGenerator == null ? 43 : $balanceGenerator.hashCode());
        Object $balanceId = this.getBalanceId();
        result = result * 59 + ($balanceId == null ? 43 : $balanceId.hashCode());
        Object $balanceNo = this.getBalanceNo();
        result = result * 59 + ($balanceNo == null ? 43 : $balanceNo.hashCode());
        Object $balanceStatus = this.getBalanceStatus();
        result = result * 59 + ($balanceStatus == null ? 43 : $balanceStatus.hashCode());
        Object $upstreamBillSaleId = this.getUpstreamBillSaleId();
        result = result * 59 + ($upstreamBillSaleId == null ? 43 : $upstreamBillSaleId.hashCode());
        Object $upstreamBillSaleNo = this.getUpstreamBillSaleNo();
        result = result * 59 + ($upstreamBillSaleNo == null ? 43 : $upstreamBillSaleNo.hashCode());
        Object $upstreamBillSaleName = this.getUpstreamBillSaleName();
        result = result * 59 + ($upstreamBillSaleName == null ? 43 : $upstreamBillSaleName.hashCode());
        Object $upstreamBillSaleTime = this.getUpstreamBillSaleTime();
        result = result * 59 + ($upstreamBillSaleTime == null ? 43 : $upstreamBillSaleTime.hashCode());
        Object $upstreamBillSale = this.getUpstreamBillSale();
        result = result * 59 + ($upstreamBillSale == null ? 43 : $upstreamBillSale.hashCode());
        Object $upstreamBillReturnId = this.getUpstreamBillReturnId();
        result = result * 59 + ($upstreamBillReturnId == null ? 43 : $upstreamBillReturnId.hashCode());
        Object $upstreamBillReturnNo = this.getUpstreamBillReturnNo();
        result = result * 59 + ($upstreamBillReturnNo == null ? 43 : $upstreamBillReturnNo.hashCode());
        Object $upstreamBillReturnDept = this.getUpstreamBillReturnDept();
        result = result * 59 + ($upstreamBillReturnDept == null ? 43 : $upstreamBillReturnDept.hashCode());
        Object $upstreamBillReturnName = this.getUpstreamBillReturnName();
        result = result * 59 + ($upstreamBillReturnName == null ? 43 : $upstreamBillReturnName.hashCode());
        Object $upstreamBillReturnTime = this.getUpstreamBillReturnTime();
        result = result * 59 + ($upstreamBillReturnTime == null ? 43 : $upstreamBillReturnTime.hashCode());
        Object $inRelationOutBoundId = this.getInRelationOutBoundId();
        result = result * 59 + ($inRelationOutBoundId == null ? 43 : $inRelationOutBoundId.hashCode());
        Object $inRelationSaleId = this.getInRelationSaleId();
        result = result * 59 + ($inRelationSaleId == null ? 43 : $inRelationSaleId.hashCode());
        Object $inRelationSaleNo = this.getInRelationSaleNo();
        result = result * 59 + ($inRelationSaleNo == null ? 43 : $inRelationSaleNo.hashCode());
        Object $outRelationSaleId = this.getOutRelationSaleId();
        result = result * 59 + ($outRelationSaleId == null ? 43 : $outRelationSaleId.hashCode());
        Object $upstreamBillNo = this.getUpstreamBillNo();
        result = result * 59 + ($upstreamBillNo == null ? 43 : $upstreamBillNo.hashCode());
        Object $upstreamBillReturn = this.getUpstreamBillReturn();
        result = result * 59 + ($upstreamBillReturn == null ? 43 : $upstreamBillReturn.hashCode());
        Object $orderAreaCode = this.getOrderAreaCode();
        result = result * 59 + ($orderAreaCode == null ? 43 : $orderAreaCode.hashCode());
        Object $prepareOne = this.getPrepareOne();
        result = result * 59 + ($prepareOne == null ? 43 : $prepareOne.hashCode());
        Object $prepareTwo = this.getPrepareTwo();
        result = result * 59 + ($prepareTwo == null ? 43 : $prepareTwo.hashCode());
        Object $accountSourceId = this.getAccountSourceId();
        result = result * 59 + ($accountSourceId == null ? 43 : $accountSourceId.hashCode());
        Object $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        Object $createUser = this.getCreateUser();
        result = result * 59 + ($createUser == null ? 43 : $createUser.hashCode());
        Object $updateUser = this.getUpdateUser();
        result = result * 59 + ($updateUser == null ? 43 : $updateUser.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        Object $deleted = this.getDeleted();
        result = result * 59 + ($deleted == null ? 43 : $deleted.hashCode());
        Object $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    public String toString() {
        return "SaleAccount(id=" + this.getId() + ", accountNo=" + this.getAccountNo() + ", accountType=" + this.getAccountType() + ", accountStatus=" + this.getAccountStatus() + ", customId=" + this.getCustomId() + ", customNo=" + this.getCustomNo() + ", customName=" + this.getCustomName() + ", accountMoney=" + this.getAccountMoney() + ", skuTotalMoney=" + this.getSkuTotalMoney() + ", skuTotalFreight=" + this.getSkuTotalFreight() + ", freight=" + this.getFreight() + ", balanceGenerator=" + this.getBalanceGenerator() + ", balanceId=" + this.getBalanceId() + ", balanceNo=" + this.getBalanceNo() + ", balanceStatus=" + this.getBalanceStatus() + ", upstreamBillSaleId=" + this.getUpstreamBillSaleId() + ", upstreamBillSaleNo=" + this.getUpstreamBillSaleNo() + ", upstreamBillSaleName=" + this.getUpstreamBillSaleName() + ", upstreamBillSaleTime=" + this.getUpstreamBillSaleTime() + ", upstreamBillSale=" + this.getUpstreamBillSale() + ", upstreamBillReturnId=" + this.getUpstreamBillReturnId() + ", upstreamBillReturnNo=" + this.getUpstreamBillReturnNo() + ", upstreamBillReturnDept=" + this.getUpstreamBillReturnDept() + ", upstreamBillReturnName=" + this.getUpstreamBillReturnName() + ", upstreamBillReturnTime=" + this.getUpstreamBillReturnTime() + ", inRelationOutBoundId=" + this.getInRelationOutBoundId() + ", inRelationSaleId=" + this.getInRelationSaleId() + ", inRelationSaleNo=" + this.getInRelationSaleNo() + ", outRelationSaleId=" + this.getOutRelationSaleId() + ", upstreamBillNo=" + this.getUpstreamBillNo() + ", upstreamBillReturn=" + this.getUpstreamBillReturn() + ", orderAreaCode=" + this.getOrderAreaCode() + ", prepareOne=" + this.getPrepareOne() + ", prepareTwo=" + this.getPrepareTwo() + ", accountSourceId=" + this.getAccountSourceId() + ", createTime=" + this.getCreateTime() + ", createUser=" + this.getCreateUser() + ", updateUser=" + this.getUpdateUser() + ", updateTime=" + this.getUpdateTime() + ", deleted=" + this.getDeleted() + ", remark=" + this.getRemark() + ")";
    }
}
