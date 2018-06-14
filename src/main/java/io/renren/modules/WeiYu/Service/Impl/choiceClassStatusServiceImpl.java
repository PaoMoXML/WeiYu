package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.choiceClassStatusService;
import io.renren.modules.WeiYu.mapper.choiceClassStatusMapper;
import io.renren.modules.WeiYu.model.choiceClassStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("choiceClassStatusService")
public class choiceClassStatusServiceImpl implements choiceClassStatusService {
    @Autowired
    private choiceClassStatusMapper choiceClassStatusMapper;
    @Override
    public  List<choiceClassStatus> select(String selectclassstudentid){
        return choiceClassStatusMapper.select(selectclassstudentid);
    }
}
