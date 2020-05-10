package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.MusicDistri;
import com.music.bcmusic.dao.OrderMapper;
import com.music.bcmusic.domain.DistributeConstract;
import com.music.bcmusic.domain.DistributeDetail;
import com.music.bcmusic.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class MusicDistriImpl implements MusicDistri {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DistributeDetail distributeDetail;

    @Override
    public void submitOrder(int Distributor_id, int End_user_id, int Music_id, int Auz_type, String Auz_region, Long Auz_duration, double Price_per_day) {
        Order order  = new Order();
        //Order初始化
        orderMapper.insert(order);
    }

    @Override
    public void cancelOrder(int End_user_id, int Order_id) {
        //终端id和订单id取消,修改valid状态为-1
        boolean a = orderMapper.UpdateValidByUser(End_user_id,Order_id);

    }

    @Override
    public void payforOrder(int Distributor_id, int End_user_id, int Order_id, int Pay_method, String Pay_Password) {
        //第三方支付

    }

    @Override
    public void downloadMusic(int Music_id, int User_id) {
        //如何实现从数据库下载音乐
    }
}
