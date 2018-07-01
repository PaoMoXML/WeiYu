package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.StudentLeaveService;
import io.renren.modules.WeiYu.mapper.StudentLeaveMapper;
import io.renren.modules.WeiYu.model.StudentLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("StudentLeaveService")
public class StudentLeaveServiceImpl implements StudentLeaveService {
    @Autowired
    private StudentLeaveMapper studentLeaveMapper;
    @Override
    public int insert(StudentLeave record){
        return studentLeaveMapper.insert(record);
    }
    @Override
    public List<StudentLeave> select(String studentleavestudentid){
        return studentLeaveMapper.select(studentleavestudentid);
    }
}
