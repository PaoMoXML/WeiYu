package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.TodayClassService;
import io.renren.modules.WeiYu.mapper.TodayClassMapper;
import io.renren.modules.WeiYu.model.TodayClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TodayClassService")
public class TodayClassServiceImpl implements TodayClassService {
    @Autowired
    private TodayClassMapper todayClassMapper;
    @Override
    public List<TodayClass> select(TodayClass record){
        return todayClassMapper.select(record);
    }

}



