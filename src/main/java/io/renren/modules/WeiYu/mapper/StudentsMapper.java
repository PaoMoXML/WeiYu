package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Students;

import java.util.List;


public interface StudentsMapper {
    int deleteByPrimaryKey(String studentid);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(String studentid);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);

    int insertid (String studentid);

    List<Students> updateByPrimaryKey1 (Students record);
}