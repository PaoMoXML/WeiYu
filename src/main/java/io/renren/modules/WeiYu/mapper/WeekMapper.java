package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Week;

public interface WeekMapper {
    int deleteByPrimaryKey(String weekid);

    int insert(Week record);

    int insertSelective(Week record);

    Week selectByPrimaryKey(String weekid);

    int updateByPrimaryKeySelective(Week record);

    int updateByPrimaryKey(Week record);
}