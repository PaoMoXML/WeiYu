package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.BadmintonCourts;

import java.util.List;

public interface BadmintonCourtsMapper {
    int deleteByPrimaryKey(String badmintoncourtid);

    int insert(BadmintonCourts record);

    int insertSelective(BadmintonCourts record);

    BadmintonCourts selectByPrimaryKey(String badmintoncourtid);

    int updateByPrimaryKeySelective(BadmintonCourts record);

    int updateByPrimaryKey(BadmintonCourts record);

    List<BadmintonCourts> selectallCourt();
}