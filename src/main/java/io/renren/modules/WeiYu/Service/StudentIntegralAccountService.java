package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.StudentIntegralAccount;

public interface StudentIntegralAccountService {
    int insert(StudentIntegralAccount record);
    int deleteByPrimaryKey(String studentintegralaccountid);
    int updateByPrimaryKey(StudentIntegralAccount record);
    StudentIntegralAccount selectByPrimaryKey(String studentintegralaccountid);
}
