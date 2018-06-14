package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.studentWeekShiduanInfo;

import java.util.List;

public interface studentWeekShiduanInfoService {
    List<studentWeekShiduanInfo> selectall(String selectclassstudentid);
}
