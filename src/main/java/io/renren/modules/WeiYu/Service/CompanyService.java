package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Company;

public interface CompanyService {
    int insert(Company record);
    int deleteByPrimaryKey(String companyid);
    Company selectByPrimaryKey(String companyid);
    int updateByPrimaryKey(Company record);
}
