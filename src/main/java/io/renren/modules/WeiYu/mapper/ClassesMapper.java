package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Classes;
import io.renren.modules.WeiYu.model.Classname;

public interface ClassesMapper {
    int deleteByPrimaryKey(String classid);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(String classid);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);

    Classname selectname(String classid);

}