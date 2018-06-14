package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.SelectClass;

import java.util.List;

public interface SelectClassMapper {
    int deleteByPrimaryKey(String selectclassid);

    int insert(SelectClass record);

    int insertSelective(SelectClass record);

    SelectClass selectByPrimaryKey(String selectclassid);

    int updateByPrimaryKeySelective(SelectClass record);

    int updateByPrimaryKey(SelectClass record);

    List<SelectClass> selectByOther(SelectClass record);
}