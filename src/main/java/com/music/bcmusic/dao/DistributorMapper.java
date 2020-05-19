package com.music.bcmusic.dao;

import com.music.bcmusic.domain.Distributor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Distributor)表数据库访问层
 *
 * @version v1.0
 * @author Yang Wenjie
 * @since 2020-05-03
 */
@Mapper
@Repository
public interface DistributorMapper {
    /**
     * 新增数据
     *
     * @param User_id 用户id
     * @param Distr_name 企业名称
     * @param Distr_uscc 统一社会信用代码
     * @param Card_id 分发商银行卡号
     * @param Distr_manager 分发商负责人
     * @param Distr_phone 分发商负责人电话
     * @param Distr_location 分发商地址
     * @param Distr_mail 分发商邮箱
     * @param Node_number 分发商部署节点数量
     * @return 影响行数
     */
    @Insert("INSERT INTO dictributor VALUES " +
            "(User_id, Distr_name, Distr_uscc, Card_id, Distr_manager," +
            " Distr_phone, Distr_location, Distr_mail, Node_number) " +
            "= " +
            "(#{User_id}, #{Distr_name}, #{Distr_uscc}, #{Card_id}, #{Distr_manager}," +
            " #{Distr_phone}, #{Distr_location}, #{Distr_mail}, #{Node_number}) ")
    @Options(useGeneratedKeys = true, keyColumn = "Application_id")
    int insert(@Param("User_id") Integer User_id,
               @Param("Distr_name") String Distr_name,
               @Param("Distr_uscc") String Distr_uscc,
               @Param("Card_id") String Card_id,
               @Param("Distr_manager") String Distr_manager,
               @Param("Distr_phone") String Distr_phone,
               @Param("Distr_location") String Distr_location,
               @Param("Distr_mail") String Distr_mail,
               @Param("Node_number") Integer Node_number);

    /**
     * 通过ID查询单条数据
     *
     * @param Application_id 主键
     * @return 实例对象
     */
    @Select("SELECT * FROM dictributor WHERE Application_id = #{Application_id}")
    Distributor select(@Param("Application_id") Integer Application_id);

    /**
     * 通过用户id查询所有申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM dictributor WHERE User_id = #{User_id}")
    List<Distributor> selectByUserId(@Param("User_id") Integer User_id);

    /**
     * 通过用户id查询所有Valid_status为1或2的申请
     *
     * @param User_id 用户id
     * @return 列表
     */
    @Select("SELECT * FROM dictributor WHERE User_id = #{User_id} AND (Valid_status = 1 OR Valid_status = 2)")
    List<Distributor> selectValidByUserId(@Param("User_id") Integer User_id);

    /**
     * 修改认证状态
     *
     * @param Application_id 申请id
     * @param Valid_status 认证状态
     * @return 影响行数
     */
    @Update("UPDATE dictributor SET Valid_status = #{Valid_status} " +
            "WHERE Application_id = #{Application_id}")
    int updateValidStatus(@Param("Application_id") Integer Application_id,
                          @Param("Valid_status") Integer Valid_status);
}