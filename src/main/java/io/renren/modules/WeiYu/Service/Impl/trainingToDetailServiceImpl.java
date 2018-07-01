package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.trainingToDetailService;
import io.renren.modules.WeiYu.mapper.trainingToDetailMapper;
import io.renren.modules.WeiYu.model.trainingToDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("trainingToDetailService")
public class trainingToDetailServiceImpl implements trainingToDetailService {
    @Autowired
    private trainingToDetailMapper trainingToDetailMapper;
    @Override
    public List<trainingToDetail> selectByid(String trainingid){
        return trainingToDetailMapper.selectByid(trainingid);
    }
}
