package com.music.bcmusic.vo;

import com.music.bcmusic.domain.User;

import java.util.Date;

/**
 * 根据音乐id查找音乐的返回类
 * @author yg
 */
public class MusicInfo {
    private String musicName;
    private String musicMaker;
    private String musicStyle;
    private User user;
    private Date checkTimeStamp;

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

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCheckTimeStamp() {
        return checkTimeStamp;
    }

    public void setCheckTimeStamp(Date checkTimeStamp) {
        this.checkTimeStamp = checkTimeStamp;
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "musicName='" + musicName + '\'' +
                ", musicMaker='" + musicMaker + '\'' +
                ", musicStyle='" + musicStyle + '\'' +
                ", user=" + user +
                ", checkTimeStamp=" + checkTimeStamp +
                '}';
    }
}
