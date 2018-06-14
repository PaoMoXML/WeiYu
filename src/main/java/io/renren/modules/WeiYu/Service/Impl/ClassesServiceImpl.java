package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.ClassesService;
import io.renren.modules.WeiYu.mapper.ClassesMapper;
import io.renren.modules.WeiYu.model.Classes;
import io.renren.modules.WeiYu.model.Classname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClassesService")
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public int insert(Classes record){
        return classesMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String classid){
        return classesMapper.deleteByPrimaryKey(classid);
    }
    @Override
    public int updateByPrimaryKey(Classes record){
        return classesMapper.updateByPrimaryKey(record);
    }
    @Override
    public Classes selectByPrimaryKey(String classid){
        return classesMapper.selectByPrimaryKey(classid);
    }
    @Override
    public Classname selectname(String classid){return classesMapper.selectname(classid);}
}


