package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.TeachingTimeService;
import io.renren.modules.WeiYu.mapper.TeachingTimeMapper;
import io.renren.modules.WeiYu.model.TeachingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeachingTimeService")
public class TeachingTimeServiceImpl implements TeachingTimeService {
    @Autowired
    private TeachingTimeMapper teachingTimeMapper;
    @Override
    public int insert(TeachingTime record){
        return teachingTimeMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String teachingtimeid){
        return teachingTimeMapper.deleteByPrimaryKey(teachingtimeid);
    }
    @Override
    public int updateByPrimaryKey(TeachingTime record){
        return teachingTimeMapper.updateByPrimaryKey(record);
    }
    @Override
    public TeachingTime selectByPrimaryKey(String teachingtimeid){
        return teachingTimeMapper.selectByPrimaryKey(teachingtimeid);
    }
    @Override
    public List<TeachingTime> selectalltime(){
        return teachingTimeMapper.selectalltime();
    }
    @Override
    public List<TeachingTime> selectBywd(TeachingTime record){
        return teachingTimeMapper.selectBywd(record);
    }

}
