package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.MyClassDetail;

import java.util.List;

public interface MyClassDetailService {
    List<MyClassDetail> selectallByCidANDDate(MyClassDetail record);

    List<MyClassDetail>selectallByCidANDDate1(MyClassDetail record);

    List<MyClassDetail>selectallByCidANDDateM(MyClassDetail record);
}
