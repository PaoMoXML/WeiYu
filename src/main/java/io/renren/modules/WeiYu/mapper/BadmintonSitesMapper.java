package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.BadmintonSites;
import io.renren.modules.WeiYu.model.BadmintonSitesKey;

public interface BadmintonSitesMapper {
    int deleteByPrimaryKey(BadmintonSitesKey key);

    int insert(BadmintonSites record);

    int insertSelective(BadmintonSites record);

    BadmintonSites selectByPrimaryKey(BadmintonSitesKey key);

    int updateByPrimaryKeySelective(BadmintonSites record);

    int updateByPrimaryKey(BadmintonSites record);
}