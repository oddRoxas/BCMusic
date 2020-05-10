package com.music.bcmusic.domain;

import javax.xml.bind.PrintConversionEvent;

public class Order {

    private int musicId;

    private int userId;

    private String AuzRegion;

    private long AuzDuration;

    private double pricePerDay;

    private int AuzType;

    public void getOrder(OrderCart orderCart){
        musicId = orderCart.getMusicId();
        userId = orderCart.getUserId();
        AuzRegion = orderCart.getAuzRegion();
        AuzDuration = orderCart.getAuzDuration();
        pricePerDay = orderCart.getPricePerDay();
        AuzType = orderCart.getAuzType();
    }

    public void setOrder(int User_id, int Music_id, int Auz_type, String Auz_region, long Auz_duration, double Price_per_day){
        setMusicId(Music_id);
        setUserId(User_id);
        setAuzType(Auz_type);
        setAuzRegion(AuzRegion);
        setAuzDuration(Auz_duration);
        setPricePerDay(Price_per_day);


    }




    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAuzRegion() {
        return AuzRegion;
    }

    public void setAuzRegion(String auzRegion) {
        AuzRegion = auzRegion;
    }

    public long getAuzDuration() {
        return AuzDuration;
    }

    public void setAuzDuration(long auzDuration) {
        AuzDuration = auzDuration;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getAuzType() {
        return AuzType;
    }

    public void setAuzType(int auzType) {
        AuzType = auzType;
    }


}
