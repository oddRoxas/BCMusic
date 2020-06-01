package com.music.bcmusic.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * (Distributor)实体类
 *
 * @author makejava
 * @since 2020-05-24 11:15:40
 */
public class Distributor implements Serializable {
    private static final long serialVersionUID = -76708106367498953L;
    
    private Integer applicationId;
    
    private Integer userId;
    
    private String distrName;
    
    private String distrUscc;
    
    private String cardId;
    
    private String distrManager;
    
    private String distrPhone;
    
    private String distrLocation;
    
    private String distrMail;
    
    private Integer nodeNumber;
    
    private Integer validStatus;
    
    private Integer submitterId;
    
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

    public String getDistrName() {
        return distrName;
    }

    public void setDistrName(String distrName) {
        this.distrName = distrName;
    }

    public String getDistrUscc() {
        return distrUscc;
    }

    public void setDistrUscc(String distrUscc) {
        this.distrUscc = distrUscc;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDistrManager() {
        return distrManager;
    }

    public void setDistrManager(String distrManager) {
        this.distrManager = distrManager;
    }

    public String getDistrPhone() {
        return distrPhone;
    }

    public void setDistrPhone(String distrPhone) {
        this.distrPhone = distrPhone;
    }

    public String getDistrLocation() {
        return distrLocation;
    }

    public void setDistrLocation(String distrLocation) {
        this.distrLocation = distrLocation;
    }

    public String getDistrMail() {
        return distrMail;
    }

    public void setDistrMail(String distrMail) {
        this.distrMail = distrMail;
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

    public Integer getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(Integer submitterId) {
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