package com.music.bcmusic.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * (Enterprise)实体类
 *
 * @author makejava
 * @since 2020-05-24 11:15:40
 */
public class Enterprise implements Serializable {
    private static final long serialVersionUID = -75517687120803214L;
    
    private Integer applicationId;
    
    private Integer userId;
    
    private String entName;
    
    private String entUscc;
    
    private String cardId;
    
    private String entManager;
    
    private String entPhone;
    
    private String entLocation;
    
    private String entMail;
    
    private Integer nodeNumber;
    
    private Integer validStatus;
    
    private String submitterId;
    
    private Integer auditorId;
    
    private Date submitTimestamp;
    
    private Date checkTimestamp;


    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntUscc() {
        return entUscc;
    }

    public void setEntUscc(String entUscc) {
        this.entUscc = entUscc;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getEntManager() {
        return entManager;
    }

    public void setEntManager(String entManager) {
        this.entManager = entManager;
    }

    public String getEntPhone() {
        return entPhone;
    }

    public void setEntPhone(String entPhone) {
        this.entPhone = entPhone;
    }

    public String getEntLocation() {
        return entLocation;
    }

    public void setEntLocation(String entLocation) {
        this.entLocation = entLocation;
    }

    public String getEntMail() {
        return entMail;
    }

    public void setEntMail(String entMail) {
        this.entMail = entMail;
    }

    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public Integer getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

    public String getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public Date getSubmitTimestamp() {
        return submitTimestamp;
    }

    public void setSubmitTimestamp(Date submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
    }

    public Date getCheckTimestamp() {
        return checkTimestamp;
    }

    public void setCheckTimestamp(Date checkTimestamp) {
        this.checkTimestamp = checkTimestamp;
    }

}