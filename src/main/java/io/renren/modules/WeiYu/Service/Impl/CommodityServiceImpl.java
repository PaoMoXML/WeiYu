package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.CommodityService;
import io.renren.modules.WeiYu.mapper.CommodityMapper;
import io.renren.modules.WeiYu.model.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommodityService")
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public int insert(Commodity record){
        return commodityMapper.insert(record);
    }
    @Override
    public List<Commodity> selectall(){
        return commodityMapper.selectall();
    }
}
