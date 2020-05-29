package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Userasset)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "userasset")
public class UserAsset implements Serializable {
    private static final long serialVersionUID = 924202813968858468L;
    
    private Integer assetId;
    
    private Integer userId;
    
    private Object mbPoint;
    
    private Integer mcToken;
    
    private Integer gravity;
    
    private Date modifyTime;


    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getMbPoint() {
        return mbPoint;
    }

    public void setMbPoint(Object mbPoint) {
        this.mbPoint = mbPoint;
    }

    public Integer getMcToken() {
        return mcToken;
    }

    public void setMcToken(Integer mcToken) {
        this.mcToken = mcToken;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}