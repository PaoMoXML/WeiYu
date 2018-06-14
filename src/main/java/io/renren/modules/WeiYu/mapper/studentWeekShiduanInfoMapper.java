package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.studentWeekShiduanInfo;

import java.util.List;

public interface studentWeekShiduanInfoMapper {
    int insert(studentWeekShiduanInfo record);

    int insertSelective(studentWeekShiduanInfo record);

    List<studentWeekShiduanInfo> selectall(String selectclassstudentid);
}