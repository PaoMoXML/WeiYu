package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.CoachName;

import java.util.List;

public interface CoachNameMapper {
    int insert(CoachName record);

    int insertSelective(CoachName record);

    List<CoachName> selectByall(String coachid);
}