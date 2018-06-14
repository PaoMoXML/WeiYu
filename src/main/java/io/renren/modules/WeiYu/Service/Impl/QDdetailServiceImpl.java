package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.QDdetailService;
import io.renren.modules.WeiYu.mapper.QDdetailMapper;
import io.renren.modules.WeiYu.model.QDdetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QDdetailService")
public class QDdetailServiceImpl implements QDdetailService {
    @Autowired
    private QDdetailMapper qDdetailMapper;
    @Override
    public List<QDdetail> select(String signinforclassid){
        return qDdetailMapper.select(signinforclassid);
    }
}
