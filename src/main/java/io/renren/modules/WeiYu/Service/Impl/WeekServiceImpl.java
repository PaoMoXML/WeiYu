package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.WeekService;
import io.renren.modules.WeiYu.mapper.WeekMapper;
import io.renren.modules.WeiYu.model.Week;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("WeekService")
public class WeekServiceImpl implements WeekService {
    @Autowired
    private WeekMapper weekMapper;
    @Override
    public int insert(Week record){
        return weekMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String weekid){
        return weekMapper.deleteByPrimaryKey(weekid);
    }
    @Override
    public int updateByPrimaryKey(Week record){
        return weekMapper.updateByPrimaryKey(record);
    }
    @Override
    public Week selectByPrimaryKey(String weekid){
        return weekMapper.selectByPrimaryKey(weekid);
    }

}
