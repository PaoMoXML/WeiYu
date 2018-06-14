package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.BadmintonSites;
import io.renren.modules.WeiYu.model.BadmintonSitesKey;

public interface BadmintonSitesService {
    int insert(BadmintonSites record);
    int deleteByPrimaryKey(BadmintonSitesKey key);
    int updateByPrimaryKey(BadmintonSites record);
    BadmintonSites selectByPrimaryKey(BadmintonSitesKey key);
}
