package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Administrator;

public interface AdministratorMapper {
    int deleteByPrimaryKey(String administratorid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(String administratorid);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}