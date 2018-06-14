package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.totalkeshi;

import java.util.List;

public interface totalkeshiMapper {
    int insert(totalkeshi record);

    int insertSelective(totalkeshi record);

    List<totalkeshi> selectByid(String studentaccountid);
}