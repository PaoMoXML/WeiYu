package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Students;

import java.util.List;

public interface StudentsService {
    int insert(Students record);
    int deleteByPrimaryKey(String studentid);
    Students selectByPrimaryKey(String studentid);
    int insertid (String studentid);
    int updateByPrimaryKeySelective(Students record);
}
