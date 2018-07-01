package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.TeachingTime;

import java.util.List;

public interface TeachingTimeService {
    int insert(TeachingTime record);
    int deleteByPrimaryKey(String teachingtimeid);
    int updateByPrimaryKey(TeachingTime record);
    TeachingTime selectByPrimaryKey(String teachingtimeid);
    List<TeachingTime> selectalltime();
    List<TeachingTime> selectBywd(TeachingTime record);

}
