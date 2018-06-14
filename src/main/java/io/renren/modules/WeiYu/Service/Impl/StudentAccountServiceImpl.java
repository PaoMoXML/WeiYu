package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.StudentAccountService;
import io.renren.modules.WeiYu.mapper.StudentAccountMapper;
import io.renren.modules.WeiYu.model.StudentAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentAccountService")
public class StudentAccountServiceImpl implements StudentAccountService {
    @Autowired
    private StudentAccountMapper studentAccountMapper;
    @Override
    public int insert(StudentAccount record){
        return studentAccountMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String studentintegralaccountid){
        return studentAccountMapper.deleteByPrimaryKey(studentintegralaccountid);
    }
    @Override
    public  int updateByPrimaryKey(StudentAccount record){
        return studentAccountMapper.updateByPrimaryKey(record);
    }
    @Override
    public StudentAccount selectByPrimaryKey(String studentintegralaccountid){
        return studentAccountMapper.selectByPrimaryKey(studentintegralaccountid);
    }
    @Override
    public  List<StudentAccount> selectall(String studentaccountid){
        return studentAccountMapper.selectall(studentaccountid);
    }
}



