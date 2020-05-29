package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.MuDistriSearch;
import com.music.bcmusic.dao.DistributeDetailMapper;
import com.music.bcmusic.dao.DistributorMapper;
import com.music.bcmusic.dao.OrderDetailMapper;
import com.music.bcmusic.dao.OrderMapper;
import com.music.bcmusic.domain.Order;
import com.music.bcmusic.domain.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MuDistriSearchImpl implements MuDistriSearch {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DistributeDetailMapper distributeDetailMapper;

    @Override
    public OrderDetail getTransByEndUser(int Music_id, int Distributor_id, int End_user_id, int Page_num, int Limit) {

        List<Order> orderList;
        OrderDetail orderDetail;
        orderList = orderMapper.queryByUserIdAndMusicId(End_user_id, Music_id);
        List<Integer> list = distributeDetailMapper.searchOrderIdByUserId(Distributor_id);
        for (int i=0;i<orderList.size();i++)
        {
            if(list.contains(orderList.get(i).getOrderId()))
            {
                orderDetail = orderDetailMapper.queryByOrderId(orderList.get(i).getOrderId());
                return orderDetail;
            }
        }
        return null;
    }

    @Override
    public List<Order> getOrdersByEndUser(int Distributor_id, int End_User_id, int Page_num, int Limit) {
        List<Order> orderList = distributeDetailMapper.queryByDistributorId(Distributor_id);
        for(int i = 0 ; i < orderList.size() ; i++)
        {
            if (orderList.get(i).getUserId()!= End_User_id)
                orderList.remove(i);
        }
        return orderList;
    }

    @Override
    public List<Order> getOrdersByStatus(int Distributor_id, int User_id, int Valid_status, int Page_num, int Limit) {
        List<Order> orderList = distributeDetailMapper.queryByDistributorId(Distributor_id);
        for(int i = 0 ; i < orderList.size() ; i++)
        {
            if (orderList.get(i).getUserId()!= User_id || orderList.get(i).getValidStatus()!=Valid_status)
                orderList.remove(i);

        }
        return orderList;
    }
}
