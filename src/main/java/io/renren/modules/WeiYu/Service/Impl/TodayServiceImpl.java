package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.TodayService;
import io.renren.modules.WeiYu.mapper.TodayMapper;
import io.renren.modules.WeiYu.model.Today;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TodayService")
public class TodayServiceImpl implements TodayService {
    @Autowired
    private TodayMapper todayMapper;
    @Override
    public List<Today> selectall(Today record){
        return todayMapper.selectall(record);
    }

}
