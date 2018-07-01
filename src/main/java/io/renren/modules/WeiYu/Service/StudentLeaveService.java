package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.StudentLeave;

import java.util.List;

public interface StudentLeaveService {
    int insert(StudentLeave record);
    List<StudentLeave> select(String studentleavestudentid);
}
