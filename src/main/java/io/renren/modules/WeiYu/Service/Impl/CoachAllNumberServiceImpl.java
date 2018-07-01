package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.CoachAllNumberService;
import io.renren.modules.WeiYu.mapper.CoachAllNumberMapper;
import io.renren.modules.WeiYu.model.CoachAllNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CoachAllNumberService")
public class CoachAllNumberServiceImpl implements CoachAllNumberService {
    @Autowired
    private CoachAllNumberMapper coachAllNumberMapper;
    @Override
    public  List<CoachAllNumber> selectallByCid(String signinforclasscoachid){
        return coachAllNumberMapper.selectallByCid(signinforclasscoachid);
    }
}
