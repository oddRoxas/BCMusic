package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.MusicSearch;
import com.music.bcmusic.dao.*;
import com.music.bcmusic.domain.Music;
import com.music.bcmusic.util.SqlString;
import com.music.bcmusic.vo.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author yg
 */
public class MusicSearchImpl implements MusicSearch {
    @Autowired
    private MusicMapper musicMapper;
    @Autowired
    private MusicPublicationMapper musicPublicationMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private SqlString sqlString;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DistributeConstractMapper distributeConstractMapper;
    @Autowired
    private ConstractDetailMapper constractDetailMapper;
    /**
     * 一页的数量
     */
    private static int pageSize=20;
    @Override
    public SearchResult getMusic(int pageNum, int limit) {

        SearchResult searchResult=new SearchResult();
        //目标页面
        searchResult.setPageNum(pageNum+=limit);
        //总音乐数量
        searchResult.setTotalMusic(musicMapper.getCount());
        //总页数
        searchResult.setTotalPages(Math.round((float)searchResult.getTotalMusic()/(float)pageSize));
        //音乐列表
        searchResult.setMusicList(musicMapper.getListByPageNum(pageNum, pageSize));
        //偏移量？？？？？？？？？
        searchResult.setLimit(limit);

        return searchResult;
    }

    @Override
    public SearchResult getMusicByKeyword(String keyWord, int pageNum, int limit) {
        SearchResult searchResult=new SearchResult();
        //目标页面
        searchResult.setPageNum(pageNum+=limit);
        searchResult.setTotalMusic(musicMapper.getKeyCount(keyWord));
        searchResult.setTotalPages(Math.round((float)searchResult.getTotalMusic()/(float)pageSize));
        searchResult.setMusicList(musicMapper.getListByKeyWord(keyWord, pageNum, pageSize));
        //偏移量？？？？？？？？？
        searchResult.setLimit(limit);
        return  searchResult;
    }

    @Override
    public SearchResult getMusicByOwner(int userId, int pageNum, int limit) {
        SearchResult searchResult=new SearchResult();
        searchResult.setPageNum(pageNum+=limit);
        searchResult.setTotalMusic(musicMapper.getCountByUid(userId));
        searchResult.setTotalPages(Math.round((float)searchResult.getTotalMusic()/(float)pageSize));
        searchResult.setMusicList(musicMapper.getListByUid(userId, pageNum, pageSize));
        //偏移量？？？？？？？？？
        searchResult.setLimit(limit);
        return  searchResult;
    }

    @Override
    public SearchResult getMusicByBuyer(int userId, int pageNum, int limit) {
        SearchResult searchResult=new SearchResult();
        searchResult.setPageNum(pageNum+=limit);
        //根据被授权方id查出订单详情的id列表
        ArrayList<Integer> uidList = orderMapper.selectOrderIdByUid(userId);
        //传入uidList以及当前日期从而查出未过期的
        ArrayList<Integer> midList = orderDetailMapper.selectMidListByOidList(sqlString.getSqlString(uidList), new Date());
        //查出有多少id就是多少音乐
        searchResult.setTotalMusic(midList.size());
        ArrayList<Music> musicList = musicMapper.getListByMidList(sqlString.getSqlString(midList), pageNum, pageSize);
        searchResult.setMusicList(musicList);
        searchResult.setTotalPages(Math.round((float)searchResult.getTotalMusic()/(float)pageSize));
        searchResult.setLimit(limit);
        return searchResult;
    }

    @Override
    public SearchResult getMusicByDistributor(int userId, int pageNum, int limit) {
        SearchResult searchResult=new SearchResult();
        ArrayList<Integer> cidList = distributeConstractMapper.getCidListByUid(userId);
        ArrayList<Integer> midList = constractDetailMapper.getMidListByCidList(sqlString.getSqlString(cidList));
        ArrayList<Music> musicList = musicMapper.getListByMidList(sqlString.getSqlString(midList), pageNum, pageSize);

        searchResult.setLimit(limit);
        searchResult.setTotalPages(Math.round((float)searchResult.getTotalMusic()/(float)pageSize));
        searchResult.setMusicList(musicList);
        searchResult.setTotalMusic(midList.size());
        searchResult.setPageNum(pageNum+=limit);

        return searchResult;
    }

    @Override
    /**
     * 没有返回音乐风格，没有，没有
     */
    public MusicInfo getMusicById(int musicId) {
        if(musicId==0)
        {
            return null;
        }
        else
        {
            Music music = musicMapper.selectByPrimaryKey(musicId);
            MusicInfo musicInfo=new MusicInfo();
            musicInfo.setCheckTimeStamp(music.getCheckTimestamp());
            musicInfo.setMusicMaker(musicInfo.getMusicMaker());
            musicInfo.setMusicName(music.getMusicName());
            //查询版权方信息
            musicInfo.setUser(userMapper.selectByPrimaryKey(music.getUserId()));
            return musicInfo;
        }

    }

    @Override
    public SearchPubResult getMusicPublications(int userId, int pageNum, int limit) {
        //需不需要判断id是否为管理员的？
        SearchPubResult searchPubResult=new SearchPubResult();
        searchPubResult.setLimit(limit);
        searchPubResult.setTotalMusicPub(musicPublicationMapper.getCount());
        searchPubResult.setPageNum(pageNum+=limit);
        searchPubResult.setTotalPages(Math.round(searchPubResult.getTotalMusicPub()/(float)pageSize));
        searchPubResult.setMusicPubList(musicPublicationMapper.selectMusicPublications(pageNum,pageSize));
        return searchPubResult;
    }


    @Override
    public GetMusicPubById getMusicPubById(int musicId) {
        //判空？不会为0
        if(musicId==0)
        {
            return null;
        }
        else {
            return musicPublicationMapper.selectMusicPubInfoById(musicId);
        }
    }
}
