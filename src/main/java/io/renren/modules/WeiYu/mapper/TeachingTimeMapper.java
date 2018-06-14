package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.TeachingTime;

import java.util.List;

public interface TeachingTimeMapper {
    int deleteByPrimaryKey(String teachingtimeid);

    int insert(TeachingTime record);

    int insertSelective(TeachingTime record);

    TeachingTime selectByPrimaryKey(String teachingtimeid);

    int updateByPrimaryKeySelective(TeachingTime record);

    int updateByPrimaryKey(TeachingTime record);

    List<TeachingTime> selectalltime();

    List<TeachingTime> selectBywd(TeachingTime record);
}