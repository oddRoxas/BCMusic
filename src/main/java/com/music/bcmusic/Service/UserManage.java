package com.music.bcmusic.Service;

import com.alibaba.fastjson.JSONArray;

public interface UserManage {//用户管理

    public int registerUser(int User_id, String User_name, String User_phone,String Password);

    public int applyToBeMusician(int User_id, String Id_number, String card_id, String User_location, String User_mail);

    public int applyToBeEnterprise(int User_id, String Ent_name, String Ent_uscc, String Card_id, String Ent_manager,
                                   String Ent_phone, String Ent_location, String Ent_mail,int node_number);

    public int applyToBeDistributor(int User_id, String Distr_name, String Distr_uscc, String Card_id, String Distr_manager,
                                    String Distr_phone, String Distr_location, String Distr_mail,int node_number);

    public JSONArray getIdentityInfo(int User_id, int User_type);
}
