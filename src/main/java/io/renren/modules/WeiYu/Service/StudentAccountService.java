package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.StudentAccount;

import java.util.List;

public interface StudentAccountService {
    int insert(StudentAccount record);
    int deleteByPrimaryKey(String studentintegralaccountid);
    int updateByPrimaryKey(StudentAccount record);
    StudentAccount selectByPrimaryKey(String studentintegralaccountid);
    List<StudentAccount> selectall(String studentaccountid);
}
