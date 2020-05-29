package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.Order;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.omg.CORBA.INTERNAL;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface OrderMapper extends Mapper<Order> {
/*
* 分发商id 被授权id 订单状态（未支付，已支付）select
*
*
* */
    @Update("")
    boolean UpdateValidByUser(Integer UserId, Integer Valid);//更新订单状态

    @Select("select * from order where user_id = #{userId} and music_id = #{musicId}")
    List<Order> queryByUserIdAndMusicId(Integer userId, Integer musicId);

    @Select("select * from order where user_id = #{userId} and valid_status = #{validStatus}")
    List<Order> queryByUserIdAndValidStatus(Integer userId, Integer validStatus);

    @Select("select * from order where user_id = #{userId}")
    List<Order> queryByUserId(Integer userId);

    @Update("")
    boolean updateValidStatus(Integer orderId, Integer userId, Integer validStatus);

    @Select("select * from order where create_time= #{createTime}")
    Order selectByDate(Date createTime);
	
	/**
     * 根据用户id查出已完成的订单编号
     * @param userId
     * @return
     */
    @Select("select order_id from order where user_id=#{userId} and valid_status=2")
    public ArrayList<Integer> selectOrderIdByUid(Integer userId);
}
