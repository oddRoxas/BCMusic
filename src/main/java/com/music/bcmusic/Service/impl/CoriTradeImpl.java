package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.CoriTrade;
import com.music.bcmusic.Service.PayService;
import com.music.bcmusic.dao.DistributeConstractMapper;
import com.music.bcmusic.dao.MusicMapper;
import com.music.bcmusic.dao.OrderCartMapper;
import com.music.bcmusic.dao.OrderMapper;
import com.music.bcmusic.domain.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class CoriTradeImpl implements CoriTrade {

    @Autowired
    private OrderCartMapper orderCartMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private DistributeConstractMapper distributeConstractMapper;

    @Autowired
    private PayService payService;

    @Override
    public int createOrderCart(int User_id, int Music_id, int Auz_type, String Auz_region, String Auz_duration, double Price_per_day) {
        OrderCart orderCart = new OrderCart();

        orderCart.setUserId(User_id);
        orderCart.setMusicId(Music_id);
        orderCart.setAuzType(Auz_type);
        orderCart.setAuzRegion(Auz_region);
        //orderCart.setAuzDuration(Auz_duration);类型冲突
        orderCart.setPricePerDay(Price_per_day);
        orderCartMapper.insert(orderCart);
        return 1;
    }

    @Override
    public int deleteOrderCart(int User_id, int Music_id) {
       if( orderCartMapper.deleteByUserIdAndMusicId(User_id,Music_id))
            return 1;

        return 0;
    }

    @Override
    public int deleteOrderCardByUser(int User_id) {
        if(orderCartMapper.deleteByUserId(User_id))
            return 1;

        return 0;
    }

    @Override
    public int createOrderFromCart(int User_id, int Oder_card_ids) {

        OrderCart orderCart = orderCartMapper.selectByPrimaryKey(Oder_card_ids);
        Order order = new Order();
        order.setByOrderCart(orderCart);
        orderMapper.insert(order);
        /*
        * 返回一个order，没有信息为0和null
        *
        *
        * */

        return 1;
    }

    @Override
    public int createOrderAtOnce(int User_id, int Music_id, int Auz_type, String Auz_region, String Auz_duration, double Price_per_day) {
        OrderCart orderCart = new OrderCart();
        Order order = new Order();
      //初始化order和orderCart

        /*
         * 返回一个order，还需要其他信息
         *
         *
         * */

        return 1;
    }

    @Override
    public int cancelOrder(int User_id, int Order_id) {
        if(orderMapper.updateValidStatus(Order_id, User_id, -1))
            return 1;

        return 0;

    }

    @Override
    public int PayForOrder(int User_id, int Order_id, int Pay_method, String Pay_Password) {
        //支付宝方法已在MusicDistri实现，重复。直接调用支付宝未使用密码。其他支付方式等待添加



        return 0;
    }

    @Override
    public boolean checkPayment() {
        return false;
    }

    @Override
    public int createDistrConstractFromCart(int User_id, double Own_ratio, double End_user_ratio, List<OrderCart> Order_cart_ids) {
        DistributeConstract distributeConstract = new DistributeConstract();

        distributeConstract.setUserId(User_id);
        distributeConstract.setOwnRatio(Own_ratio);
        distributeConstract.setEndUserRatio(End_user_ratio);
        distributeConstractMapper.insert(distributeConstract);

        return 1;
    }

    @Override
    public int createDistrConstractAtOnce(int User_id, double Own_ratio, double End_user_ratio, int Music_id, int Auz_type, String Auz_region, String Auz_duration, int Price_per_day) {
        DistributeConstract distributeConstract = new DistributeConstract();
        OrderCart orderCart = new OrderCart();


        orderCart.setUserId(User_id);
        orderCart.setMusicId(Music_id);
        orderCart.setAuzType(Auz_type);
        orderCart.setAuzRegion(Auz_region);
      //  orderCart.setAuzDuration(Auz_duration);
        orderCart.setPricePerDay(Price_per_day);

        distributeConstract.setUserId(User_id);
        distributeConstract.setOwnRatio(Own_ratio);
        distributeConstract.setEndUserRatio(End_user_ratio);
//确认


        return 1;
    }

    @Override
    public int updateDistrStatus(int User_id, int Music_id, int Operation) {
        //
        if(musicMapper.updateValidStatus(User_id, Music_id, Operation))
        return 1;

        return 0;
    }
}
