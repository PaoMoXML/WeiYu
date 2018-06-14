package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.allkeshi;

import java.util.List;

public interface allkeshiMapper {

    int insert(allkeshi record);

    int insertSelective(allkeshi record);

    List<allkeshi> selectByid(String studentaccountid);

}