package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.DistributeConstract;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DistributeConstractMapper extends Mapper<DistributeConstract> {

    @Select("select * from distributeconstract where user_id = #{userId}")
    List<DistributeConstract> queryByUserId(Integer userId);

    /**
     * 获取该分发商id的所有合约的id
     * @param userId
     * @return
     */
    @Select("select * from distribute_constract where user_id=#{userId} and valid_status=1")
    public ArrayList<Integer> getCidListByUid(int userId);
}
