package com.music.bcmusic.vo;

import com.music.bcmusic.domain.Music;

import java.util.ArrayList;

/**
 * @author yg
 * 用于传输音乐查询模块的返回数据
 */
public class SearchResult {
    /**
     * 音乐列表
     */
    private ArrayList<Music> musicList;
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 分页总数
     */
    private int totalPages;
    /**
     * 音乐总数
     */
    private int totalMusic;
    /**
     * 页面偏移量
     */
    private int limit;

    public ArrayList<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalMusic() {
        return totalMusic;
    }

    public void setTotalMusic(int totalMusic) {
        this.totalMusic = totalMusic;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "musicList=" + musicList +
                ", pageNum=" + pageNum +
                ", totalPages=" + totalPages +
                ", totalMusic=" + totalMusic +
                ", limit=" + limit +
                '}';
    }
}
