package com.music.bcmusic.dao;

import com.music.bcmusic.domain.OrderCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderCartMapper extends Mapper<OrderCart> {
    @Select("SELECT order_cart_id as orderCartId FROM ordercart WHERE user_id = #{userId}")
    List<OrderCart> queryByUser(Integer userId);

    @Delete("delete from ordercart where user_id = #{userId} and music_id = #{musicId}")
    boolean deleteByUserIdAndMusicId(Integer userId, Integer musicId);

    @Delete("delete from ordercart where user_id = #{userId} ")
    boolean deleteByUserId(Integer userId);

}
