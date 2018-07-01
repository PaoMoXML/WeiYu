package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Classes;
import io.renren.modules.WeiYu.model.Classname;

import java.util.List;

public interface ClassesService {
    int insert(Classes record);
    int deleteByPrimaryKey(String classid);
    int updateByPrimaryKey(Classes record);
    Classes selectByPrimaryKey(String classid);
    Classname selectname(String classid);
    List<Classes> selectallByCid (String classcoachid);
}
