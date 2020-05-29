package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Musicemotion)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "musicemotion")
public class MusicEmotion implements Serializable {
    private static final long serialVersionUID = -65346326297216924L;
    
    private Integer emotionId;
    
    private String emotionName;
    
    private Object emotionStatus;
    
    private Date modifyTime;


    public Integer getEmotionId() {
        return emotionId;
    }

    public void setEmotionId(Integer emotionId) {
        this.emotionId = emotionId;
    }

    public String getEmotionName() {
        return emotionName;
    }

    public void setEmotionName(String emotionName) {
        this.emotionName = emotionName;
    }

    public Object getEmotionStatus() {
        return emotionStatus;
    }

    public void setEmotionStatus(Object emotionStatus) {
        this.emotionStatus = emotionStatus;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}