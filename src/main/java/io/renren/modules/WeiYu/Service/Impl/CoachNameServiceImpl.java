package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.CoachNameService;
import io.renren.modules.WeiYu.mapper.CoachNameMapper;
import io.renren.modules.WeiYu.model.CoachName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CoachNameService")
public class CoachNameServiceImpl implements CoachNameService {
    @Autowired
    private CoachNameMapper coachNameMapper;
    @Override
    public List<CoachName> selectByall(String coachid){
        return coachNameMapper.selectByall(coachid);
    }
}
