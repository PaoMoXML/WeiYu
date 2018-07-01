package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.TodaySchedule;

import java.util.List;

public interface TodayScheduleMapper {
    int insert(TodaySchedule record);

    int insertSelective(TodaySchedule record);

    List<TodaySchedule> selectByCidAndDate(TodaySchedule record);
}