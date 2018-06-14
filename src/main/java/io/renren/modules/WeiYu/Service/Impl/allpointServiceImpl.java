package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.allpointService;
import io.renren.modules.WeiYu.mapper.allpointMapper;
import io.renren.modules.WeiYu.model.allpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("allpointService")
public class allpointServiceImpl implements allpointService {
    @Autowired
    private allpointMapper allpointMapper;
    @Override
    public List<allpoint> selectByid(String studentintegralaccountid){
        return allpointMapper.selectByid(studentintegralaccountid);
    }
}
