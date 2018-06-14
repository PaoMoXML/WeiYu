package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.StudentsService;
import io.renren.modules.WeiYu.mapper.StudentsMapper;
import io.renren.modules.WeiYu.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentsService")
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;
    @Override
    public int insert(Students record){
        return studentsMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String studentid){
        return studentsMapper.deleteByPrimaryKey(studentid);
    }
    @Override
    public int updateByPrimaryKeySelective(Students record){
        return studentsMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public Students selectByPrimaryKey(String studentid){
        return studentsMapper.selectByPrimaryKey(studentid);
    }
    @Override
    public int insertid  (String studentid){
        return studentsMapper.insertid(studentid);
    }

}


