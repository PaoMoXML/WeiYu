package io.renren.modules.WeiYu.Service;

import io.renren.modules.WeiYu.model.studentclassFinal;

import java.util.List;

public interface StudentClassFinalService {

    List<studentclassFinal> selectByid(String selectclassstudentid);

}
