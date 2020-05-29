package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Orderdetail)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "orderdetail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = -46684981580032786L;
    
    private Integer orderDetailId;
    
    private Integer orderId;
    
    private Integer musicId;
    
    private Integer auzType;
    
    private String auzRegion;
    
    private Date auzDuration;
    
    private Object pricePerDay;
    
    private Object paymentMoney;
    
    private Object discountMoney;
    
    private Object mbPoint;


    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Object getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Object paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Object getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Object discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Object getMbPoint() {
        return mbPoint;
    }

    public void setMbPoint(Object mbPoint) {
        this.mbPoint = mbPoint;
    }

}