package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.JTClass;

import java.util.List;

public interface JTClassMapper {
    int insert(JTClass record);

    int insertSelective(JTClass record);

    List<JTClass> selectByOther(JTClass record);

}