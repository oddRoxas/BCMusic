package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.CoriTraSearch;
import com.music.bcmusic.domain.Music;
import com.music.bcmusic.domain.Order;

import java.util.List;

public class CoriTraSearchImpl implements CoriTraSearch {

    @Override
    public void getMusicOrders(int User_id, int Page_num, int Limit) {
        List<Order> list;
       // list.size();
        //每个页面的数量，查询所有


    }

    @Override
    public void getMusicOrdersByStatus(int User_id, int Valid_status, int Page_num, int Limit) {
        List<Order> list;
        list.size();
        //每个页面的数量，根据状态查询
    }

    @Override
    public void getMusicTransByOwner(int Music_id, int User_id, int Page_num, int Limit) {

    }

    @Override
    public void getMusicTransByBuyer(int Music_id, int User_id, int Page_num, int Limit) {

    }

    @Override
    public void getMusicTransByKeyword(String Name_keyword, String Maker_keyword, String User_keyword, int Page_num, int Limit) {

    }

    @Override
    public void getAllMusicTrans(int User_id, int Page_num, int Limit) {

    }

    @Override
    public void getConstractDetailById(int Music_id, int User_id) {

    }

    @Override
    public void getTransByDistributor(int Music_id, int User_id, int Page_num, int Limit) {

    }
}
