package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.StudentClassFinalService;
import io.renren.modules.WeiYu.mapper.studentclassFinalMapper;
import io.renren.modules.WeiYu.model.studentclassFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentClassFinalService")
public class StudentClassFinalServiceImpl implements StudentClassFinalService {
    @Autowired
    private studentclassFinalMapper studentclassFinalMapper;
    @Override
    public List<studentclassFinal> selectByid(String selectclassstudentid){
        return studentclassFinalMapper.selectByid(selectclassstudentid);
    }


}
