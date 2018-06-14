package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Accountcr;

public interface AccountcrMapper {
    int insert(Accountcr record);

    int insertSelective(Accountcr record);

    Accountcr selectByid(String studentintegralaccountid);
}