package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Distributeconstract)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:10
 */
@Entity
@Table(name = "distributeconstract")
public class DistributeConstract implements Serializable {
    private static final long serialVersionUID = 796649637024432652L;
    
    private Integer constractId;
    
    private Integer userId;
    
    private Object distributeRatio;
    
    private Object ownRatio;
    
    private Object endUserRatio;
    
    private Date createTime;


    public Integer getConstractId() {
        return constractId;
    }

    public void setConstractId(Integer constractId) {
        this.constractId = constractId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getDistributeRatio() {
        return distributeRatio;
    }

    public void setDistributeRatio(Object distributeRatio) {
        this.distributeRatio = distributeRatio;
    }

    public Object getOwnRatio() {
        return ownRatio;
    }

    public void setOwnRatio(Object ownRatio) {
        this.ownRatio = ownRatio;
    }

    public Object getEndUserRatio() {
        return endUserRatio;
    }

    public void setEndUserRatio(Object endUserRatio) {
        this.endUserRatio = endUserRatio;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}