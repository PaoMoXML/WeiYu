package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.coachLeaveService;
import io.renren.modules.WeiYu.mapper.coachLeaveMapper;
import io.renren.modules.WeiYu.model.coachLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("coachLeaveService")
public class CoachLeaveServcieImpl implements coachLeaveService {
    @Autowired
    private coachLeaveMapper coachLeaveMapper;
    @Override
    public List<coachLeave> selectByidleave(coachLeave record){
        return coachLeaveMapper.selectByidleave(record);
    }
    @Override
    public List<coachLeave> selectByid(String trainingid){
        return coachLeaveMapper.selectByid(trainingid);
    }
    @Override
    public List<coachLeave> selectByiddate(coachLeave record){
        return coachLeaveMapper.selectByiddate(record);
    }
}
