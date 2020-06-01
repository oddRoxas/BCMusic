package com.music.bcmusic.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * (Musician)实体类
 *
 * @author makejava
 * @since 2020-05-24 11:15:39
 */
public class Musician implements Serializable {
    private static final long serialVersionUID = 406251933445323380L;
    
    private Integer applicationId;
    
    private Integer userId;
    
    private Integer idNumber;
    
    private Integer cardId;
    
    private String userLocation;
    
    private String userMail;
    
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

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
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