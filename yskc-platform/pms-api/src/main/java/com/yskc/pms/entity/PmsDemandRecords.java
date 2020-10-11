package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsDemandRecords implements Serializable {
    private Long id;

    private String userAccount;

    private String demandType;

    private Integer demandSize;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date openedTime;

    private Integer operationStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getDemandType() {
        return demandType;
    }

    public void setDemandType(String demandType) {
        this.demandType = demandType;
    }

    public Integer getDemandSize() {
        return demandSize;
    }

    public void setDemandSize(Integer demandSize) {
        this.demandSize = demandSize;
    }

    public Date getOpenedTime() {
        return openedTime;
    }

    public void setOpenedTime(Date openedTime) {
        this.openedTime = openedTime;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", demandType=").append(demandType);
        sb.append(", demandSize=").append(demandSize);
        sb.append(", openedTime=").append(openedTime);
        sb.append(", operationStatus=").append(operationStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}