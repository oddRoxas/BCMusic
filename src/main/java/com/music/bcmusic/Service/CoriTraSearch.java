package com.music.bcmusic.Service;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.DistributeConstract;
import com.music.bcmusic.domain.Order;
import com.music.bcmusic.domain.OrderDetail;

import java.util.List;

public interface CoriTraSearch {//版权交易搜索

    public List<Order> getMusicOrders(int User_id, int Page_num, int Limit);

    public List<Order> getMusicOrdersByStatus(int User_id, int Valid_status, int Page_num, int Limit);

    public List<OrderDetail> getMusicTransByOwner(int Music_id , int User_id, int Page_num, int Limit);

    public List<OrderDetail> getMusicTransByBuyer(int Music_id ,int User_id, int Page_num, int Limit);

    public void getMusicTransByKeyword(String Name_keyword, String Maker_keyword, String User_keyword,int Page_num, int Limit);

    public List<DistributeConstract> getAllMusicTrans(int User_id, int Page_num, int Limit);

    public ConstractDetail getConstractDetailById(int Music_id , int User_id);

    public List<OrderDetail> getTransByDistributor(int Music_id, int User_id, int Page_num, int Limit);


}
