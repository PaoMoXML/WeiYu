package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.Commodity;

import java.util.List;

public interface CommodityService {
    int insert(Commodity record);

    List<Commodity> selectall();
}
