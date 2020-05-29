package com.music.bcmusic.Service.impl;

import com.alipay.api.AlipayApiException;
import com.music.bcmusic.Service.MusicDistri;
import com.music.bcmusic.Service.PayService;
import com.music.bcmusic.dao.DistributeDetailMapper;
import com.music.bcmusic.dao.MusicMapper;
import com.music.bcmusic.dao.OrderDetailMapper;
import com.music.bcmusic.dao.OrderMapper;
import com.music.bcmusic.domain.*;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.Date;
import java.util.List;

public class MusicDistriImpl implements MusicDistri {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private DistributeDetailMapper distributeDetailMapper;

    @Autowired
    private MusicMapper musicMapper;


    @Autowired
    private PayService payService;

    @Override
    public void submitOrder(int Distributor_id, int End_user_id, int Music_id, int Auz_type, String Auz_region, long Auz_duration, double Price_per_day) {
        Order order  = new Order();
        OrderDetail orderDetail = new OrderDetail();
        DistributeDetail distributeDetail = new DistributeDetail();
        Music music = new Music();
        Date date;

        music = musicMapper.selectByPrimaryKey(Music_id);

        order.setUserId(End_user_id);
        order.setValidStatus(-1);

        order.setOrderPoint(0);
        order.setOrderAmount(0.0);
        order.setPaymentAmount(0);
        order.setCreateTime(date = new Date());
        order.setDiscountAmount(Price_per_day * Auz_duration);
        order.setPaymentMethod(0);

        orderMapper.insert(order);
        order = orderMapper.selectByDate(date);
/*
* order赋值插入，然后读取获得orderID，再插入orderDetail和distributeDetail
*
* */

        orderDetail.setOrderId(order.getOrderId());
        orderDetail.setDiscountMoney(0);
        orderDetail.setPaymentMoney(0);

        distributeDetail.setOrderId(order.getOrderId());
        distributeDetail.setUserId(End_user_id);
        distributeDetail.setOrderPoint(0);

        orderDetail.setMusicId(Music_id);
        orderDetail.setAuzType(Auz_type);
        orderDetail.setAuzRegion(Auz_region);
        //orderDetail.setAuzDuration(Auz_duration); 类型冲突
        orderDetail.setPricePerDay(Price_per_day);


        orderDetailMapper.insert(orderDetail);
        distributeDetailMapper.insert(distributeDetail);


    }

    @Override
    public int cancelOrder(int End_user_id, int Order_id) {
        //终端id和订单id取消,修改valid状态为-1
        if(orderMapper.UpdateValidByUser(End_user_id,Order_id))
            return 1;
        return 0;

    }

    @Override
    public AlipayBean payforOrder(int Distributor_id, int End_user_id, int Order_id,
                              int Pay_method, String Pay_Password) {

        Order order = orderMapper.selectByPrimaryKey(Order_id);
        OrderDetail orderDetail = orderDetailMapper.queryByOrderId(Order_id);
        Music music = musicMapper.selectByPrimaryKey(orderDetail.getMusicId());

        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(Integer.toString(Order_id));//商户订单，编号
        alipayBean.setSubject(music.getMusicName());//订单名称
        alipayBean.setTotal_amount(Integer.toString((int)order.getPaymentAmount()));//付款金额,
        alipayBean.setBody("");//商品描述
        return alipayBean;//由于跳转网址，需要控制器管理

    }

    @Override
    public String downloadMusic(int Music_id, int User_id) {
        String filename;

        filename = musicMapper.getMusicAddr(Music_id, User_id);
        return filename;
        //controller处理io流
    }
}
