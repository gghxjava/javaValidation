package com.example.usertest.entity;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.example.usertest.anno.ColumnNumberOneAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

public class SaleAccountVo extends SaleAccount {
    private String displayCreateTime;
    private String skuCode;
    private List<Long> idList;
    private String pullOrPushNo;
    private String oddNumbers;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date orderedTime;
    private List<Long> saleAccountIds;
    private List<Integer> accountStatusList;
    private String sort;
    private String confirmUrl;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date startTime;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date endTime;
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    private Date balanceCreateTime;
    private Long sourceId;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 1.0F,
            fieldName = "对账类型"
    )
    private String accountTypeDesc;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 2.0F,
            fieldName = "对账状态"
    )
    private String accountStatusDesc;
    private String balanceStatusDesc;
    @ColumnNumberOneAnnotation(
            exportOrderNum = 7.0F,
            fieldName = "上游单据"
    )
    private String upstreamBillDesc;
    private String updateTimeDesc;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long senderId;
    @JsonFormat(
            timezone = "GMT+8",
            pattern = "yyyy-MM-dd"
    )
    private Date simpleCreateTime;
    private List<SaleAccountDetailVo> saleAccountDetailVoList;
    private List<SaleAccountDetail> saleAccountDetails;
    private List<SaleAccountAdjustmentVo> saleAccountAdjustmentVoList;
    private Date date;
    private List<AssociationBill> associationBillList;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long associationId;
    private SaleBalanceVo saleBalanceVo;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long agentId;
    @JsonSerialize(
            using = LongJsonSerializer.class
    )
    @JsonDeserialize(
            using = LongJsonDeserializer.class
    )
    private Long agentContractId;
    private BigDecimal monthProfitRate;
    private BigDecimal dayAdvanceInterest;
    private BigDecimal newestAccountMoney;
    private String forwardSourceBalanceNO;
    private String areaCode;
    private List<Long> salesOrderIds;
    private Integer techYesOrNo;
    private String techYesOrNoDesc;
    private List<Long> upstreamBillReturnIds;

    public SaleAccountVo() {
    }


    public String getDisplayCreateTime() {
        return this.displayCreateTime;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public String getPullOrPushNo() {
        return this.pullOrPushNo;
    }

    public String getOddNumbers() {
        return this.oddNumbers;
    }

    public Date getOrderedTime() {
        return this.orderedTime;
    }

    public List<Long> getSaleAccountIds() {
        return this.saleAccountIds;
    }

    public List<Integer> getAccountStatusList() {
        return this.accountStatusList;
    }

    public String getSort() {
        return this.sort;
    }

    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Date getBalanceCreateTime() {
        return this.balanceCreateTime;
    }

    public Long getSourceId() {
        return this.sourceId;
    }

    public String getAccountTypeDesc() {
        return this.accountTypeDesc;
    }

    public String getAccountStatusDesc() {
        return this.accountStatusDesc;
    }

    public String getBalanceStatusDesc() {
        return this.balanceStatusDesc;
    }

    public String getUpstreamBillDesc() {
        return this.upstreamBillDesc;
    }

    public String getUpdateTimeDesc() {
        return this.updateTimeDesc;
    }

    public Long getSenderId() {
        return this.senderId;
    }

    public Date getSimpleCreateTime() {
        return this.simpleCreateTime;
    }

    public List<SaleAccountDetailVo> getSaleAccountDetailVoList() {
        return this.saleAccountDetailVoList;
    }

    public List<SaleAccountDetail> getSaleAccountDetails() {
        return this.saleAccountDetails;
    }

    public List<SaleAccountAdjustmentVo> getSaleAccountAdjustmentVoList() {
        return this.saleAccountAdjustmentVoList;
    }

    public Date getDate() {
        return this.date;
    }

    public List<AssociationBill> getAssociationBillList() {
        return this.associationBillList;
    }

    public Long getAssociationId() {
        return this.associationId;
    }

    public SaleBalanceVo getSaleBalanceVo() {
        return this.saleBalanceVo;
    }

    public Long getAgentId() {
        return this.agentId;
    }

    public Long getAgentContractId() {
        return this.agentContractId;
    }

    public BigDecimal getMonthProfitRate() {
        return this.monthProfitRate;
    }

    public BigDecimal getDayAdvanceInterest() {
        return this.dayAdvanceInterest;
    }

    public BigDecimal getNewestAccountMoney() {
        return this.newestAccountMoney;
    }

    public String getForwardSourceBalanceNO() {
        return this.forwardSourceBalanceNO;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public List<Long> getSalesOrderIds() {
        return this.salesOrderIds;
    }

    public Integer getTechYesOrNo() {
        return this.techYesOrNo;
    }

    public String getTechYesOrNoDesc() {
        return this.techYesOrNoDesc;
    }

    public List<Long> getUpstreamBillReturnIds() {
        return this.upstreamBillReturnIds;
    }

    public void setDisplayCreateTime(String displayCreateTime) {
        this.displayCreateTime = displayCreateTime;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setPullOrPushNo(String pullOrPushNo) {
        this.pullOrPushNo = pullOrPushNo;
    }

    public void setOddNumbers(String oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public void setOrderedTime(Date orderedTime) {
        this.orderedTime = orderedTime;
    }

    public void setSaleAccountIds(List<Long> saleAccountIds) {
        this.saleAccountIds = saleAccountIds;
    }

    public void setAccountStatusList(List<Integer> accountStatusList) {
        this.accountStatusList = accountStatusList;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setBalanceCreateTime(Date balanceCreateTime) {
        this.balanceCreateTime = balanceCreateTime;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public void setAccountTypeDesc(String accountTypeDesc) {
        this.accountTypeDesc = accountTypeDesc;
    }

    public void setAccountStatusDesc(String accountStatusDesc) {
        this.accountStatusDesc = accountStatusDesc;
    }

    public void setBalanceStatusDesc(String balanceStatusDesc) {
        this.balanceStatusDesc = balanceStatusDesc;
    }

    public void setUpstreamBillDesc(String upstreamBillDesc) {
        this.upstreamBillDesc = upstreamBillDesc;
    }

    public void setUpdateTimeDesc(String updateTimeDesc) {
        this.updateTimeDesc = updateTimeDesc;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public void setSimpleCreateTime(Date simpleCreateTime) {
        this.simpleCreateTime = simpleCreateTime;
    }

    public void setSaleAccountDetailVoList(List<SaleAccountDetailVo> saleAccountDetailVoList) {
        this.saleAccountDetailVoList = saleAccountDetailVoList;
    }

    public void setSaleAccountDetails(List<SaleAccountDetail> saleAccountDetails) {
        this.saleAccountDetails = saleAccountDetails;
    }

    public void setSaleAccountAdjustmentVoList(List<SaleAccountAdjustmentVo> saleAccountAdjustmentVoList) {
        this.saleAccountAdjustmentVoList = saleAccountAdjustmentVoList;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAssociationBillList(List<AssociationBill> associationBillList) {
        this.associationBillList = associationBillList;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public void setSaleBalanceVo(SaleBalanceVo saleBalanceVo) {
        this.saleBalanceVo = saleBalanceVo;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public void setAgentContractId(Long agentContractId) {
        this.agentContractId = agentContractId;
    }

    public void setMonthProfitRate(BigDecimal monthProfitRate) {
        this.monthProfitRate = monthProfitRate;
    }

    public void setDayAdvanceInterest(BigDecimal dayAdvanceInterest) {
        this.dayAdvanceInterest = dayAdvanceInterest;
    }

    public void setNewestAccountMoney(BigDecimal newestAccountMoney) {
        this.newestAccountMoney = newestAccountMoney;
    }

    public void setForwardSourceBalanceNO(String forwardSourceBalanceNO) {
        this.forwardSourceBalanceNO = forwardSourceBalanceNO;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setSalesOrderIds(List<Long> salesOrderIds) {
        this.salesOrderIds = salesOrderIds;
    }

    public void setTechYesOrNo(Integer techYesOrNo) {
        this.techYesOrNo = techYesOrNo;
    }

    public void setTechYesOrNoDesc(String techYesOrNoDesc) {
        this.techYesOrNoDesc = techYesOrNoDesc;
    }

    public void setUpstreamBillReturnIds(List<Long> upstreamBillReturnIds) {
        this.upstreamBillReturnIds = upstreamBillReturnIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SaleAccountVo)) {
            return false;
        } else {
            SaleAccountVo other = (SaleAccountVo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label479: {
                    Object this$displayCreateTime = this.getDisplayCreateTime();
                    Object other$displayCreateTime = other.getDisplayCreateTime();
                    if (this$displayCreateTime == null) {
                        if (other$displayCreateTime == null) {
                            break label479;
                        }
                    } else if (this$displayCreateTime.equals(other$displayCreateTime)) {
                        break label479;
                    }

                    return false;
                }

                Object this$skuCode = this.getSkuCode();
                Object other$skuCode = other.getSkuCode();
                if (this$skuCode == null) {
                    if (other$skuCode != null) {
                        return false;
                    }
                } else if (!this$skuCode.equals(other$skuCode)) {
                    return false;
                }

                Object this$idList = this.getIdList();
                Object other$idList = other.getIdList();
                if (this$idList == null) {
                    if (other$idList != null) {
                        return false;
                    }
                } else if (!this$idList.equals(other$idList)) {
                    return false;
                }

                label458: {
                    Object this$pullOrPushNo = this.getPullOrPushNo();
                    Object other$pullOrPushNo = other.getPullOrPushNo();
                    if (this$pullOrPushNo == null) {
                        if (other$pullOrPushNo == null) {
                            break label458;
                        }
                    } else if (this$pullOrPushNo.equals(other$pullOrPushNo)) {
                        break label458;
                    }

                    return false;
                }

                label451: {
                    Object this$oddNumbers = this.getOddNumbers();
                    Object other$oddNumbers = other.getOddNumbers();
                    if (this$oddNumbers == null) {
                        if (other$oddNumbers == null) {
                            break label451;
                        }
                    } else if (this$oddNumbers.equals(other$oddNumbers)) {
                        break label451;
                    }

                    return false;
                }

                Object this$orderedTime = this.getOrderedTime();
                Object other$orderedTime = other.getOrderedTime();
                if (this$orderedTime == null) {
                    if (other$orderedTime != null) {
                        return false;
                    }
                } else if (!this$orderedTime.equals(other$orderedTime)) {
                    return false;
                }

                Object this$saleAccountIds = this.getSaleAccountIds();
                Object other$saleAccountIds = other.getSaleAccountIds();
                if (this$saleAccountIds == null) {
                    if (other$saleAccountIds != null) {
                        return false;
                    }
                } else if (!this$saleAccountIds.equals(other$saleAccountIds)) {
                    return false;
                }

                label430: {
                    Object this$accountStatusList = this.getAccountStatusList();
                    Object other$accountStatusList = other.getAccountStatusList();
                    if (this$accountStatusList == null) {
                        if (other$accountStatusList == null) {
                            break label430;
                        }
                    } else if (this$accountStatusList.equals(other$accountStatusList)) {
                        break label430;
                    }

                    return false;
                }

                label423: {
                    Object this$sort = this.getSort();
                    Object other$sort = other.getSort();
                    if (this$sort == null) {
                        if (other$sort == null) {
                            break label423;
                        }
                    } else if (this$sort.equals(other$sort)) {
                        break label423;
                    }

                    return false;
                }

                Object this$confirmUrl = this.getConfirmUrl();
                Object other$confirmUrl = other.getConfirmUrl();
                if (this$confirmUrl == null) {
                    if (other$confirmUrl != null) {
                        return false;
                    }
                } else if (!this$confirmUrl.equals(other$confirmUrl)) {
                    return false;
                }

                label409: {
                    Object this$startTime = this.getStartTime();
                    Object other$startTime = other.getStartTime();
                    if (this$startTime == null) {
                        if (other$startTime == null) {
                            break label409;
                        }
                    } else if (this$startTime.equals(other$startTime)) {
                        break label409;
                    }

                    return false;
                }

                Object this$endTime = this.getEndTime();
                Object other$endTime = other.getEndTime();
                if (this$endTime == null) {
                    if (other$endTime != null) {
                        return false;
                    }
                } else if (!this$endTime.equals(other$endTime)) {
                    return false;
                }

                label395: {
                    Object this$balanceCreateTime = this.getBalanceCreateTime();
                    Object other$balanceCreateTime = other.getBalanceCreateTime();
                    if (this$balanceCreateTime == null) {
                        if (other$balanceCreateTime == null) {
                            break label395;
                        }
                    } else if (this$balanceCreateTime.equals(other$balanceCreateTime)) {
                        break label395;
                    }

                    return false;
                }

                Object this$sourceId = this.getSourceId();
                Object other$sourceId = other.getSourceId();
                if (this$sourceId == null) {
                    if (other$sourceId != null) {
                        return false;
                    }
                } else if (!this$sourceId.equals(other$sourceId)) {
                    return false;
                }

                Object this$accountTypeDesc = this.getAccountTypeDesc();
                Object other$accountTypeDesc = other.getAccountTypeDesc();
                if (this$accountTypeDesc == null) {
                    if (other$accountTypeDesc != null) {
                        return false;
                    }
                } else if (!this$accountTypeDesc.equals(other$accountTypeDesc)) {
                    return false;
                }

                label374: {
                    Object this$accountStatusDesc = this.getAccountStatusDesc();
                    Object other$accountStatusDesc = other.getAccountStatusDesc();
                    if (this$accountStatusDesc == null) {
                        if (other$accountStatusDesc == null) {
                            break label374;
                        }
                    } else if (this$accountStatusDesc.equals(other$accountStatusDesc)) {
                        break label374;
                    }

                    return false;
                }

                label367: {
                    Object this$balanceStatusDesc = this.getBalanceStatusDesc();
                    Object other$balanceStatusDesc = other.getBalanceStatusDesc();
                    if (this$balanceStatusDesc == null) {
                        if (other$balanceStatusDesc == null) {
                            break label367;
                        }
                    } else if (this$balanceStatusDesc.equals(other$balanceStatusDesc)) {
                        break label367;
                    }

                    return false;
                }

                Object this$upstreamBillDesc = this.getUpstreamBillDesc();
                Object other$upstreamBillDesc = other.getUpstreamBillDesc();
                if (this$upstreamBillDesc == null) {
                    if (other$upstreamBillDesc != null) {
                        return false;
                    }
                } else if (!this$upstreamBillDesc.equals(other$upstreamBillDesc)) {
                    return false;
                }

                Object this$updateTimeDesc = this.getUpdateTimeDesc();
                Object other$updateTimeDesc = other.getUpdateTimeDesc();
                if (this$updateTimeDesc == null) {
                    if (other$updateTimeDesc != null) {
                        return false;
                    }
                } else if (!this$updateTimeDesc.equals(other$updateTimeDesc)) {
                    return false;
                }

                label346: {
                    Object this$senderId = this.getSenderId();
                    Object other$senderId = other.getSenderId();
                    if (this$senderId == null) {
                        if (other$senderId == null) {
                            break label346;
                        }
                    } else if (this$senderId.equals(other$senderId)) {
                        break label346;
                    }

                    return false;
                }

                label339: {
                    Object this$simpleCreateTime = this.getSimpleCreateTime();
                    Object other$simpleCreateTime = other.getSimpleCreateTime();
                    if (this$simpleCreateTime == null) {
                        if (other$simpleCreateTime == null) {
                            break label339;
                        }
                    } else if (this$simpleCreateTime.equals(other$simpleCreateTime)) {
                        break label339;
                    }

                    return false;
                }

                Object this$saleAccountDetailVoList = this.getSaleAccountDetailVoList();
                Object other$saleAccountDetailVoList = other.getSaleAccountDetailVoList();
                if (this$saleAccountDetailVoList == null) {
                    if (other$saleAccountDetailVoList != null) {
                        return false;
                    }
                } else if (!this$saleAccountDetailVoList.equals(other$saleAccountDetailVoList)) {
                    return false;
                }

                Object this$saleAccountDetails = this.getSaleAccountDetails();
                Object other$saleAccountDetails = other.getSaleAccountDetails();
                if (this$saleAccountDetails == null) {
                    if (other$saleAccountDetails != null) {
                        return false;
                    }
                } else if (!this$saleAccountDetails.equals(other$saleAccountDetails)) {
                    return false;
                }

                label318: {
                    Object this$saleAccountAdjustmentVoList = this.getSaleAccountAdjustmentVoList();
                    Object other$saleAccountAdjustmentVoList = other.getSaleAccountAdjustmentVoList();
                    if (this$saleAccountAdjustmentVoList == null) {
                        if (other$saleAccountAdjustmentVoList == null) {
                            break label318;
                        }
                    } else if (this$saleAccountAdjustmentVoList.equals(other$saleAccountAdjustmentVoList)) {
                        break label318;
                    }

                    return false;
                }

                label311: {
                    Object this$date = this.getDate();
                    Object other$date = other.getDate();
                    if (this$date == null) {
                        if (other$date == null) {
                            break label311;
                        }
                    } else if (this$date.equals(other$date)) {
                        break label311;
                    }

                    return false;
                }

                Object this$associationBillList = this.getAssociationBillList();
                Object other$associationBillList = other.getAssociationBillList();
                if (this$associationBillList == null) {
                    if (other$associationBillList != null) {
                        return false;
                    }
                } else if (!this$associationBillList.equals(other$associationBillList)) {
                    return false;
                }

                label297: {
                    Object this$associationId = this.getAssociationId();
                    Object other$associationId = other.getAssociationId();
                    if (this$associationId == null) {
                        if (other$associationId == null) {
                            break label297;
                        }
                    } else if (this$associationId.equals(other$associationId)) {
                        break label297;
                    }

                    return false;
                }

                Object this$saleBalanceVo = this.getSaleBalanceVo();
                Object other$saleBalanceVo = other.getSaleBalanceVo();
                if (this$saleBalanceVo == null) {
                    if (other$saleBalanceVo != null) {
                        return false;
                    }
                } else if (!this$saleBalanceVo.equals(other$saleBalanceVo)) {
                    return false;
                }

                label283: {
                    Object this$agentId = this.getAgentId();
                    Object other$agentId = other.getAgentId();
                    if (this$agentId == null) {
                        if (other$agentId == null) {
                            break label283;
                        }
                    } else if (this$agentId.equals(other$agentId)) {
                        break label283;
                    }

                    return false;
                }

                Object this$agentContractId = this.getAgentContractId();
                Object other$agentContractId = other.getAgentContractId();
                if (this$agentContractId == null) {
                    if (other$agentContractId != null) {
                        return false;
                    }
                } else if (!this$agentContractId.equals(other$agentContractId)) {
                    return false;
                }

                Object this$monthProfitRate = this.getMonthProfitRate();
                Object other$monthProfitRate = other.getMonthProfitRate();
                if (this$monthProfitRate == null) {
                    if (other$monthProfitRate != null) {
                        return false;
                    }
                } else if (!this$monthProfitRate.equals(other$monthProfitRate)) {
                    return false;
                }

                label262: {
                    Object this$dayAdvanceInterest = this.getDayAdvanceInterest();
                    Object other$dayAdvanceInterest = other.getDayAdvanceInterest();
                    if (this$dayAdvanceInterest == null) {
                        if (other$dayAdvanceInterest == null) {
                            break label262;
                        }
                    } else if (this$dayAdvanceInterest.equals(other$dayAdvanceInterest)) {
                        break label262;
                    }

                    return false;
                }

                label255: {
                    Object this$newestAccountMoney = this.getNewestAccountMoney();
                    Object other$newestAccountMoney = other.getNewestAccountMoney();
                    if (this$newestAccountMoney == null) {
                        if (other$newestAccountMoney == null) {
                            break label255;
                        }
                    } else if (this$newestAccountMoney.equals(other$newestAccountMoney)) {
                        break label255;
                    }

                    return false;
                }

                Object this$forwardSourceBalanceNO = this.getForwardSourceBalanceNO();
                Object other$forwardSourceBalanceNO = other.getForwardSourceBalanceNO();
                if (this$forwardSourceBalanceNO == null) {
                    if (other$forwardSourceBalanceNO != null) {
                        return false;
                    }
                } else if (!this$forwardSourceBalanceNO.equals(other$forwardSourceBalanceNO)) {
                    return false;
                }

                Object this$areaCode = this.getAreaCode();
                Object other$areaCode = other.getAreaCode();
                if (this$areaCode == null) {
                    if (other$areaCode != null) {
                        return false;
                    }
                } else if (!this$areaCode.equals(other$areaCode)) {
                    return false;
                }

                label234: {
                    Object this$salesOrderIds = this.getSalesOrderIds();
                    Object other$salesOrderIds = other.getSalesOrderIds();
                    if (this$salesOrderIds == null) {
                        if (other$salesOrderIds == null) {
                            break label234;
                        }
                    } else if (this$salesOrderIds.equals(other$salesOrderIds)) {
                        break label234;
                    }

                    return false;
                }

                label227: {
                    Object this$techYesOrNo = this.getTechYesOrNo();
                    Object other$techYesOrNo = other.getTechYesOrNo();
                    if (this$techYesOrNo == null) {
                        if (other$techYesOrNo == null) {
                            break label227;
                        }
                    } else if (this$techYesOrNo.equals(other$techYesOrNo)) {
                        break label227;
                    }

                    return false;
                }

                Object this$techYesOrNoDesc = this.getTechYesOrNoDesc();
                Object other$techYesOrNoDesc = other.getTechYesOrNoDesc();
                if (this$techYesOrNoDesc == null) {
                    if (other$techYesOrNoDesc != null) {
                        return false;
                    }
                } else if (!this$techYesOrNoDesc.equals(other$techYesOrNoDesc)) {
                    return false;
                }

                Object this$upstreamBillReturnIds = this.getUpstreamBillReturnIds();
                Object other$upstreamBillReturnIds = other.getUpstreamBillReturnIds();
                if (this$upstreamBillReturnIds == null) {
                    if (other$upstreamBillReturnIds != null) {
                        return false;
                    }
                } else if (!this$upstreamBillReturnIds.equals(other$upstreamBillReturnIds)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SaleAccountVo;
    }

    public int hashCode() {
        int result = 1;
        Object $displayCreateTime = this.getDisplayCreateTime();
        result = result * 59 + ($displayCreateTime == null ? 43 : $displayCreateTime.hashCode());
        Object $skuCode = this.getSkuCode();
        result = result * 59 + ($skuCode == null ? 43 : $skuCode.hashCode());
        Object $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : $idList.hashCode());
        Object $pullOrPushNo = this.getPullOrPushNo();
        result = result * 59 + ($pullOrPushNo == null ? 43 : $pullOrPushNo.hashCode());
        Object $oddNumbers = this.getOddNumbers();
        result = result * 59 + ($oddNumbers == null ? 43 : $oddNumbers.hashCode());
        Object $orderedTime = this.getOrderedTime();
        result = result * 59 + ($orderedTime == null ? 43 : $orderedTime.hashCode());
        Object $saleAccountIds = this.getSaleAccountIds();
        result = result * 59 + ($saleAccountIds == null ? 43 : $saleAccountIds.hashCode());
        Object $accountStatusList = this.getAccountStatusList();
        result = result * 59 + ($accountStatusList == null ? 43 : $accountStatusList.hashCode());
        Object $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : $sort.hashCode());
        Object $confirmUrl = this.getConfirmUrl();
        result = result * 59 + ($confirmUrl == null ? 43 : $confirmUrl.hashCode());
        Object $startTime = this.getStartTime();
        result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
        Object $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
        Object $balanceCreateTime = this.getBalanceCreateTime();
        result = result * 59 + ($balanceCreateTime == null ? 43 : $balanceCreateTime.hashCode());
        Object $sourceId = this.getSourceId();
        result = result * 59 + ($sourceId == null ? 43 : $sourceId.hashCode());
        Object $accountTypeDesc = this.getAccountTypeDesc();
        result = result * 59 + ($accountTypeDesc == null ? 43 : $accountTypeDesc.hashCode());
        Object $accountStatusDesc = this.getAccountStatusDesc();
        result = result * 59 + ($accountStatusDesc == null ? 43 : $accountStatusDesc.hashCode());
        Object $balanceStatusDesc = this.getBalanceStatusDesc();
        result = result * 59 + ($balanceStatusDesc == null ? 43 : $balanceStatusDesc.hashCode());
        Object $upstreamBillDesc = this.getUpstreamBillDesc();
        result = result * 59 + ($upstreamBillDesc == null ? 43 : $upstreamBillDesc.hashCode());
        Object $updateTimeDesc = this.getUpdateTimeDesc();
        result = result * 59 + ($updateTimeDesc == null ? 43 : $updateTimeDesc.hashCode());
        Object $senderId = this.getSenderId();
        result = result * 59 + ($senderId == null ? 43 : $senderId.hashCode());
        Object $simpleCreateTime = this.getSimpleCreateTime();
        result = result * 59 + ($simpleCreateTime == null ? 43 : $simpleCreateTime.hashCode());
        Object $saleAccountDetailVoList = this.getSaleAccountDetailVoList();
        result = result * 59 + ($saleAccountDetailVoList == null ? 43 : $saleAccountDetailVoList.hashCode());
        Object $saleAccountDetails = this.getSaleAccountDetails();
        result = result * 59 + ($saleAccountDetails == null ? 43 : $saleAccountDetails.hashCode());
        Object $saleAccountAdjustmentVoList = this.getSaleAccountAdjustmentVoList();
        result = result * 59 + ($saleAccountAdjustmentVoList == null ? 43 : $saleAccountAdjustmentVoList.hashCode());
        Object $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        Object $associationBillList = this.getAssociationBillList();
        result = result * 59 + ($associationBillList == null ? 43 : $associationBillList.hashCode());
        Object $associationId = this.getAssociationId();
        result = result * 59 + ($associationId == null ? 43 : $associationId.hashCode());
        Object $saleBalanceVo = this.getSaleBalanceVo();
        result = result * 59 + ($saleBalanceVo == null ? 43 : $saleBalanceVo.hashCode());
        Object $agentId = this.getAgentId();
        result = result * 59 + ($agentId == null ? 43 : $agentId.hashCode());
        Object $agentContractId = this.getAgentContractId();
        result = result * 59 + ($agentContractId == null ? 43 : $agentContractId.hashCode());
        Object $monthProfitRate = this.getMonthProfitRate();
        result = result * 59 + ($monthProfitRate == null ? 43 : $monthProfitRate.hashCode());
        Object $dayAdvanceInterest = this.getDayAdvanceInterest();
        result = result * 59 + ($dayAdvanceInterest == null ? 43 : $dayAdvanceInterest.hashCode());
        Object $newestAccountMoney = this.getNewestAccountMoney();
        result = result * 59 + ($newestAccountMoney == null ? 43 : $newestAccountMoney.hashCode());
        Object $forwardSourceBalanceNO = this.getForwardSourceBalanceNO();
        result = result * 59 + ($forwardSourceBalanceNO == null ? 43 : $forwardSourceBalanceNO.hashCode());
        Object $areaCode = this.getAreaCode();
        result = result * 59 + ($areaCode == null ? 43 : $areaCode.hashCode());
        Object $salesOrderIds = this.getSalesOrderIds();
        result = result * 59 + ($salesOrderIds == null ? 43 : $salesOrderIds.hashCode());
        Object $techYesOrNo = this.getTechYesOrNo();
        result = result * 59 + ($techYesOrNo == null ? 43 : $techYesOrNo.hashCode());
        Object $techYesOrNoDesc = this.getTechYesOrNoDesc();
        result = result * 59 + ($techYesOrNoDesc == null ? 43 : $techYesOrNoDesc.hashCode());
        Object $upstreamBillReturnIds = this.getUpstreamBillReturnIds();
        result = result * 59 + ($upstreamBillReturnIds == null ? 43 : $upstreamBillReturnIds.hashCode());
        return result;
    }

    public String toString() {
        return "SaleAccountVo(displayCreateTime=" + this.getDisplayCreateTime() + ", skuCode=" + this.getSkuCode() + ", idList=" + this.getIdList() + ", pullOrPushNo=" + this.getPullOrPushNo() + ", oddNumbers=" + this.getOddNumbers() + ", orderedTime=" + this.getOrderedTime() + ", saleAccountIds=" + this.getSaleAccountIds() + ", accountStatusList=" + this.getAccountStatusList() + ", sort=" + this.getSort() + ", confirmUrl=" + this.getConfirmUrl() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", balanceCreateTime=" + this.getBalanceCreateTime() + ", sourceId=" + this.getSourceId() + ", accountTypeDesc=" + this.getAccountTypeDesc() + ", accountStatusDesc=" + this.getAccountStatusDesc() + ", balanceStatusDesc=" + this.getBalanceStatusDesc() + ", upstreamBillDesc=" + this.getUpstreamBillDesc() + ", updateTimeDesc=" + this.getUpdateTimeDesc() + ", senderId=" + this.getSenderId() + ", simpleCreateTime=" + this.getSimpleCreateTime() + ", saleAccountDetailVoList=" + this.getSaleAccountDetailVoList() + ", saleAccountDetails=" + this.getSaleAccountDetails() + ", saleAccountAdjustmentVoList=" + this.getSaleAccountAdjustmentVoList() + ", date=" + this.getDate() + ", associationBillList=" + this.getAssociationBillList() + ", associationId=" + this.getAssociationId() + ", saleBalanceVo=" + this.getSaleBalanceVo() + ", agentId=" + this.getAgentId() + ", agentContractId=" + this.getAgentContractId() + ", monthProfitRate=" + this.getMonthProfitRate() + ", dayAdvanceInterest=" + this.getDayAdvanceInterest() + ", newestAccountMoney=" + this.getNewestAccountMoney() + ", forwardSourceBalanceNO=" + this.getForwardSourceBalanceNO() + ", areaCode=" + this.getAreaCode() + ", salesOrderIds=" + this.getSalesOrderIds() + ", techYesOrNo=" + this.getTechYesOrNo() + ", techYesOrNoDesc=" + this.getTechYesOrNoDesc() + ", upstreamBillReturnIds=" + this.getUpstreamBillReturnIds() + ")";
    }
}
