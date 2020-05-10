package com.music.bcmusic.dao;

import com.music.bcmusic.domain.ConstractDetail;
import com.music.bcmusic.domain.Music;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface MusicMapper extends Mapper<Music> {
}
