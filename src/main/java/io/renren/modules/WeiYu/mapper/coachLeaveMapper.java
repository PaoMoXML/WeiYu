package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.coachLeave;

import java.util.List;

public interface coachLeaveMapper {

    int insert(coachLeave record);

    int insertSelective(coachLeave record);

    List<coachLeave> selectByidleave(coachLeave record);

    List<coachLeave> selectByid(String trainingid);

    List<coachLeave> selectByiddate(coachLeave record);


}