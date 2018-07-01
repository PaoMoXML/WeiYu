package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.trainingToDetail;

import java.util.List;


public interface trainingToDetailMapper {
    int insert(trainingToDetail record);

    int insertSelective(trainingToDetail record);

    List<trainingToDetail>selectByid(String trainingid);
}