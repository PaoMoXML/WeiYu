package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Training;

import java.util.List;

public interface TrainingService {
    int insert(Training record);
    int updateByPrimaryKeySelective(Training record);
    List<Training> selectByid(String CoachId);
    List<Training> selectByiddate(Training record);
    List<Training> selectByidleave(Training record);


}
