package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.Music;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MusicMapper extends Mapper<Music> {
/*
*分发商id select list音乐
*Select("SELECT music_id as musicId, music_name as musicName, music_maker as musicMaker, user_id as userId, music_style as musicStyle, music_addr as musicAddr, upload_timestamp as uploadStamp, check_timestamp as " +
        " FROM ordercart WHERE user_id = #{userId}")
* */

    @Select("select * from music where user_id =#{userId}")
    List<Music> queryByUserId(Integer userId);

    @Update("")
    boolean updateValidStatus(Integer userId, Integer musicId,Integer validStatus);

    @Select("")
    String getMusicAddr(Integer musicId, Integer userId);
	
	 /**
     * 根据userId和musciId查询音乐(审核成功)
     * @param musicId
     * @param userId
     * @return
     */
    @Select("select * from music where music_id=#{musicId} and user_id=#{userId} and valid_status=1")
    public Music selectMusicByMidAndUid(int musicId,int userId);

    /**
     * 根据music_id将审核状态设置为撤销
     * @param musicId
     */
    @Update("update music set valid_status =2 where music_id=#{musicId}")
    public void revokeMusicByMId(int musicId);

    /**
     * 根据music_id和musicMaker来查询歌曲
     * @param musicId
     * @param musicMaker
     * @return
     */
    @Select("select * from music where music_id=#{musicId} and music_maker=#{musicMaker} and valid_status=1\"")
    public Music selectMusicByMidAndMMaker(int musicId,String musicMaker);

    /**
     * 获取音乐总数
     * @return
     */
    @Select("select count(*) from music")
    public int getCount();

    /**
     * 根据当前页面和页面大小获取页面的数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Select("select * from music limit (#{pageNum}-1)*#{pageSize},#{pageSize}")
    public ArrayList<Music> getListByPageNum(int pageNum, int pageSize);

    /**
     * 根据关键字查询分页
     * @param keyWord
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Select("select * from music where music_name like '#{keyword}%' limit (#{pageNum}-1)*#{pageSize},#{pageSize}")
    public ArrayList<Music> getListByKeyWord(String keyWord,int pageNum,int pageSize);

    /**
     * 根据查询包含keyword的音乐的数量
     * @param keyWord
     * @return
     */
    @Select("select count(*) from music where music_name like '#{keyword}%'")
    public int getKeyCount(String keyWord);

    /**
     * 获取对应id所拥有的音乐
     * @param uid
     * @return
     */
    @Select("select count(*) from music where user_id=#{uid}")
    public int getCountByUid (int uid);

    /**
     * 根据id获取音乐列表
     * @param uid
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Select("select * from music where music_name like '#{keyword}%' limit (#{pageNum}-1)*#{pageSize},#{pageSize}")
    public ArrayList<Music> getListByUid(int uid,int pageNum,int pageSize);

    /**
     * 被授权者查询分页数据
     * @param midList
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Select("select * from music where music in #{midList} limit (#{pageNum}-1)*#{pageSize},#{pageSize}")
    public ArrayList<Music> getListByMidList(String midList,int pageNum,int pageSize);

}
