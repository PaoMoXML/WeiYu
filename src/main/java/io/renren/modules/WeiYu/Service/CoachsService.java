package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.Coachs;

import java.util.List;

public interface CoachsService {
    int insert(Coachs record);
    int deleteByPrimaryKey(String coachid);
    int updateByPrimaryKeySelective(Coachs record);
    Coachs selectByPrimaryKey(String coachid);
    List<Coachs> selectAP(Coachs record);
    List<Coachs> selectA(String coachid);
}
