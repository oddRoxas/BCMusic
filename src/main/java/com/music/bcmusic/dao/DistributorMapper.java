package com.music.bcmusic.dao;

import com.music.bcmusic.domain.Distributor;
import net.bytebuddy.implementation.attribute.AnnotationAppender;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DistributorMapper extends Mapper<Distributor> {
}
