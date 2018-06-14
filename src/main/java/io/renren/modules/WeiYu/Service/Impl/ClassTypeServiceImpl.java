package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.ClassTypeService;
import io.renren.modules.WeiYu.mapper.ClassTypeMapper;
import io.renren.modules.WeiYu.model.ClassType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClassTypeService")
public class ClassTypeServiceImpl implements ClassTypeService {
    @Autowired
    private ClassTypeMapper classTypeMapper;
    @Override
    public int insert(ClassType record){
        return classTypeMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String classtypeid){
        return classTypeMapper.deleteByPrimaryKey(classtypeid);
    }
    @Override
    public int updateByPrimaryKey(ClassType record){
        return classTypeMapper.updateByPrimaryKey(record);
    }
    @Override
    public  ClassType selectByPrimaryKey(String classtypeid){
        return classTypeMapper.selectByPrimaryKey(classtypeid);
    }
}


