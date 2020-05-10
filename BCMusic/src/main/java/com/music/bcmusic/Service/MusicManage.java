package com.music.bcmusic.Service;

import javax.swing.*;
import java.io.File;

public interface MusicManage {//音乐管理

    public int uploadMusic(File Music_file, int User_id, String Music_name);

    //checkMusic接口详见文档

    public int revokeMusic(int User_id, int Music_id);

    //checkRevocation接口详见文档

    public int modifyMusic(int Music_id, String Music_maker);

    public Boolean checkModification();//详见文档

    public int publishMusic(
            int Music_id, int Allow_type,int Allow_region,long Allow_start_time,long Allow_end_time,int Price_per_day);


    public int cancelPublication(int pub_id, int User_id);


    public int auditionMusic(int Music_id);

    public File downloadMusic(int Music_id, int User_id);

}
