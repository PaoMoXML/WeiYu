package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.SelectClass;

import java.util.List;

public interface SelectClassService {
    int insertSelective(SelectClass record);
    int deleteByPrimaryKey(String selectclassid);
    int updateByPrimaryKey(SelectClass record);
    SelectClass selectByPrimaryKey(String selectclassid);
    List<SelectClass>selectByOther(SelectClass record);
}
