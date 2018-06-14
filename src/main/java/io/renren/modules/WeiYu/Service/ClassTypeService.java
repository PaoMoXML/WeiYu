package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.ClassType;

public interface ClassTypeService {
    int insert(ClassType record);
    int deleteByPrimaryKey(String classtypeid);
    int updateByPrimaryKey(ClassType record);
    ClassType selectByPrimaryKey(String classtypeid);
}
