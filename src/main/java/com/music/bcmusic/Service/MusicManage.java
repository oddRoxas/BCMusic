package com.music.bcmusic.Service;

import javax.swing.*;
import java.io.File;
import java.util.Date;

/**
 * 音乐管理
 * @author yg
 */
public interface MusicManage {

    /**
     *服务器接收到音乐之后，利用相应的框架/库提取出音乐的特征。将音乐文件储存到对象存储中，
     * 将音乐文件的对象储存的url和音乐特征暂存到数据库中，系统作为版权方代理 向MORP数字音乐
     * 版权注册音乐平台注册该音乐，最后返回音乐上传结果。
     * @param musicFile
     * @param userId
     * @param musicName
     * @param musicMaker
     * @return
     */
    public int uploadMusic(File musicFile, Integer userId, String musicName,String musicMaker);

//    checkMusic接口详见文档

    /**
     * 系统接收到MORP数字音乐版权注册音乐平台返回的审核结果对音乐进行盗版检测后，更新音乐
     * 状态，更新版权方的个人资产（增加MC和引力值）和总资产，并使用站内信件或邮件的方式进行通知。
     * @param musicId
     * @return
     */
    public Boolean checkMusic(int musicId);

    /**
     * 系统作为版权方代理 向MORP数字音乐
     * 版权注册音乐平台申请撤销该音乐，然后返回提交撤销申请结果。
     * @param userId
     * @param musicId
     * @return 处理结果
     */
    public int revokeMusic(int userId, int musicId);

    //checkRevocation接口详见文档

    /**
     *系统作为版权方代理 向MORP数字音乐版
     * 权注册音乐平台申请修改该音乐信息，然后返回提交修改申请结果。
     * @param musicId
     * @param musicMaker
     * @return 提交修改申请结果
     */
    public int modifyMusic (int musicId, String musicMaker);

    /**
     *
     * @param id
     * @param choice
     * @return
     */
    public Boolean checkModification(int id,int choice);//详见文档

    /**
     *版权方提交音乐发布申请，
     * 处于待审核状态，valid_status为0。
     * @param musicId 作品id
     * @param allowType 允许授权类型
     * @param allowRegion 允许授权区域
     * @param allowStartTime 允许授权的开始时间
     * @param allowEndTime 允许授权的结束时间
     * @param pricePerDay 授权单价（元/天）
     * @return 提交发布申请结果
     */
    public int publishMusic(int musicId, int allowType, int allowRegion, Date allowStartTime, Date allowEndTime, Double pricePerDay);

    /**
     * 1.2.8	编辑音乐发布信息
     * （已通过审核且未过期则不可编辑，编辑后需重新等待审核）
     * @param pubId
     * @param allowType
     * @param allowRegion
     * @param allowStartTime
     * @param allowEndTime
     * @param pricePerDay
     * @return 提交修改申请结果
     */
    public int modifyPublication(int pubId, int allowType, int allowRegion, Date allowStartTime, Date allowEndTime, Double pricePerDay);

    /**
     *版权方或管理员有权限撤销音乐
     * 的发布信息，将valid_status置为-3。
     * @param pubId 发布信息id
     * @param userId 版权方id
     * @return 撤销结果
     */
    public int cancelPublication(int pubId, int userId);

    /**
     *管理员通过或驳回版权方的音乐发布申请，如
     * 果通过则valid_status设置为1，如果驳回则设置为-1。
     * @param pubId
     * @param userId 审核者id
     * @return
     */
    public int checkPublication(int pubId,int userId);

    /**
     *系统根据作品id查询作品地址获取源文件，经过（？）处理之后返回试听
     * 片段。（上网找一下有没有例子？）
     * @param musicId
     * @return
     */
    public File auditionMusic(int musicId);


    /**
     *用户下载被授权的音乐。（
     * 需要有唯一下载权限，查一查怎么样才能实现只有该用户可下载？）
     * @param musicId
     * @param userId
     * @return 音乐二进制文件
     */
    public File downloadMusic(int musicId, int userId);

}
