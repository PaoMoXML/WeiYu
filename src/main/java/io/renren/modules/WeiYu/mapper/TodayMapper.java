package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Today;

import java.util.List;

public interface TodayMapper {
    int insert(Today record);

    int insertSelective(Today record);

    List<Today> selectall(Today record);
}