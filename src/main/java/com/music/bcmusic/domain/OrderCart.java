package com.music.bcmusic.domain;

import com.sun.org.apache.xpath.internal.operations.Or;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ordercart")
public class OrderCart implements Serializable {

    @KeySql(useGeneratedKeys = true)
    @Id
    private Integer orderCartId;

    private  Integer userId;

    private Integer musicId;

    private Integer AuzType;

    private String AuzRegion;

    private String  AuzDuration;

    private Double pricePerDay;

    private String  addTime;

    private String modifyTime;

    public Integer getOrderCartId() {
        return orderCartId;
    }

    public void setOrderCartId(Integer orderCartId) {
        this.orderCartId = orderCartId;
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
        return AuzType;
    }

    public void setAuzType(Integer auzType) {
        AuzType = auzType;
    }

    public String getAuzRegion() {
        return AuzRegion;
    }

    public void setAuzRegion(String auzRegion) {
        AuzRegion = auzRegion;
    }

    public String getAuzDuration() {
        return AuzDuration;
    }

    public void setAuzDuration(String auzDuration) {
        AuzDuration = auzDuration;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
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
