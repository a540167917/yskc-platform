package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsVideoControlRecord implements Serializable {
    private Integer id;

    private String userAccount;

    private Integer videoIllegal;

    private Integer videoViolations;
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss")
    private Date accountAoolyTime;

    private Integer videoState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getVideoIllegal() {
        return videoIllegal;
    }

    public void setVideoIllegal(Integer videoIllegal) {
        this.videoIllegal = videoIllegal;
    }

    public Integer getVideoViolations() {
        return videoViolations;
    }

    public void setVideoViolations(Integer videoViolations) {
        this.videoViolations = videoViolations;
    }

    public Date getAccountAoolyTime() {
        return accountAoolyTime;
    }

    public void setAccountAoolyTime(Date accountAoolyTime) {
        this.accountAoolyTime = accountAoolyTime;
    }

    public Integer getVideoState() {
        return videoState;
    }

    public void setVideoState(Integer videoState) {
        this.videoState = videoState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", videoIllegal=").append(videoIllegal);
        sb.append(", videoViolations=").append(videoViolations);
        sb.append(", accountAoolyTime=").append(accountAoolyTime);
        sb.append(", videoState=").append(videoState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}