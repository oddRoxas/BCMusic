package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Ordercart)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "ordercart")
public class OrderCart implements Serializable {
    private static final long serialVersionUID = 913426256302807022L;
    
    private Integer orderCardId;
    
    private Integer userId;
    
    private Integer musicId;
    
    private Integer auzType;
    
    private String auzRegion;
    
    private Date auzDuration;
    
    private Object pricePerDay;
    
    private Date addTime;
    
    private Date modifyTime;


    public Integer getOrderCardId() {
        return orderCardId;
    }

    public void setOrderCardId(Integer orderCardId) {
        this.orderCardId = orderCardId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}