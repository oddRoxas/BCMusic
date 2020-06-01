package com.music.bcmusic.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.music.bcmusic.Service.SupUserMan;
import com.music.bcmusic.dao.DistributorMapper;
import com.music.bcmusic.dao.EnterpriseMapper;
import com.music.bcmusic.dao.MusicianMapper;
import com.music.bcmusic.dao.UserMapper;
import com.music.bcmusic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SupUserMan实现
 *
 * @version v1.0
 * @author Yang Wenjie
 * @since 2020-04-25
 */
@Service
public class SupUserManImpl implements SupUserMan {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MusicianMapper musicianMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Autowired
    private DistributorMapper distributorMapper;

    private boolean checkAdmin(int admin_id) {
        User user = this.userMapper.selectById(admin_id).get(0);
        return !(user == null || user.getIsValid().equals(-1));
    }

    private JSONArray packageListIntoJSON(List<User> users) {
        List<Map<String, Object>> jsonList = new ArrayList<>();
        // 对每个user打包
        for (User user:
                users) {
            Map<String, Object> map = new HashMap<>();
            map.put("User_id", user.getUserId());
            map.put("User_phone", user.getUserPhone());
            map.put("Passwd", user.getPasswd());
            map.put("Is_valid", user.getIsValid());
            map.put("User_type", user.getUserId());
            jsonList.add(map);
        }
        return JSONArray.parseArray(JSON.toJSONString(jsonList, SerializerFeature.WriteMapNullValue));
    }

    @Override
    public JSONArray getUsers(int admin_id) {
        if (checkAdmin(admin_id)) {
            return this.packageListIntoJSON(this.userMapper.select());
        } else {
            return null;
        }
    }

    @Override
    public int delUser(int Admin_id, int User_id) {
        if (this.checkAdmin(Admin_id))
            return userMapper.delete(User_id);
        else
            return 0;
    }

    @Override
    public int resetPasswd(int Admin_id, int User_id) {
        /*
         * 用户的默认密码，未加密
         * TODO: 设置正确的加密方式
         */
        String DEFAULTUSERPASSWORD = "123";
        if (checkAdmin(Admin_id))
            return this.userMapper.updatePassword(User_id, DEFAULTUSERPASSWORD);
        else
            return 0;
    }

    @Override
    public JSONArray getApplicationsByType(int Admin_id, int User_type) {
        if (checkAdmin(Admin_id))
            return this.packageListIntoJSON(this.userMapper.selectByType(User_type));
        else
            return null;
    }

    @Override
    public JSONArray getApplicationsById(int Admin_id, int User_id, int User_type) {
        if (checkAdmin(Admin_id))
            return this.packageListIntoJSON(this.userMapper.selectByIdAndType(User_id, User_type));
        else
            return null;
    }

    @Override
    public int checkApplication(int Auditor_id, int application_id, int user_type, int Valid_status) {
        List<User> auditors = this.userMapper.selectById(Auditor_id);
        if (auditors.size() != 1)
            return -1;
        User auditor = auditors.get(0);
        if (!auditor.isAdmin())
            return -1;

        switch (user_type) {
            case 1:
                return this.musicianMapper.updateValidStatus(application_id, Valid_status);
            case 2:
                return this.enterpriseMapper.updateValidStatus(application_id, Valid_status);
            case 3:
                return this.distributorMapper.updateValidStatus(application_id, Valid_status);
            default:
                return -1;
        }
    }
}
