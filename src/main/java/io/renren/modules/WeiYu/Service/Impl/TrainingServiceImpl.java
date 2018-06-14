package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.TrainingService;
import io.renren.modules.WeiYu.mapper.TrainingMapper;
import io.renren.modules.WeiYu.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TrainingService")
public class TrainingServiceImpl implements TrainingService {
    @Autowired
    private TrainingMapper trainingMapper;
    @Override
    public int insert(Training record){
        return trainingMapper.insert(record);
    }
    @Override
    public int updateByPrimaryKeySelective(Training record){
        return trainingMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public List<Training> selectByid(String CoachId){
        return trainingMapper.selectByid(CoachId);
    }
    @Override
    public List<Training> selectByiddate(Training record){
        return trainingMapper.selectByiddate(record);
    }
    @Override
    public  List<Training> selectByidleave(Training record){
        return trainingMapper.selectByidleave(record);
    }
}
