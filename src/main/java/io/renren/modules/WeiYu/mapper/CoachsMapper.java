package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.Coachs;

import java.util.List;

public interface CoachsMapper {
    int deleteByPrimaryKey(String coachid);

    int insert(Coachs record);

    int insertSelective(Coachs record);

    Coachs selectByPrimaryKey(String coachid);

    int updateByPrimaryKeySelective(Coachs record);

    int updateByPrimaryKey(Coachs record);

    List<Coachs> selectAP(Coachs record);

    List<Coachs> selectA(String coachid);
}