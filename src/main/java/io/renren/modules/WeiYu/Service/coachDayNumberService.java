package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.coachDayNumber;

import java.util.List;

public interface coachDayNumberService {
    List<coachDayNumber> selectallByDateAndCid(coachDayNumber record);
}
