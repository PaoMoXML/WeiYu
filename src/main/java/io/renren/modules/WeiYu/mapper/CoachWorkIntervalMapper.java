package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.CoachWorkInterval;

public interface CoachWorkIntervalMapper {
    int deleteByPrimaryKey(String coachid);

    int insert(CoachWorkInterval record);

    int insertSelective(CoachWorkInterval record);

    CoachWorkInterval selectByPrimaryKey(String coachid);

    int updateByPrimaryKeySelective(CoachWorkInterval record);

    int updateByPrimaryKey(CoachWorkInterval record);
}