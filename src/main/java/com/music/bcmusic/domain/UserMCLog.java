package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Usermclog)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "usermclog")
public class UserMCLog implements Serializable {
    private static final long serialVersionUID = -45482753492161596L;
    
    private Integer mcId;
    
    private Integer userId;
    
    private Integer source;
    
    private Object changeMc;
    
    private Date createTime;


    public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Object getChangeMc() {
        return changeMc;
    }

    public void setChangeMc(Object changeMc) {
        this.changeMc = changeMc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}