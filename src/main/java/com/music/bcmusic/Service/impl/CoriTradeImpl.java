package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.CoriTrade;
import com.music.bcmusic.domain.OrderCart;

import java.util.Date;
import java.util.List;

public class CoriTradeImpl implements CoriTrade {
    @Override
    public int createOrderCart(int User_id, int Music_id, int Auz_type, String Auz_region, long Auz_duration, double Price_per_day) {
        OrderCart orderCart = new OrderCart();
       //添加最后修改时间

        //考虑到和cookie的关系
        return 0;
    }

    @Override
    public int deleteOrderCart(int User_id, int Music_id) {
        //数据库操作 delete where musicId= And userId ==


        return 0;
    }

    @Override
    public int deleteOrderCardByUser(int User_id) {
        //删除用户旗下所有 delete where userId ==
        return 0;
    }

    @Override
    public int createOrderFromCart(int User_id, int Oder_card_ids) {
      //提交一个订单
    /*    OrderCart orderCart = new OrderCart();
        //从数据库读取
        Order order = new Order();
        order.getOrder(orderCart);
        //数据库insert
*/
        return 0;
    }

    @Override
    public int createOrderAtOnce(int User_id, int Music_id, int Auz_type, String Auz_region, long Auz_duration, double Price_per_day) {
    //    Order order = new Order();


        return 0;
    }

    @Override
    public int cancelOrder(int User_id, int Order_id) {
     //   OrderCart orderCart = new OrderCart();
      //  Order order = new Order();//初始化订单，并添加到

        return 0;

    }

    @Override
    public int PayForOrder(int User_id, int Oder_id, int Pay_method, String Pay_Password) {


        return 0;
    }

    @Override
    public boolean checkPayment() {
        return false;
    }

    @Override
    public int createDistrConstractFromCart(int User_id, double Own_ratio, double End_user_ratio, List<OrderCart> Order_cart_ids) {
        for(int i = 0; i < Order_cart_ids.size(); i++)
        {
            Order_cart_ids.get(i);//购物车用处不明
        }

        Date date = new Date();

     /*   DistributeConstract distributeConstract = new DistributeConstract();
        distributeConstract.setUserId(User_id);
        //distributeConstract.setDistributeRatio(); 需要从数据库读取，或者在后面直接添加
        distributeConstract.setOwnRatio(Own_ratio);
        distributeConstract.setEndUserRatio(End_user_ratio);
        distributeConstract.setCreateTime(date.getTime());//获取的是毫秒
*/

        return 0;
    }

    @Override
    public int createDistrConstractAtOnce(int User_id, double Own_ratio, double End_user_ratio, int Music_id, int Auz_type, int Auz_region, int Auz_duration, int Price_per_day) {
        return 0;
    }

    @Override
    public int updateDistrStatus(int User_id, int Music_id, int Operation) {
       // Music music = new Music();

       // music.setValidStatus(Operation);


        return 0;
    }
}
