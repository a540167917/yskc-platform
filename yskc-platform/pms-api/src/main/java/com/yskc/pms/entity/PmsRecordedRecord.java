package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsRecordedRecord implements Serializable {
    private Long id;

    private String userAccount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date recentTime;

    private Integer recordedSize;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date openRecordedTime;

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

    public Date getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Date recentTime) {
        this.recentTime = recentTime;
    }

    public Integer getRecordedSize() {
        return recordedSize;
    }

    public void setRecordedSize(Integer recordedSize) {
        this.recordedSize = recordedSize;
    }

    public Date getOpenRecordedTime() {
        return openRecordedTime;
    }

    public void setOpenRecordedTime(Date openRecordedTime) {
        this.openRecordedTime = openRecordedTime;
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
        sb.append(", recentTime=").append(recentTime);
        sb.append(", recordedSize=").append(recordedSize);
        sb.append(", openRecordedTime=").append(openRecordedTime);
        sb.append(", operationStatus=").append(operationStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}