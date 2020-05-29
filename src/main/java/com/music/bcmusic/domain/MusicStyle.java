package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Musicstyle)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "musicstyle")
public class MusicStyle implements Serializable {
    private static final long serialVersionUID = -35124413595767482L;
    
    private Integer styleId;
    
    private String styleName;
    
    private Object styleStatus;
    
    private Date modifyTime;


    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public Object getStyleStatus() {
        return styleStatus;
    }

    public void setStyleStatus(Object styleStatus) {
        this.styleStatus = styleStatus;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}