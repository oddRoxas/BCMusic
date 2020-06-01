package com.music.bcmusic.dao;

import com.music.bcmusic.domain.Musician;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Musician)表数据库访问层
 *
 * @version v1.1
 * @author Yang Wenjie
 * @since 2020-04-25 21:16:02
 */
@Mapper
@Repository
public interface MusicianMapper {

    /**
     * 添加用户
     *
     * @param User_id 用户id
     * @param Id_number 身份证号
     * @param Card_id 银行卡号
     * @param User_location 用户地址
     * @param User_mail 用户邮箱
     * @return 影响行数
     */
    @Insert("INSERT INTO musician " +
            "(User_id, Id_number, Card_id, User_location, User_mail, Valid_status) " +
            "VALUES " +
            "(#{User_id}, #{Id_number}, #{Card_id}, #{User_location}, #{User_mail}, #{Valid_status})")
    @Options(useGeneratedKeys = true, keyColumn = "User_id")
    int insert(@Param("User_id") Integer User_id,
               @Param("Id_number") String Id_number,
               @Param("Card_id") String Card_id,
               @Param("User_location") String User_location,
               @Param("User_mail") String User_mail,
               @Param("Valid_status") Integer Valid_status);

    /**
     * 通过ID查询
     *
     * @param Application_id 主键
     * @return 实例对象
     */
    @Select("SELECT * FROM musician WHERE Application_id = #{Application_id}")
    List<Musician> select(@Param("Application_id") Integer Application_id);

    /**
     * 通过用户id查询所有申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM musician WHERE User_id = #{User_id}")
    List<Musician> selectByUserId(@Param("User_id") Integer User_id);

    /**
     * 通过用户id查询所有Valid_status为1或2的申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM musician WHERE User_id = #{User_id} AND (Valid_status = 1 OR Valid_status = 2)")
    List<Musician> selectValidByUserId(@Param("User_id") Integer User_id);

    /**
     * 修改认证状态
     *
     * @param Application_id 申请id
     * @param Valid_status 认证状态
     * @return 影响行数
     */
    @Update("UPDATE musician SET Valid_status = #{Valid_status} " +
            "WHERE Application_id = #{Application_id}")
    int updateValidStatus(@Param("Application_id") Integer Application_id,
                          @Param("Valid_status") Integer Valid_status);
}