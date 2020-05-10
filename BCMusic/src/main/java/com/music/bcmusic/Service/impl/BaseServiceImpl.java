package com.music.bcmusic.Service.impl;

import com.music.bcmusic.Service.BaseService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 基础服务的实现。仅仅用于访问没有关联其他实体的一种实体。
 * @author wjx
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    private Mapper<T> mapper;

    protected void setMapper(Mapper<T> mapper) {
        this.mapper = mapper;
    }

    @Override
    public T selectByPrimaryId(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryId(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
}
