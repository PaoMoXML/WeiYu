package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.commentFinal;

import java.util.List;

public interface commentFinalMapper {
    int insert(commentFinal record);

    int insertSelective(commentFinal record);

    List<commentFinal> select(commentFinal record);
}