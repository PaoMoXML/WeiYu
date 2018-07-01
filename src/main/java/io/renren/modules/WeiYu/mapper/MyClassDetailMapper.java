package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.MyClassDetail;

import java.util.List;


public interface MyClassDetailMapper {
    int insert(MyClassDetail record);

    int insertSelective(MyClassDetail record);

    List<MyClassDetail>selectallByCidANDDate(MyClassDetail record);

    List<MyClassDetail>selectallByCidANDDate1(MyClassDetail record);

    List<MyClassDetail>selectallByCidANDDateM(MyClassDetail record);
}