package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsBreakingRecords implements Serializable {
    private Long id;

    private String userAccount;

    private String waitingType;

    private Integer waitingSize;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date openWaitingTime;

    private Integer operationStutes;

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

    public String getWaitingType() {
        return waitingType;
    }

    public void setWaitingType(String waitingType) {
        this.waitingType = waitingType;
    }

    public Integer getWaitingSize() {
        return waitingSize;
    }

    public void setWaitingSize(Integer waitingSize) {
        this.waitingSize = waitingSize;
    }

    public Date getOpenWaitingTime() {
        return openWaitingTime;
    }

    public void setOpenWaitingTime(Date openWaitingTime) {
        this.openWaitingTime = openWaitingTime;
    }

    public Integer getOperationStutes() {
        return operationStutes;
    }

    public void setOperationStutes(Integer operationStutes) {
        this.operationStutes = operationStutes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", waitingType=").append(waitingType);
        sb.append(", waitingSize=").append(waitingSize);
        sb.append(", openWaitingTime=").append(openWaitingTime);
        sb.append(", operationStutes=").append(operationStutes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}