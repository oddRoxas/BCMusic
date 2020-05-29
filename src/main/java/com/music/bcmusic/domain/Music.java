package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Music)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "music")
public class Music implements Serializable {
    private static final long serialVersionUID = -34547545518203464L;
    
    private Integer musicId;
    
    private String musicName;
    
    private String musicMaker;
    
    private Integer userId;
    
    private String musicStyle;
    
    private String musicAddr;
    
    private Date uploadTimestamp;
    
    private Date checkTimestamp;
    
    private Integer validStatus;


    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicMaker() {
        return musicMaker;
    }

    public void setMusicMaker(String musicMaker) {
        this.musicMaker = musicMaker;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public String getMusicAddr() {
        return musicAddr;
    }

    public void setMusicAddr(String musicAddr) {
        this.musicAddr = musicAddr;
    }

    public Date getUploadTimestamp() {
        return uploadTimestamp;
    }

    public void setUploadTimestamp(Date uploadTimestamp) {
        this.uploadTimestamp = uploadTimestamp;
    }

    public Date getCheckTimestamp() {
        return checkTimestamp;
    }

    public void setCheckTimestamp(Date checkTimestamp) {
        this.checkTimestamp = checkTimestamp;
    }

    public Integer getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

}