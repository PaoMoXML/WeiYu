package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.StudentAccount;

import java.util.List;

public interface StudentAccountMapper {
    int deleteByPrimaryKey(String studentaccountmainid);

    int insert(StudentAccount record);

    int insertSelective(StudentAccount record);

    StudentAccount selectByPrimaryKey(String studentaccountmainid);

    int updateByPrimaryKeySelective(StudentAccount record);

    int updateByPrimaryKey(StudentAccount record);

    List<StudentAccount> selectall(String studentaccountid);
}