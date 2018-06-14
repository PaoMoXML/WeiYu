package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.QDdetail;

import java.util.List;

public interface QDdetailMapper {
    int insert(QDdetail record);

    int insertSelective(QDdetail record);

    List<QDdetail> select(String signinforclassid);
}