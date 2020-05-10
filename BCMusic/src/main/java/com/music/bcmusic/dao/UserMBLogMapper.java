package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMBLogMapper extends Mapper<ConstractDetail> {
}
