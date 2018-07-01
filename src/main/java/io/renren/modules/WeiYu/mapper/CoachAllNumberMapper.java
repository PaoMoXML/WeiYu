package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.CoachAllNumber;

import java.util.List;

public interface CoachAllNumberMapper {
    int insert(CoachAllNumber record);

    int insertSelective(CoachAllNumber record);

    List<CoachAllNumber>selectallByCid(String signinforclasscoachid);
}