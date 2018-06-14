package io.renren.modules.WeiYu.Service.Impl;



import io.renren.modules.WeiYu.Service.AdministratorService;
import io.renren.modules.WeiYu.mapper.AdministratorMapper;
import io.renren.modules.WeiYu.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdministratorService")
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;
    @Override
    public int insert(Administrator record){
        return administratorMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String administratorid){
        return administratorMapper.deleteByPrimaryKey(administratorid);
    }
    @Override
    public int updateByPrimaryKey(Administrator record){
        return administratorMapper.updateByPrimaryKey(record);
    }
    @Override
    public Administrator selectByPrimaryKey(String administratorid){
        return administratorMapper.selectByPrimaryKey(administratorid);
    }
}


