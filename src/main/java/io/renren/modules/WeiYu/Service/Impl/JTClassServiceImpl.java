package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.JTClassService;
import io.renren.modules.WeiYu.mapper.JTClassMapper;
import io.renren.modules.WeiYu.model.JTClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("JTClassService")
public class JTClassServiceImpl implements JTClassService {
    @Autowired
    private JTClassMapper jtClassMapper;
    @Override
    public List<JTClass> selectByOther(JTClass record){
        return jtClassMapper.selectByOther(record);
    }
}
