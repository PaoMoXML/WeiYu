package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.CoachWorkInterval;

public interface CoachWorkIntervalMapper {
    int deleteByPrimaryKey(String coachmainid);

    int insert(CoachWorkInterval record);

    int insertSelective(CoachWorkInterval record);

    CoachWorkInterval selectByPrimaryKey(String coachmainid);

    int updateByPrimaryKeySelective(CoachWorkInterval record);

    int updateByPrimaryKey(CoachWorkInterval record);
}