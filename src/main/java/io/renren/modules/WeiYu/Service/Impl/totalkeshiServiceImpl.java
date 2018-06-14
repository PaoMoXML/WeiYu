package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.totalkeshiService;
import io.renren.modules.WeiYu.mapper.totalkeshiMapper;
import io.renren.modules.WeiYu.model.totalkeshi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("totalkeshiService")
public class totalkeshiServiceImpl implements totalkeshiService {
    @Autowired
    private totalkeshiMapper totalkeshiMapper;
    @Override
    public List<totalkeshi> selectByid(String studentaccountid){
        return totalkeshiMapper.selectByid(studentaccountid);
    }
}
