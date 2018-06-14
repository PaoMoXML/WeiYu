package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.studentclassFinal;

import java.util.List;

public interface studentclassFinalMapper {
    int insert(studentclassFinal record);

    int insertSelective(studentclassFinal record);

    List<studentclassFinal> selectByid(String selectclassstudentid);
}