package com.yskc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class PmsChatRecord implements Serializable {
    private Integer id;

    private String chatAccount;

    private String chatFilePath;

    private String chatPicturePath;

    private String connectionLocation;
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss")
    private Date recordTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChatAccount() {
        return chatAccount;
    }

    public void setChatAccount(String chatAccount) {
        this.chatAccount = chatAccount;
    }

    public String getChatFilePath() {
        return chatFilePath;
    }

    public void setChatFilePath(String chatFilePath) {
        this.chatFilePath = chatFilePath;
    }

    public String getChatPicturePath() {
        return chatPicturePath;
    }

    public void setChatPicturePath(String chatPicturePath) {
        this.chatPicturePath = chatPicturePath;
    }

    public String getConnectionLocation() {
        return connectionLocation;
    }

    public void setConnectionLocation(String connectionLocation) {
        this.connectionLocation = connectionLocation;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chatAccount=").append(chatAccount);
        sb.append(", chatFilePath=").append(chatFilePath);
        sb.append(", chatPicturePath=").append(chatPicturePath);
        sb.append(", connectionLocation=").append(connectionLocation);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}