package com.music.bcmusic.Service;

public interface CoriTraSearch {//版权交易搜索

    public void getMusicOrders(int User_id, int Page_num, int Limit);

    public void getMusicOrdersByStatus(int User_id, int Valid_status, int Page_num, int Limit);

    public void getMusicTransByOwner(int Music_id ,int User_id, int Page_num, int Limit);

    public void getMusicTransByBuyer(int Music_id ,int User_id, int Page_num, int Limit);

    public void getMusicTransByKeyword(String Name_keyword, String Maker_keyword, String User_keyword,int Page_num, int Limit);

    public void getAllMusicTrans(int User_id, int Page_num, int Limit);

    public void getConstractDetailById(int Music_id , int User_id);

    public void getTransByDistributor(int Music_id, int User_id, int Page_num, int Limit);


}
