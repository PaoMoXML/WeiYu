package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.BadmintonCourts;

import java.util.List;

public interface BadmintonCourtsService {
    int insert(BadmintonCourts record);
    int deleteByPrimaryKey(String badmintoncourtid);
    int updateByPrimaryKey(BadmintonCourts record);
    BadmintonCourts selectByPrimaryKey(String badmintoncourtid);
    List<BadmintonCourts> selectallCourt();
}
