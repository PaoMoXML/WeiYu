package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.CompanyService;
import io.renren.modules.WeiYu.mapper.CompanyMapper;
import io.renren.modules.WeiYu.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CompanyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public int insert(Company record){
        return companyMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String companyid){
        return companyMapper.deleteByPrimaryKey(companyid);
    }
    @Override
    public Company selectByPrimaryKey(String companyid){
        return companyMapper.selectByPrimaryKey(companyid);
    }
    @Override
    public int updateByPrimaryKey(Company record){
        return companyMapper.updateByPrimaryKey(record);
    }
}
