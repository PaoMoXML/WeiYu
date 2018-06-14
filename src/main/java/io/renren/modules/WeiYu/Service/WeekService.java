package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Week;

public interface WeekService {
    int insert(Week record);
    int deleteByPrimaryKey(String weekid);
    int updateByPrimaryKey(Week record);
    Week selectByPrimaryKey(String weekid);
}
