package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.studentWeekShiduanInfoService;
import io.renren.modules.WeiYu.mapper.studentWeekShiduanInfoMapper;
import io.renren.modules.WeiYu.model.studentWeekShiduanInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentWeekShiduanInfoService")
public class studentWeekShiduanInfoServiceImpl implements studentWeekShiduanInfoService {
    @Autowired
    private studentWeekShiduanInfoMapper studentWeekShiduanInfoMapper;
    @Override
    public  List<studentWeekShiduanInfo> selectall(String selectclassstudentid){
        return studentWeekShiduanInfoMapper.selectall(selectclassstudentid);
    }
}
