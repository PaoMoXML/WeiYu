package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.allkeshiService;
import io.renren.modules.WeiYu.mapper.allkeshiMapper;
import io.renren.modules.WeiYu.model.allkeshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("allkeshiService")
public class allkeshiServiceImpl implements allkeshiService {
    @Autowired
    private allkeshiMapper allkeshiMapper;
    @Override
    public List<allkeshi> selectByid(String studentaccountid){
        return allkeshiMapper.selectByid(studentaccountid);
    }
}
