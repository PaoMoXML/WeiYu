package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.coachLeave;

import java.util.List;

public interface coachLeaveService {
    List<coachLeave> selectByidleave(coachLeave record);

    List<coachLeave> selectByid(String trainingid);

    List<coachLeave> selectByiddate(coachLeave record);
}
