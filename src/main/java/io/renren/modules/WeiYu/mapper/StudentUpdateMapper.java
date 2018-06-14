package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.StudentUpdate;

public interface StudentUpdateMapper {
    int insert(StudentUpdate record);

    int insertSelective(StudentUpdate record);

    int updateBystudentid(StudentUpdate record);
}