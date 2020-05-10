package com.music.bcmusic.Service;

import java.util.List;

public interface BaseService<T> {
    /**
     * 根据主键获取记录
     * @param key 主键
     * @return 记录
     */
    T selectByPrimaryId(Object key);

    /**
     * 获取所有记录
     * @return 所有记录
     */
    List<T> selectAll();

    /**
     * 保存一个记录，null的属性也会保存，不会使用数据库默认值。
     * 更改后，若Id为null，则将会被更新新的Id
     * @param record 新纪录
     * @return 更改的行数。通常是1
     */
    int insert(T record);

    /**
     * 保存一个记录，null的属性不会保存，会使用数据库默认值、
     * 更改后，若Id为null，则将会被更新新的Id
     * @param record 新纪录
     * @return 更改的行数。通常是1
     */
    int insertSelective(T record);

    /**
     * 根据主键更新记录的全部字段，null值会被更新
     * 注意，本方法不会更新record对象。若需要得到最新的数据，需要再次查询
     * @param record 需要更新的记录
     * @return 更改的行数。若为1，则成功。若为0，代表没有更改，可能由于主键指向的数据不存在。
     */
    int updateByPrimaryKey(T record);

    /**
     * 根据主键更新属性不为null的值
     * 注意，本方法不会更新record对象。若需要得到最新的数据，需要再次查询
     * @param record 需要更新的记录
     * @return 更改的行数。若为1，则成功。若为0，代表没有更改，可能由于主键指向的数据不存在。
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     * @param key 主键
     * @return 更改的行数。若为1，则成功。若为0，代表没有更改，可能由于主键指向的数据不存在。
     */
    int deleteByPrimaryId(Object key);
}
