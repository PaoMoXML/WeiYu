package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.MyClassDetailService;
import io.renren.modules.WeiYu.mapper.MyClassDetailMapper;
import io.renren.modules.WeiYu.model.MyClassDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("MyClassDetailService")
public class MyClassDetailServiceImpl implements MyClassDetailService {
    @Autowired
    private MyClassDetailMapper myClassDetailMapper;
    @Override
    public List<MyClassDetail> selectallByCidANDDate(MyClassDetail record){
        return myClassDetailMapper.selectallByCidANDDate(record);
    }
    @Override
    public List<MyClassDetail>selectallByCidANDDate1(MyClassDetail record){
        return myClassDetailMapper.selectallByCidANDDate1(record);
    }
    @Override
    public List<MyClassDetail>selectallByCidANDDateM(MyClassDetail record){
        return myClassDetailMapper.selectallByCidANDDateM(record);
    }
}
