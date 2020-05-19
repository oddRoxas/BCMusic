package com.music.bcmusic.dao;

import com.music.bcmusic.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @version v1.1
 * @author Yang Wenjie
 * @since 2020-05-02
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 添加用户
     *
     * @param User_id 用户id
     * @param User_name 用户名
     * @param User_phone 用户电话
     * @param Passwd 登录密码
     * @return 影响行数
     */
    @Insert("INSERT INTO user VALUES (User_id, User_name, User_phone, Passwd) = " +
            "(#{User_id}, #{User_name}, #{User_phone}, #{Passwd})")
    @Options(useGeneratedKeys = true, keyColumn = "User_id")
    int insert(@Param("User_id") Integer User_id,
               @Param("User_name") String User_name,
               @Param("User_phone") String User_phone,
               @Param("Passwd") String Passwd);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Select("SELECT * FROM user")
    List<User> select();

    /**
     * 根据用户类型查询所有数据
     *
     * @param User_type 指定类型
     * @return 对象列表
     */
    @Select("SELECT * FROM user WHERE User_type = #{User_type}")
    List<User> selectAllByType(@Param("User_type") Integer User_type);

    /**
     * 根据用户类型和id查询所有数据
     *
     * @param User_id 用户id
     * @param User_type 指定类型
     * @return 对象列表
     */
    @Select("SELECT * FROM user WHERE (User_id, User_type) = (#{User_id}, #{User_type})")
    List<User> selectAllByIdAndType(@Param("User_id") Integer User_id,
                                    @Param("User_type") Integer User_type);

    /**
     * 重置用户密码
     *
     * @param User_id 用户
     * @param Passwd 重置后的密码
     * @return 影响行数
     */
    @Update("UPDATE user SET Passwd = #{Passwd} WHERE User_id = #{User_id}")
    int updatePassword(@Param("User_id") Integer User_id,
                       @Param("Passwd") String Passwd);
}