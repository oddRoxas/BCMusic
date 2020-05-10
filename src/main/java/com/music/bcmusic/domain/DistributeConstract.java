package com.music.bcmusic.domain;

import java.io.Serializable;

public class DistributeConstract implements Serializable {//名字问题
    
    private int constractId;
    
    private int userId;

    private double distributeRatio;
    
    private double ownRatio;
    
    private double EndUserRatio;
    
    private long createTime;


    //public void createConstract()

    public int getConstractId() {
        return constractId;
    }

    public void setConstractId(int constractId) {
        this.constractId = constractId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getDistributeRatio() {
        return distributeRatio;
    }

    public void setDistributeRatio(double distributeRatio) {
        this.distributeRatio = distributeRatio;
    }

    public double getOwnRatio() {
        return ownRatio;
    }

    public void setOwnRatio(double ownRatio) {
        this.ownRatio = ownRatio;
    }

    public double getEndUserRatio() {
        return EndUserRatio;
    }

    public void setEndUserRatio(double endUserRatio) {
        EndUserRatio = endUserRatio;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}
