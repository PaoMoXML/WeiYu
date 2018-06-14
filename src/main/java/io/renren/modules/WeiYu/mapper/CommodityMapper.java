package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(String commodityid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(String commodityid);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}