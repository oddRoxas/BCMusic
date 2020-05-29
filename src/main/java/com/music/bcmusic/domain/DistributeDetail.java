package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Distributedetail)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "distributedetail")
public class DistributeDetail implements Serializable {
    private static final long serialVersionUID = 150939518371928998L;
    
    private Integer distrDetailId;
    
    private Integer orderId;
    
    private Integer userId;
    
    private Object orderPoint;


    public Integer getDistrDetailId() {
        return distrDetailId;
    }

    public void setDistrDetailId(Integer distrDetailId) {
        this.distrDetailId = distrDetailId;
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

    public Object getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(Object orderPoint) {
        this.orderPoint = orderPoint;
    }

}