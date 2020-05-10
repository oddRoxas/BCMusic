package com.music.bcmusic.Service;

public interface MuDistriSearch {//音乐分发搜索

    //剩余见接口文档,缺少1.15

    public void getTransByEndUser(int Music_id, int Distributor_id, int End_user_id, int Page_num, int Limit);

    public void getOrdersByEndUser(int Distributor_id, int End_User_id, int Page_num, int Limit);

    public void getOrdersByStatus(int Distributor_id, int User_id, int Valid_status,int Page_num, int Limit);

}
