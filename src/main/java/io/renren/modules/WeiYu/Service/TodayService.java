package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.Today;

import java.util.List;

public interface TodayService {
    List<Today> selectall(Today record);
}
