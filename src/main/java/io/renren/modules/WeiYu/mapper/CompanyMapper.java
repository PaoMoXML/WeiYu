package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(String companyid);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String companyid);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}