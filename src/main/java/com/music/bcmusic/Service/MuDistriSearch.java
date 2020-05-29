package com.music.bcmusic.Service;

import com.music.bcmusic.domain.Order;
import com.music.bcmusic.domain.OrderDetail;

import java.util.List;

public interface MuDistriSearch {//音乐分发搜索

    //剩余见接口文档,缺少1.15

    public OrderDetail getTransByEndUser(int Music_id, int Distributor_id, int End_user_id, int Page_num, int Limit);

    public List<Order> getOrdersByEndUser(int Distributor_id, int End_User_id, int Page_num, int Limit);

    public List<Order> getOrdersByStatus(int Distributor_id, int User_id, int Valid_status,int Page_num, int Limit);

}
