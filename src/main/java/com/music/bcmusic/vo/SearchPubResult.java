package com.music.bcmusic.vo;

import com.music.bcmusic.domain.MusicPublication;

import java.util.ArrayList;

/**
 * MusicPubList		ArrayList<MusicPublication>	发布信息列表
 * Page_num		int							当前页码
 * Total_pages		int							分页总数
 * Total_MusicPub	int							发布信息总数
 * Limit			int							页面偏移量
 * @author yg
 */
public class SearchPubResult {
    private ArrayList<MusicPublication> musicPubList;
    private int pageNum;
    private int totalPages;
    private int totalMusicPub;
    private int limit;

    public ArrayList<MusicPublication> getMusicPubList() {
        return musicPubList;
    }

    public void setMusicPubList(ArrayList<MusicPublication> musicPubList) {
        this.musicPubList = musicPubList;
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

    public int getTotalMusicPub() {
        return totalMusicPub;
    }

    public void setTotalMusicPub(int totalMusicPub) {
        this.totalMusicPub = totalMusicPub;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SearchPubResult{" +
                "musicPubList=" + musicPubList +
                ", pageNum=" + pageNum +
                ", totalPages=" + totalPages +
                ", totalMusicPub=" + totalMusicPub +
                ", limit=" + limit +
                '}';
    }
}
