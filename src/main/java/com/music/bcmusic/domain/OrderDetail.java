package com.music.bcmusic.domain;

import java.io.Serializable;

public class OrderDetail implements Serializable {

    private int distrDetailId;

    private int OrderId;

    private int UserId;

    private double OrderPoint;

    public int getDistrDetailId() {
        return distrDetailId;
    }

    public void setDistrDetailId(int distrDetailId) {
        this.distrDetailId = distrDetailId;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public double getOrderPoint() {
        return OrderPoint;
    }

    public void setOrderPoint(double orderPoint) {
        OrderPoint = orderPoint;
    }
}
