package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Training;

import java.util.List;

public interface TrainingMapper {
    int deleteByPrimaryKey(String trainingid);

    int insert(Training record);

    int insertSelective(Training record);

    Training selectByPrimaryKey(String trainingid);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);

    List<Training> selectByid(String CoachId);

    List<Training> selectByiddate(Training record);

    List<Training> selectByidleave(Training record);

    List<Training> selectQJ (Training record);

    List<Training>selectByidANDDate (Training record);

    List<Training>selectByidANDDateToday(Training record);

}