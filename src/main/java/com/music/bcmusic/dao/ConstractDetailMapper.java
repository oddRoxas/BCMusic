package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ConstractDetailMapper extends Mapper<ConstractDetail> {

    @Select("select constractDetail from constractdeatil, distributeconstract " +
            "where distributeconstract.user_id = #{userId) and constractdeatil.music_id = #{musicId) and distributeconstract.constract_id = constractdeatil.constract_id")
    ConstractDetail queryByUserIdAndMusicId(Integer userId, Integer musicId);
	
	  /**
     * 根据订单id列表查询音乐列表
     * @param cidList
     * @return
     */
    @Select("select music_id from constract_detail where constract_id in #{cidList}")
    public ArrayList<Integer> getMidListByCidList(String cidList);
}
