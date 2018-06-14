package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Administrator;

public interface AdministratorService {
    int insert(Administrator record);
    int deleteByPrimaryKey(String administratorid);
    int updateByPrimaryKey(Administrator record);
    Administrator selectByPrimaryKey(String administratorid);
}
