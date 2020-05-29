package com.music.bcmusic.Service;

import com.music.bcmusic.domain.AlipayBean;
import com.music.bcmusic.domain.OrderCart;

import java.util.List;

public interface CoriTrade {//版权交易

    public int createOrderCart(int User_id, int Music_id, int Auz_type, String Auz_region, String Auz_duration, double Price_per_day);

    public int deleteOrderCart(int User_id, int Music_id);

    public int deleteOrderCardByUser(int User_id);

    public int createOrderFromCart(int User_id, int Oder_card_ids);

    public int createOrderAtOnce(int User_id, int Music_id, int Auz_type, String Auz_region, String Auz_duration, double Price_per_day);

    public int cancelOrder(int User_id, int Order_id);

    public int PayForOrder(int User_id, int Oder_id, int Pay_method, String Pay_Password);

    public boolean checkPayment();//详见接口文档

    public int createDistrConstractFromCart(int User_id, double Own_ratio, double End_user_ratio, List<OrderCart> Order_cart_ids);

    public int createDistrConstractAtOnce(int User_id, double Own_ratio, double End_user_ratio,int Music_id, int Auz_type, String Auz_region, String Auz_duration, int Price_per_day);

    public int updateDistrStatus(int User_id, int Music_id, int Operation);

}
