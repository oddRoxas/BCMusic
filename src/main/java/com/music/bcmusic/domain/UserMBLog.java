package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Usermblog)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "Usermblog")
public class UserMBLog implements Serializable {
    private static final long serialVersionUID = 456080926854138603L;
    
    private Integer mbId;
    
    private Integer userId;
    
    private String source;
    
    private Integer orderId;
    
    private Object changeMb;
    
    private Date createTime;


    public Integer getMbId() {
        return mbId;
    }

    public void setMbId(Integer mbId) {
        this.mbId = mbId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Object getChangeMb() {
        return changeMb;
    }

    public void setChangeMb(Object changeMb) {
        this.changeMb = changeMb;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}