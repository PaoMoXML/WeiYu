package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.TodaySchedule;

import java.util.List;

public interface TodayScheduleService {
    List<TodaySchedule> selectByCidAndDate(TodaySchedule record);
}
