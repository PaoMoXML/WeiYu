package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.ClassType;

public interface ClassTypeMapper {
    int deleteByPrimaryKey(String classtypeid);

    int insert(ClassType record);

    int insertSelective(ClassType record);

    ClassType selectByPrimaryKey(String classtypeid);

    int updateByPrimaryKeySelective(ClassType record);

    int updateByPrimaryKey(ClassType record);
}