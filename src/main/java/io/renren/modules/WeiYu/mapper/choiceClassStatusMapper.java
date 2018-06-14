package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.choiceClassStatus;

import java.util.List;

public interface choiceClassStatusMapper {
    int insert(choiceClassStatus record);

    int insertSelective(choiceClassStatus record);

    List<choiceClassStatus> select(String selectclassstudentid);
}