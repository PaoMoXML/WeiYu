package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.allpoint;

import java.util.List;

public interface allpointMapper {
    int insert(allpoint record);

    int insertSelective(allpoint record);

    List<allpoint> selectByid(String studentintegralaccountid);
}