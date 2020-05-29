package com.music.bcmusic.Service;

import com.music.bcmusic.domain.AlipayBean;

public interface MusicDistri {//音乐分发

    //剩余见接口文档，缺少1.2.11

    public void submitOrder(int Distributor_id, int End_user_id, int Music_id, int Auz_type, String Auz_region, long Auz_duration, double Price_per_day);

    public int cancelOrder(int End_user_id, int Order_id);

    public AlipayBean payforOrder(int Distributor_id, int End_user_id, int Order_id, int Pay_method, String Pay_Password);

    public String downloadMusic(int Music_id, int User_id);
}
