package com.music.bcmusic.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderCart implements Serializable {

    private int musicId;

    private  int userId;

    private String AuzRegion;

    private long AuzDuration;

    private float pricePerDay;

    private int AuzType;

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

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getAuzType() {
        return AuzType;
    }

    public void setAuzType(int auzType) {
        AuzType = auzType;
    }


       /* private static final long serialVersionUID = 1L;

        private List<Order> items = new ArrayList<Order>();

        public void addItem(Order item){
            if(!items.contains(item)){//检查存在

                items.add(item);
            }else{
                System.out.println("重复添加");
            }
        }

        public List<Order> getItems(){
            return items;
        }

        public void  setItems(List<Order> items){
            this.items = items;
        }


        public Float getOrderPrice(){
            Float result = 0f;

            for(Order butItems : items){//购物车价格统计
                result+=butItems.getPrice();

            }
            return  result;
        }

        public boolean deleteItem(Order item){
            items.remove(item);
            return true;
        }*/
}
