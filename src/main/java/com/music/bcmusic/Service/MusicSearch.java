package com.music.bcmusic.Service;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.Music;
import com.music.bcmusic.domain.Order;
import com.music.bcmusic.vo.GetMusicPubById;
import com.music.bcmusic.vo.MusicInfo;
import com.music.bcmusic.vo.SearchPubResult;
import com.music.bcmusic.vo.SearchResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//音乐搜索
public interface MusicSearch {

    /**
     * 按关键字、按条件、按id查询音乐。
     * @param pageNum 当前页面
     * @param limit 页面偏移量
     * @return     MusicList            ArrayList<Music>(?)	音乐列表
     *          Page_num		int					当前页码
     *          Total_pages		int					分页总数
     *          Total_Music		int					音乐总数
     *          Limit			int					页面偏移量
     */
    public SearchResult getMusic(int pageNum, int limit);

    /**
     * 用户在“版权交易”页面的搜索框输入关键字，系统根据关键词从数据
     * 库中查询音乐数据并返回。
     * @param keyWord 查询关键字
     * @param pageNum 当前页面
     * @param limit   页面偏移量
     * @return MusicList            ArrayList<Music>(?)	音乐列表
     *          Page_num		int					当前页码
     *          Total_pages		int					分页总数
     *          Total_Music		int					音乐总数
     *          Limit			int					页面偏移量
     */
    public SearchResult getMusicByKeyword(String keyWord, int pageNum, int limit);

    /**
     * 系统根据授权方id从数据库
     * 中查询音乐数据并返回，用以在“上传的音乐”页面展示。
     * @param userId  授权方id（版权方id）
     * @param pageNum 当前页面
     * @param limit  页面偏移量
     * @return  SearchResult
     */
    public SearchResult getMusicByOwner(int userId, int pageNum, int limit);

    /**
     * 系统根据被授权方id从数据库中查询音乐购买订单数据，再筛选
     * 出音乐数据列表并返回，用以在“购买的音乐”页面展示。
     * @param userId 被授权方id
     * @param pageNum 当前页面
     * @param limit 页面偏移量
     * @return  SearchResult
     */
    public SearchResult getMusicByBuyer(int userId, int pageNum, int limit);

    /**
     * 系统根据分发商id从数据库中查询音乐签约订
     * 单数据，再筛选出音乐数据列表并返回，用以在“购买的音乐”页面展示。
     * @param userId
     * @param pageNum
     * @param limit
     * @return
     */
    public SearchResult getMusicByDistributor(int userId, int pageNum, int limit);

    /**
     * 根据作品id从数据库中查询音乐基本信息并返回，用
     * 以在“上传的音乐-电子凭证”页面展示。
     * @param musicId
     * @return
     */
    public MusicInfo getMusicById(int musicId);

    /**
     * 遍历数据库中的音乐发布信息，用以在运营管理平台展示。
     * @param userId
     * @param pageNum
     * @param limit
     * @return
     */
    public SearchPubResult getMusicPublications(int userId, int pageNum, int limit);

    /**
     * 根据作品id从数据库中查询音乐有效发布信息并返回，用以在“版权交易-加入
     * 购物车/购买”页面展示。
     * @param musicId
     * @return
     */
    public GetMusicPubById getMusicPubById(int musicId);


}
