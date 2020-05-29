package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Constractdetail)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "constractdetail")
public class ConstractDetail implements Serializable {
    private static final long serialVersionUID = 739157584578937152L;
    
    private Integer constractDetailId;
    
    private Integer constractId;
    
    private Integer musicId;
    
    private Integer auzType;
    
    private String auzRegion;
    
    private Date auzDuration;
    
    private Object pricePerDay;
    
    private Date expirationTime;
    
    private Object validStatus;
    
    private Object openStatus;


    public Integer getConstractDetailId() {
        return constractDetailId;
    }

    public void setConstractDetailId(Integer constractDetailId) {
        this.constractDetailId = constractDetailId;
    }

    public Integer getConstractId() {
        return constractId;
    }

    public void setConstractId(Integer constractId) {
        this.constractId = constractId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public Integer getAuzType() {
        return auzType;
    }

    public void setAuzType(Integer auzType) {
        this.auzType = auzType;
    }

    public String getAuzRegion() {
        return auzRegion;
    }

    public void setAuzRegion(String auzRegion) {
        this.auzRegion = auzRegion;
    }

    public Date getAuzDuration() {
        return auzDuration;
    }

    public void setAuzDuration(Date auzDuration) {
        this.auzDuration = auzDuration;
    }

    public Object getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Object pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Object getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Object validStatus) {
        this.validStatus = validStatus;
    }

    public Object getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Object openStatus) {
        this.openStatus = openStatus;
    }

}