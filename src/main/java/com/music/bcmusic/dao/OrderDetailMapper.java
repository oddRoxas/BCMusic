package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.OrderDetail;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface OrderDetailMapper extends Mapper<OrderDetail> {
/*
* 作品id，终端用户id，分发商id select list
*
* 分发商id 终端id select list
*
*
*
* */

    @Select("select * from orderdetail where order_id =#{orderId}")
    OrderDetail queryByOrderId(Integer orderId);

    @Select("select orderDetail from orderdetail, music " +
        "where music.user_id = #{userId} and orderdetail.music_id = #{musicId}")
    List<OrderDetail> queryByOwnerIdAndMusicId(Integer userId, Integer musicId);

    @Select("select orderDetail from orderdetail, order "  +
        "where order.user_id = #{userId} and orderdetail.music_id = #{musicId} and order.order_id = orderdetail.order_id")
    List<OrderDetail> queryByUserIdAndMusicId(Integer userId, Integer musicId);

    @Select("select orderDetail from orderdetail, distributedetail "  +
            "where distributedetail.user_id = #{userId} and orderdetail.music_id = #{musicId} and distributedetail.order_id = orderdetail.order_id")
    List<OrderDetail> queryByDistributorIdAndMusicId(Integer userId, Integer musicId);

	 /**
     * 根据order id的列表查询出符合条件的music_id
     * 这样可以只遍历一次
     * @param oidList
     * @param date
     * @return
     */
    @Select("select * from order_detail where order_id in #{oidList} and auz_duration<=#{date,jdbcType=TIMESTAMP}")
    ArrayList<Integer> selectMidListByOidList(String oidList, Date date);
	}
