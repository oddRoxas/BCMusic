package com.music.bcmusic.domain;

import java.io.Serializable;

public class Music implements Serializable {

    private int musicId;

    private String musicName;

    private  String musicMaker;

    private int userId;

    private int musicStyleId;

    private int musicEmotionId;

    private String musicAddr;

    private long uploadTimestamp;

    private long checkTimestamp;

    private int validStatus;

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMusicStyleId() {
        return musicStyleId;
    }

    public void setMusicStyleId(int musicStyleId) {
        this.musicStyleId = musicStyleId;
    }

    public int getMusicEmotionId() {
        return musicEmotionId;
    }

    public void setMusicEmotionId(int musicEmotionId) {
        this.musicEmotionId = musicEmotionId;
    }

    public String getMusicAddr() {
        return musicAddr;
    }

    public void setMusicAddr(String musicAddr) {
        this.musicAddr = musicAddr;
    }

    public long getUploadTimestamp() {
        return uploadTimestamp;
    }

    public void setUploadTimestamp(long uploadTimestamp) {
        this.uploadTimestamp = uploadTimestamp;
    }

    public long getCheckTimestamp() {
        return checkTimestamp;
    }

    public void setCheckTimestamp(long checkTimestamp) {
        this.checkTimestamp = checkTimestamp;
    }

    public int getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(int validStatus) {
        this.validStatus = validStatus;
    }
}
