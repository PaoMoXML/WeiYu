package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.SelectClassService;
import io.renren.modules.WeiYu.mapper.SelectClassMapper;
import io.renren.modules.WeiYu.model.SelectClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelectClassService")
public class SelectClassServiceImpl implements SelectClassService {
    @Autowired
    private SelectClassMapper selectClassMapper;
    @Override
    public int insertSelective(SelectClass record){
        return selectClassMapper.insertSelective(record);
    }
    @Override
    public int deleteByPrimaryKey(String selectclassid){
        return selectClassMapper.deleteByPrimaryKey(selectclassid);
    }
    @Override
    public int updateByPrimaryKey(SelectClass record){
        return selectClassMapper.updateByPrimaryKey(record);
    }
    @Override
    public SelectClass selectByPrimaryKey(String selectclassid){
        return selectClassMapper.selectByPrimaryKey(selectclassid);
    }
    @Override
    public  List<SelectClass>selectByOther(SelectClass record){
        return selectClassMapper.selectByOther(record);
    }
    @Override
    public int updateByid(SelectClass record){return selectClassMapper.updateByid(record);}
}


