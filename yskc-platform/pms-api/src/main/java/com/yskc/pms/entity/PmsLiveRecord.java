package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsLiveRecord implements Serializable {
    private Long id;

    private String userAccount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date recentPlayTime;

    private Integer liveSize;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date openLiveTime;

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

    public Date getRecentPlayTime() {
        return recentPlayTime;
    }

    public void setRecentPlayTime(Date recentPlayTime) {
        this.recentPlayTime = recentPlayTime;
    }

    public Integer getLiveSize() {
        return liveSize;
    }

    public void setLiveSize(Integer liveSize) {
        this.liveSize = liveSize;
    }

    public Date getOpenLiveTime() {
        return openLiveTime;
    }

    public void setOpenLiveTime(Date openLiveTime) {
        this.openLiveTime = openLiveTime;
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
        sb.append(", recentPlayTime=").append(recentPlayTime);
        sb.append(", liveSize=").append(liveSize);
        sb.append(", openLiveTime=").append(openLiveTime);
        sb.append(", operationStatus=").append(operationStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}