package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Wholeasset)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "wholeasset")
public class WholeAsset implements Serializable {
    private static final long serialVersionUID = -37369331566699929L;
    
    private Integer assetId;
    
    private String assetName;
    
    private Integer assetValue;
    
    private Date modifyTime;


    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Integer getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(Integer assetValue) {
        this.assetValue = assetValue;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}