package io.renren.modules.WeiYu.Service.Impl;



import io.renren.modules.WeiYu.Service.CoachsService;
import io.renren.modules.WeiYu.mapper.CoachsMapper;
import io.renren.modules.WeiYu.model.Coachs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("CoachsService")
public class CoachsServiceImpl implements CoachsService {
    @Autowired
    private CoachsMapper coachsMapper;
    @Override
    public int insert(Coachs record){
        return coachsMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String coachid){
        return coachsMapper.deleteByPrimaryKey(coachid);
    }
    @Override
    public int updateByPrimaryKeySelective(Coachs record){
        return coachsMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public  Coachs selectByPrimaryKey(String coachid){
        return coachsMapper.selectByPrimaryKey(coachid);
    }
    @Override
    public List<Coachs> selectAP(Coachs record){
        return coachsMapper.selectAP(record);
    }
    @Override
    public List<Coachs> selectA(String coachid){
        return coachsMapper.selectA(coachid);
    }

}


