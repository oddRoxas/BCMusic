package com.music.bcmusic.dao;

import com.music.bcmusic.domain.UserLoginLog;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserLoginLogMapper extends Mapper<UserLoginLog> {
}
