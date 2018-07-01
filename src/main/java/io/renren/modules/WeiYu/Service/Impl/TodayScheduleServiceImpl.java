package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.TodayScheduleService;
import io.renren.modules.WeiYu.mapper.TodayScheduleMapper;
import io.renren.modules.WeiYu.model.TodaySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("TodayScheduleService")
public class TodayScheduleServiceImpl implements TodayScheduleService {
    @Autowired
    private TodayScheduleMapper todayScheduleMapper;
    public List<TodaySchedule> selectByCidAndDate(TodaySchedule record){
        return todayScheduleMapper.selectByCidAndDate(record);
    }
}
