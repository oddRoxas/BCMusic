package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.Order;
import org.apache.ibatis.annotations.Update;
import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderMapper extends Mapper<Order> {

    @Update("")
    boolean UpdateValidByUser(Integer UserId, Integer Valid);//更新订单状态

}
