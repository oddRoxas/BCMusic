package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.MusicManage;
import com.music.bcmusic.dao.MusicMapper;
import com.music.bcmusic.dao.MusicPublicationMapper;
import com.music.bcmusic.domain.Music;
import com.music.bcmusic.domain.MusicPublication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Collection;
import java.util.Date;

/**
 * 音乐管理
 */


@Service
public class MusciManageImpl implements MusicManage {
    @Autowired
    private MusicMapper musicMapper;
    @Autowired
    private MusicPublicationMapper musicPublicationMapper;

    /**
     * 未完成，还没提取特征
     * @param musicFile
     * @param userId
     * @param musicName
     * @param musicMaker
     * @return
     */
    @Override
    public int uploadMusic(File musicFile, Integer userId, String musicName, String musicMaker) {

        String filename=musicFile.getName();
        //有文件名字冲突的风险？？？
        String url="C:\\Users\\yg\\Desktop\\KugouMusic\\"+filename;
        try {
            FileInputStream fis=new FileInputStream(musicFile);
            //指定位置
            FileOutputStream fos=new FileOutputStream(url);
            byte datas[] = new byte[1024*8];
            int len = 0;
            //循环读取数据
            while((len = fis.read(datas))!=-1)
            {
                fos.write(datas,0,len);
            }

            fis.close();
            fos.close();

            Music music=new Music();
            music.setMusicAddr(url);
            music.setMusicName(musicName);
            music.setUserId(userId);
            music.setMusicMaker(musicMaker);
            music.setUploadTimestamp(new Date());

            int i = musicMapper.insertSelective(music);

            return i;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 盗版音乐检查未能完成
     * 写了发邮件的api
     * @param musicId
     * @return
     */
    @Override
    public Boolean checkMusic(int musicId) {
        return null;
    }


    /**
     * 成功返回1，失败返回0
     * 未完成
     * @param userId
     * @param musicId
     * @return
     */
    @Override
    public int revokeMusic(int userId, int musicId) {
        Music music = musicMapper.selectMusicByMidAndUid(musicId, userId);
        if (music == null) {
            //返回0代表失败
            return 0;
        } else {
            musicMapper.revokeMusicByMId(musicId);
            //更新后进行查询
            Music updateMusic = musicMapper.selectByPrimaryKey(musicId);
            //之前问了说用2来表示撤销的
            if (updateMusic.getValidStatus() == 2) {
                return 1;
            } else {
                return 0;
            }
        }
    }


    /**
     * 返回1代表可修改，0代表不可修改
     *
     * @param musicId
     * @param musicMaker
     * @return
     */
    @Override
    public int modifyMusic(int musicId, String musicMaker) {
        Music music = musicMapper.selectMusicByMidAndMMaker(musicId, musicMaker);
        if (music == null) {
            //没有符合要求的音乐，直接失败？？？
            return 0;
        } else {
            //原本说要调用morp的api的，然后改了说不用，就只能模拟一下。。。
            if (((int) (1 + Math.random() * 2)) == 1) {
                //模拟调用接口成功
                return 1;
            } else {
                //调用接口失败
                return 0;
            }

        }
    }

    /**
     * 觉得接口设计有问题，后面商量之后会改
     * @return
     */
    @Override
    public Boolean checkModification(int id,int choice) {
        return null;
    }

    @Override
    public int publishMusic(int musicId, int allowType, int allowRegion, Date allowStartTime, Date allowEndTime, Double pricePerDay) {
        //int类型不知道怎么搞，只能默认传入了
        if(!(allowStartTime!=null&&allowEndTime!=null&&pricePerDay!=null))
        {
            return 0;
        }
        MusicPublication musicPublication=new MusicPublication();
        musicPublication.setMusicId(musicId);
        musicPublication.setAllowRegion(allowRegion);
        musicPublication.setAllowType(allowType);
        musicPublication.setAllowStartTime(allowStartTime);
        musicPublication.setAllowEndTime(allowEndTime);
        musicPublication.setPricePerDay(pricePerDay);
        musicPublication.setValidStatus(0);
        //插入成功则i为1，否则为0
        int i = musicPublicationMapper.insertSelective(musicPublication);
        return i;
    }

    @Override
    public int modifyPublication(int pubId, int allowType, int allowRegion, Date allowStartTime, Date allowEndTime, Double pricePerDay) {
        MusicPublication musicPublication = musicPublicationMapper.selectModifPublication(pubId);
        //无符合条件返回0
        if(musicPublication==null)
        {
            return 0;
        }
        else {
            musicPublication.setAllowRegion(allowRegion);
            musicPublication.setAllowType(allowType);
            musicPublication.setAllowStartTime(allowStartTime);
            musicPublication.setAllowEndTime(allowEndTime);
            musicPublication.setPricePerDay(pricePerDay);
            musicPublication.setValidStatus(0);
            //不需要判空，函数自动默认如果空则不更新
            int i = musicPublicationMapper.updateByPrimaryKeySelective(musicPublication);

            return i;
        }
    }

    @Override
    /**
     * ???为啥要传入userid
     *返回为1则成功
     */
    public int cancelPublication(int pubId, int userId) {
        MusicPublication musicPublication = musicPublicationMapper.selectByPrimaryKey(pubId);
        if(musicPublication==null)
        {
            return 0;
        }
        else
        {
            musicPublication.setValidStatus(-3);
            int i = musicPublicationMapper.updateByPrimaryKeySelective(musicPublication);
            return i;
        }
    }

    /**
     * 为啥没有传进来一个状态？后期商量改一下接口
     * @param pubId
     * @param userId 审核者id
     * @return
     */
    @Override
    public int checkPublication(int pubId, int userId) {
        return 0;
    }

    @Override
    public File auditionMusic(int musicId) {
        Music music = musicMapper.selectByPrimaryKey(musicId);
        if (music == null) {
            return null;
        } else {
            String url = music.getMusicAddr();
            File mp3 = new File(url);
            //目录待定,没抛异常
            File audition = new File("C:\\Users\\yg\\Desktop\\KugouMusic\\audition.mp3");

            //输入输出流，创建新文件
            BufferedInputStream bis1 = null;
            BufferedOutputStream bos = null;
            //初步设置为第10s到第30s
            int start1 = 128 * 10 * 1024 / 8;
            int end1 = 128 * 30 * 1024 / 8;
            int total = 0;

            try {
                bis1 = new BufferedInputStream(new FileInputStream(mp3));
                bos = new BufferedOutputStream(new FileOutputStream(audition, true));
                //第一首歌剪切写入
                byte[] b1 = new byte[512];
                int len1 = 0;

                while ((len1 = bis1.read(b1)) != -1) {
                    total += len1;
                    if (total < start1) {
                        //total小于起始值则跳出本次循环
                        continue;
                    }
                    bos.write(b1);
                    if (total >= end1) {
                        ////当tatol的值超过预先设定的范围，则立刻刷新bos流对象，并结束循环
                        bos.flush();
                        break;
                    }
                }
                return audition;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    //关闭流
                    if (bis1 != null) {
                        bis1.close();
                    }
                    if (bos != null) {
                        bos.close();
                    }
                    return audition;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 未完成
     * @param musicId
     * @param userId
     * @return
     */
    @Override
    public File downloadMusic(int musicId, int userId) {
        Music music = musicMapper.selectMusicByMidAndUid(musicId, userId);
        if(music==null)
        {
            return  null;
        }
        else {
            String url=music.getMusicAddr();
            //????
            File file=new File(url);
            if(file.exists())
            {
                return file;
            }
            else
            {
                return  null;
            }
        }

    }
}
