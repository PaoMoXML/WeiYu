package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.StudentIntegralAccountService;
import io.renren.modules.WeiYu.mapper.StudentIntegralAccountMapper;
import io.renren.modules.WeiYu.model.StudentIntegralAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentIntegralAccountService")
public class StudentIntegralAccountServiceImpl implements StudentIntegralAccountService {
    @Autowired
    private StudentIntegralAccountMapper studentIntegralAccountMapper;
    @Override
    public int insert(StudentIntegralAccount record){
        return studentIntegralAccountMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String studentintegralaccountid){
        return studentIntegralAccountMapper.deleteByPrimaryKey(studentintegralaccountid);
    }
    @Override
    public int updateByPrimaryKey(StudentIntegralAccount record){
        return studentIntegralAccountMapper.updateByPrimaryKey(record);
    }
    @Override
    public StudentIntegralAccount selectByPrimaryKey(String studentintegralaccountid){
        return studentIntegralAccountMapper.selectByPrimaryKey(studentintegralaccountid);
    }

}


