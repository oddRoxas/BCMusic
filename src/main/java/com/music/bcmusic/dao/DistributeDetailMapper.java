package com.music.bcmusic.dao;

import com.music.bcmusic.domain.DistributeDetail;
import com.music.bcmusic.domain.Order;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DistributeDetailMapper extends Mapper<DistributeDetail> {

    @Select("select order_id from distributedetail where user_id = #{userId}")
    List<Integer> searchOrderIdByUserId(Integer userId);

    @Select("select order from order, distributedetail " +
            "where order.user_id = distributedetail.user_id and distributedetail.user_id = #{userId}")
    List<Order> queryByDistributorId(Integer userId);
	
	 /**
     * 获取该分发商id的所有合约的id
     * @param userId
     * @return
     */
    @Select("select * from distribute_constract where user_id=#{userId} and valid_status=1")
    public ArrayList<Integer> getCidListByUid(int userId);

}
