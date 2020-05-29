package com.music.bcmusic.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Userloginlog)实体类
 *
 * @author makejava
 * @since 2020-04-25 16:43:11
 */
@Entity
@Table(name = "userloginlog")
public class UserLoginLog implements Serializable {
    private static final long serialVersionUID = 225002016533979051L;
    
    private Integer loginId;
    
    private Integer userId;
    
    private Date loginTime;
    
    private Object loginStatus;


    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Object getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Object loginStatus) {
        this.loginStatus = loginStatus;
    }

}