package com.music.bcmusic.Service;

import com.alibaba.fastjson.JSONArray;

public interface SupUserMan { // 平台运营模块

    JSONArray getUsers(int admin_id); // 查看所有系统用户

    int delUser(int Admin_id, int User_id);

    int resetPasswd(int Admin_id, int User_id);

    JSONArray getApplicationsByType(int Admin_id, int User_type);

    JSONArray getApplicationsById(int Admin_id, int User_id, int User_type);

    int checkApplication(int Auditor_id, int application_id, int user_type, int Valid_status);

}
