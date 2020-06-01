package com.music.bcmusic.domain;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-05-24 11:15:40
 */
public class User implements Serializable {
    private static final long serialVersionUID = 946194967813991756L;
    
    private Integer userId;
    
    private String userName;
    
    private String userPhone;
    
    private String passwd;
    
    private Integer isValid;
    
    private Integer userType;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public boolean isAdmin() {
        return this.userType.equals(0);
    }

}