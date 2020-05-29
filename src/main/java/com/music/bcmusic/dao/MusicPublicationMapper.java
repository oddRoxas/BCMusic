package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.MusicPublication;
import com.music.bcmusic.vo.GetMusicPubById;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;

@Repository
public interface MusicPublicationMapper extends Mapper<MusicPublication> {
	
	/**
     * 查询符合编辑条件的发布
     * @param pubId
     * @return???
     */
    @Select("select * from music_publication where pub_id=#{pubId} and valid_status=1")
    public MusicPublication selectModifPublication (int pubId);

    /**
     * 根据music查询
     * Allow_type			int				允许授权类型
     * Allow_region			int				允许授权区域
     * Allow_start_time		long				允许授权的开始时间
     * Allow_end_time		long				允许授权的结束时间
     * Price_per_day			double			授权单价（元/天）
     * @param musicId
     * @return
     */
    @Select("select allow_type,allow_region,allow_start_time,allow_end_time,price_per_day from music_publication where music_id=#{musicId} and valid_status=1")
    public GetMusicPubById selectMusicPubInfoById(int musicId);

    /**
     * 管理员获取音乐订单列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Select("select * from music_publication limit (#{pageNum}-1)*#{pageSize},#{pageSize}")
    public ArrayList<MusicPublication> selectMusicPublications (int pageNum, int pageSize);

    /**
     * 查询所有记录数目
     * @return
     */

    @Autowired
    @Select("select count(*) from music_publication")
    public int getCount();
}
