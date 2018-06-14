package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.QDclass;

import java.util.List;

public interface QDclassMapper {
    int insert(QDclass record);

    int insertSelective(QDclass record);

    List<QDclass> select(String signinforclasstrainingid);
}