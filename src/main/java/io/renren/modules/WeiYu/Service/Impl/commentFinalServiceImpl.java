package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.commentFinalService;
import io.renren.modules.WeiYu.mapper.commentFinalMapper;
import io.renren.modules.WeiYu.model.commentFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentFinalService")
public class commentFinalServiceImpl implements commentFinalService {
    @Autowired
    private commentFinalMapper commentFinalMapper;
    @Override
    public  List<commentFinal> select(commentFinal record){
        return commentFinalMapper.select(record);
    }
}
