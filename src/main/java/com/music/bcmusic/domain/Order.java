package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "order")
public class Order implements Serializable {
    private static final long serialVersionUID = -23617741664413750L;
    
    private Integer orderId;
    
    private Integer userId;
    
    private Integer paymentMethod;
    
    private Object orderAmount;
    
    private Object discountAmount;
    
    private Object paymentAmount;
    
    private Integer orderPoint;
    
    private Integer validStatus;
    
    private Date createTime;
    
    private Date payTime;
    
    private Date finishTime;

    public void setByOrderCart(OrderCart orderCart){
        this.userId = orderCart.getUserId();
        this.paymentMethod = 0;
        this.orderAmount = null;
        this.paymentAmount = null;
        this.orderPoint = 0;
        this.validStatus = -1;
        this.createTime = new Date();
        this.payTime = null;
        this.finishTime = null;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Object getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Object orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Object getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Object discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Object getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Object paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(Integer orderPoint) {
        this.orderPoint = orderPoint;
    }

    public Integer getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

}