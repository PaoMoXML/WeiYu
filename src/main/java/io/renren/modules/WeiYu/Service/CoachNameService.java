package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.CoachName;

import java.util.List;

public interface CoachNameService {
    List<CoachName> selectByall(String coachid);
}
