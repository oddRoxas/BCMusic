package com.music.bcmusic.Service;

public interface SupUserMan {//平台运营模块

    public void getUsers(int admin_id);

    public int delUser(int Admin_id, int User_id);

    public int resetPasswd(int Admin_id, int User_id);

    public void getApplicationsByType(int Admin_id, int User_type);

    public void getApplicationsById(int Admin_id, int User_type);

    public void checkApplication(int Auditor_id, int application_id, int user_type, int Valid_status);



}
