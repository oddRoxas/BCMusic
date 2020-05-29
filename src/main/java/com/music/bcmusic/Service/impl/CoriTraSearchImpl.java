package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.CoriTraSearch;
import com.music.bcmusic.dao.ConstractDetailMapper;
import com.music.bcmusic.dao.DistributeConstractMapper;
import com.music.bcmusic.dao.OrderDetailMapper;
import com.music.bcmusic.dao.OrderMapper;
import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.DistributeConstract;
import com.music.bcmusic.domain.Order;
import com.music.bcmusic.domain.OrderDetail;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CoriTraSearchImpl implements CoriTraSearch {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private DistributeConstractMapper distributeConstractMapper;

    @Autowired
    private ConstractDetailMapper constractDetailMapper;

    @Override
    public List<Order> getMusicOrders(int User_id, int Page_num, int Limit) {
        List<Order> orderList = orderMapper.queryByUserId(User_id);
        return orderList;

    }

    @Override
    public List<Order> getMusicOrdersByStatus(int User_id, int Valid_status, int Page_num, int Limit) {
        List<Order> orderList = orderMapper.queryByUserIdAndValidStatus(User_id,Valid_status);
        return orderList;

    }

    @Override
    public List<OrderDetail> getMusicTransByOwner(int Music_id, int User_id, int Page_num, int Limit) {
        List<OrderDetail> orderDetailList = orderDetailMapper.queryByOwnerIdAndMusicId(User_id, Music_id);
        return orderDetailList;
    }

    @Override
    public  List<OrderDetail> getMusicTransByBuyer(int Music_id, int User_id, int Page_num, int Limit) {
        List<OrderDetail> orderDetailList = orderDetailMapper.queryByUserIdAndMusicId(User_id, Music_id);
        return  orderDetailList;
    }

    @Override
    public void getMusicTransByKeyword(String Name_keyword, String Maker_keyword, String User_keyword, int Page_num, int Limit) {
        //根据关键字查询
    }

    @Override
    public List<DistributeConstract> getAllMusicTrans(int User_id, int Page_num, int Limit) {
        List<DistributeConstract> distributeConstractList = distributeConstractMapper.queryByUserId(User_id);
        return distributeConstractList;
    }

    @Override
    public ConstractDetail getConstractDetailById(int Music_id, int User_id) {
        ConstractDetail constractDetail = constractDetailMapper.queryByUserIdAndMusicId(User_id, Music_id);
        return constractDetail;
    }

    @Override
    public List<OrderDetail> getTransByDistributor(int Music_id, int User_id, int Page_num, int Limit) {
        List<OrderDetail> orderDetailList = orderDetailMapper.queryByDistributorIdAndMusicId(User_id,Music_id);
        return orderDetailList;
    }
}
