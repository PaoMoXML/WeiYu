package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.StudentUpdateService;
import io.renren.modules.WeiYu.mapper.StudentUpdateMapper;
import io.renren.modules.WeiYu.model.StudentUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentUpdateService")
public class StudentUpdateServiceImpl implements StudentUpdateService {
    @Autowired
    private StudentUpdateMapper studentUpdateMapper;
    @Override
    public int updateBystudentid(StudentUpdate record){
        return studentUpdateMapper.updateBystudentid(record);
    }
}
