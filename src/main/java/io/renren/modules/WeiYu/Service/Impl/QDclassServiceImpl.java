package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.QDclassService;
import io.renren.modules.WeiYu.mapper.QDclassMapper;
import io.renren.modules.WeiYu.model.QDclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QDclassService")
public class QDclassServiceImpl implements QDclassService {
    @Autowired
    private QDclassMapper qDclassMapper;
    @Override
    public List<QDclass> select(String signinforclasstrainingid){
        return qDclassMapper.select(signinforclasstrainingid);
    }
}
