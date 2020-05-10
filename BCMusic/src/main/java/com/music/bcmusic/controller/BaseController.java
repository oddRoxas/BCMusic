package com.music.bcmusic.controller;


import com.music.bcmusic.Service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;

/*
* 创建一个controller基类，必要
*
* */
public abstract class BaseController<T> {

    private static Logger logger = LoggerFactory.getLogger("controller");
    private BaseService<T> service;
    private String entityTypeName;

    protected BaseController(BaseService<T> service) {
        this.service = service;

        String fullTypeName = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0].getTypeName();
        entityTypeName = fullTypeName.substring(fullTypeName.lastIndexOf(".") + 1);
    }



}