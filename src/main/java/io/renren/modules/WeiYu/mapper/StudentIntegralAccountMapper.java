package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.StudentIntegralAccount;

public interface StudentIntegralAccountMapper {
    int deleteByPrimaryKey(String studentintegralaccountmainid);

    int insert(StudentIntegralAccount record);

    int insertSelective(StudentIntegralAccount record);

    StudentIntegralAccount selectByPrimaryKey(String studentintegralaccountmainid);

    int updateByPrimaryKeySelective(StudentIntegralAccount record);

    int updateByPrimaryKey(StudentIntegralAccount record);
}