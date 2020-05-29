package com.music.bcmusic.vo;

import java.util.Date;

/**
 * 1.1.8	封装按作品id查询音乐的发布信息（getMusicPubById）
 * @author yg
 */
public class GetMusicPubById {
    private int allowType;
    private int allowRegion;
    private Date allowStartTime;
    private Date allowEndTime;
    private double pricePerDay;

    public int getAllowType() {
        return allowType;
    }

    public void setAllowType(int allowType) {
        this.allowType = allowType;
    }

    public int getAllowRegion() {
        return allowRegion;
    }

    public void setAllowRegion(int allowRegion) {
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

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "GetMusicPubById{" +
                "allowType=" + allowType +
                ", allowRegion=" + allowRegion +
                ", allowStartTime=" + allowStartTime +
                ", allowEndTime=" + allowEndTime +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
