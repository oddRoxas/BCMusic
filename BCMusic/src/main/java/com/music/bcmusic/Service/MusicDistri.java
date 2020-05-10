package com.music.bcmusic.Service;

public interface MusicDistri {//音乐分发

    //剩余见接口文档，缺少1.2.11

    public void submitOrder(int Distributor_id, int End_user_id, int Music_id, int Auz_type, String Auz_region, Long Auz_duration, double Price_per_day);

    public void cancelOrder(int End_user_id, int Order_id);

    public void payforOrder(int Distributor_id, int End_user_id, int Order_id, int Pay_method, String Pay_Password);

    public void downloadMusic(int Music_id, int User_id);
}
