package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.BadmintonSitesService;
import io.renren.modules.WeiYu.mapper.BadmintonSitesMapper;
import io.renren.modules.WeiYu.model.BadmintonSites;
import io.renren.modules.WeiYu.model.BadmintonSitesKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BadmintonSitesService")
public class BadmintonSitesServiceImpl implements BadmintonSitesService {
    @Autowired
    private BadmintonSitesMapper badmintonSitesMapper;
    @Override
    public int insert(BadmintonSites record){
        return badmintonSitesMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(BadmintonSitesKey key){
        return badmintonSitesMapper.deleteByPrimaryKey(key);
    }
    @Override
    public int updateByPrimaryKey(BadmintonSites record){
        return badmintonSitesMapper.updateByPrimaryKey(record);
    }
    @Override
    public BadmintonSites selectByPrimaryKey(BadmintonSitesKey key){
        return badmintonSitesMapper.selectByPrimaryKey(key);
    }
}


