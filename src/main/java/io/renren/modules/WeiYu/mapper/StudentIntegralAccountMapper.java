package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.StudentIntegralAccount;

public interface StudentIntegralAccountMapper {
    int deleteByPrimaryKey(String studentintegralaccountid);

    int insert(StudentIntegralAccount record);

    int insertSelective(StudentIntegralAccount record);

    StudentIntegralAccount selectByPrimaryKey(String studentintegralaccountid);

    int updateByPrimaryKeySelective(StudentIntegralAccount record);

    int updateByPrimaryKey(StudentIntegralAccount record);
}