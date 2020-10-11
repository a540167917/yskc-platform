package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsChatControlRecord implements Serializable {
    private Integer id;

    private String userAccount;

    private Integer chatIllegal;

    private Integer chatViolations;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date accountApplyTime;

    private Integer chatState;

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

    public Integer getChatIllegal() {
        return chatIllegal;
    }

    public void setChatIllegal(Integer chatIllegal) {
        this.chatIllegal = chatIllegal;
    }

    public Integer getChatViolations() {
        return chatViolations;
    }

    public void setChatViolations(Integer chatViolations) {
        this.chatViolations = chatViolations;
    }

    public Date getAccountApplyTime() {
        return accountApplyTime;
    }

    public void setAccountApplyTime(Date accountApplyTime) {
        this.accountApplyTime = accountApplyTime;
    }

    public Integer getChatState() {
        return chatState;
    }

    public void setChatState(Integer chatState) {
        this.chatState = chatState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", chatIllegal=").append(chatIllegal);
        sb.append(", chatViolations=").append(chatViolations);
        sb.append(", accountApplyTime=").append(accountApplyTime);
        sb.append(", chatState=").append(chatState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}