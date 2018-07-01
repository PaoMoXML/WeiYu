package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.coachDayNumber;

import java.util.List;

public interface coachDayNumberMapper {
    int insert(coachDayNumber record);

    int insertSelective(coachDayNumber record);

    List<coachDayNumber>selectallByDateAndCid(coachDayNumber record);

}