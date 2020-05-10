package com.music.bcmusic.Service;

import java.util.ArrayList;

public interface MusicSearch {//音乐搜索
    public void getMusic(int Page_num, int Limit);

    public void getMusicByKeyword(String Keyword, int Page_num, int Limit);

    public void getMusicByOwner(int User_id, int Page_num, int Limit);

    public void getMusicByBuyer(int User_id, int Page_num, int Limit);

    public void getMusicByDistributor(int User_id, int Page_num, int Limit);

    public void getMusicById(int Music_id);

    public void getMusicPublications(int User_id, int Page_num, int Limit);

    public void getMusicPubById(int Music_id);


}
