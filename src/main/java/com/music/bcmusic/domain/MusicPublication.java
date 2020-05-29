package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Musicpublication)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "musicpublication")
public class MusicPublication implements Serializable {
    private static final long serialVersionUID = 637196391682838433L;
    
    private Integer pubId;
    
    private Integer musicId;
    
    private Integer allowType;
    
    private Integer allowRegion;
    
    private Date allowStartTime;
    
    private Date allowEndTime;
    
    private Object pricePerDay;
    
    private Integer validStatus;
    
    private Integer submitterId;
    
    private Integer auditorId;
    
    private Date submitTimestamp;
    
    private Date checkTimestamp;


    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public Integer getAllowType() {
        return allowType;
    }

    public void setAllowType(Integer allowType) {
        this.allowType = allowType;
    }

    public Integer getAllowRegion() {
        return allowRegion;
    }

    public void setAllowRegion(Integer allowRegion) {
        this.allowRegion = allowRegion;
    }

    public Date getAllowStartTime() {
        return allowStartTime;
    }

    public void setAllowStartTime(Date allowStartTime) {
        this.allowStartTime = allowStartTime;
    }

    public Date getAllowEndTime() {
        return allowEndTime;
    }

    public void setAllowEndTime(Date allowEndTime) {
        this.allowEndTime = allowEndTime;
    }

    public Object getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Object pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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