package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.BadmintonCourtsService;
import io.renren.modules.WeiYu.mapper.BadmintonCourtsMapper;
import io.renren.modules.WeiYu.model.BadmintonCourts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BadmintonCourtsService")
public class BadmintonCourtsServiceImpl implements BadmintonCourtsService {
    @Autowired
    private BadmintonCourtsMapper badmintonCourtsMapper;
    @Override
    public int insert(BadmintonCourts record){
        return badmintonCourtsMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(String badmintoncourtid){
         return badmintonCourtsMapper.deleteByPrimaryKey(badmintoncourtid);
    }
    @Override
    public int updateByPrimaryKey(BadmintonCourts record){
         return badmintonCourtsMapper.updateByPrimaryKey(record);
    }
    @Override
    public BadmintonCourts selectByPrimaryKey(String badmintoncourtid){
         return badmintonCourtsMapper.selectByPrimaryKey(badmintoncourtid);
    }
    @Override
    public List<BadmintonCourts> selectallCourt(){
        return badmintonCourtsMapper.selectallCourt();
    }
}

