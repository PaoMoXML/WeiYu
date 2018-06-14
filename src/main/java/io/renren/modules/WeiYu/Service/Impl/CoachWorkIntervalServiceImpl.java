package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.CoachWorkIntervalService;
import io.renren.modules.WeiYu.mapper.CoachWorkIntervalMapper;
import io.renren.modules.WeiYu.model.CoachWorkInterval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoachWorkIntervalService")
public class CoachWorkIntervalServiceImpl implements CoachWorkIntervalService {
    @Autowired
    private CoachWorkIntervalMapper coachWorkIntervalMapper;
    @Override
    public int insert(CoachWorkInterval record){
        return coachWorkIntervalMapper.insert(record);
    }
}
