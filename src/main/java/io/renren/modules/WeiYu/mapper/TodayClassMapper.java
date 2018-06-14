package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.TodayClass;

import java.util.List;

public interface TodayClassMapper {
    int insert(TodayClass record);

    int insertSelective(TodayClass record);

    List<TodayClass> select(TodayClass record);
}