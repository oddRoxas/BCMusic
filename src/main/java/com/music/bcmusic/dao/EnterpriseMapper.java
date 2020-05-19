package com.music.bcmusic.dao;

import com.music.bcmusic.domain.Enterprise;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Enterprise)表数据库访问层
 *
 * @version v1.0
 * @author Yang Wenjie
 * @since 2020-05-03
 */
@Mapper
@Repository
public interface EnterpriseMapper {

    /**
     * 新增数据
     *
     * @param User_id 用户id
     * @param Ent_name 企业名称
     * @param Ent_uscc 统一社会信用代码
     * @param Card_id 企业银行卡号
     * @param Ent_manager 企业负责人
     * @param Ent_phone 企业负责人电话
     * @param Ent_location 企业地址
     * @param Ent_mail 企业邮箱
     * @param Node_number 企业部署节点数量
     * @return 影响行数
     */
    @Insert("INSERT INTO enterprise VALUES " +
            "(User_id, Ent_name, Ent_uscc, Card_id, Ent_manager," +
            " Ent_phone, Ent_location, Ent_mail, Node_number) " +
            "= " +
            "(#{User_id}, #{Ent_name}, #{Ent_uscc}, #{Card_id}, #{Ent_manager}," +
            " #{Ent_phone}, #{Ent_location}, #{Ent_mail}, #{Node_number}) ")
    @Options(useGeneratedKeys = true, keyColumn = "Application_id")
    int insert(@Param("User_id") Integer User_id,
               @Param("Ent_name") String Ent_name,
               @Param("Ent_uscc") String Ent_uscc,
               @Param("Card_id") String Card_id,
               @Param("Ent_manager") String Ent_manager,
               @Param("Ent_phone") String Ent_phone,
               @Param("Ent_location") String Ent_location,
               @Param("Ent_mail") String Ent_mail,
               @Param("Node_number") Integer Node_number);

    /**
     * 通过ID查询单条数据
     *
     * @param Application_id 主键
     * @return 实例对象
     */
    @Select("SELECT * FROM enterprise WHERE Application_id = #{Application_id}")
    Enterprise select(@Param("Application_id") Integer Application_id);

    /**
     * 通过用户id查询所有申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM enterprise WHERE User_id = #{User_id}")
    List<Enterprise> selectByUserId(@Param("User_id") Integer User_id);

    /**
     * 通过用户id查询所有Valid_status为1或2的申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM enterprise WHERE User_id = #{User_id} AND (Valid_status = 1 OR Valid_status = 2)")
    List<Enterprise> selectValidByUserId(@Param("User_id") Integer User_id);

    /**
     * 修改认证状态
     *
     * @param Application_id 申请id
     * @param Valid_status 认证状态
     * @return 影响行数
     */
    @Update("UPDATE enterprise SET Valid_status = #{Valid_status} " +
            "WHERE Application_id = #{Application_id}")
    int updateValidStatus(@Param("Application_id") Integer Application_id,
                          @Param("Valid_status") Integer Valid_status);
}