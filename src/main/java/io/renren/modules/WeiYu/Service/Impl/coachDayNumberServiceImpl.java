package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.coachDayNumberService;
import io.renren.modules.WeiYu.mapper.coachDayNumberMapper;
import io.renren.modules.WeiYu.model.coachDayNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("coachDayNumberService")
public class coachDayNumberServiceImpl implements coachDayNumberService {
    @Autowired
    private coachDayNumberMapper coachDayNumberMapper;
    @Override
    public List<coachDayNumber> selectallByDateAndCid(coachDayNumber record){
        return coachDayNumberMapper.selectallByDateAndCid(record);
    }
}
