package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.StudentLeave;

import java.util.List;

public interface StudentLeaveMapper {
    int deleteByPrimaryKey(String studentleaveid);

    int insert(StudentLeave record);

    int insertSelective(StudentLeave record);

    StudentLeave selectByPrimaryKey(String studentleaveid);

    int updateByPrimaryKeySelective(StudentLeave record);

    int updateByPrimaryKey(StudentLeave record);

    List<StudentLeave> select(String studentleavestudentid);
}