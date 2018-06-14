package io.renren.modules.WeiYu.Service.Impl;


import io.renren.modules.WeiYu.Service.SignInForClassService;
import io.renren.modules.WeiYu.mapper.SignInForClassMapper;
import io.renren.modules.WeiYu.model.SignInForClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SignInForClassService")
public class SignInForClassServiceImpl implements SignInForClassService {
    @Autowired
    private SignInForClassMapper signInForClassMapper;
    @Override
    public int insert(SignInForClass record){
        return signInForClassMapper.insert(record);
    }
    @Override
    public int deleteByPrimaryKey(String signinforclassid){
        return signInForClassMapper.deleteByPrimaryKey(signinforclassid);
    }
    @Override
    public  int updateByPrimaryKeySelective(SignInForClass record){
        return signInForClassMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public SignInForClass selectByPrimaryKey(String signinforclassid){
        return signInForClassMapper.selectByPrimaryKey(signinforclassid);
    }
    @Override
    public int updateByid(SignInForClass record){
        return signInForClassMapper.updateByid(record);
    }
    @Override
    public int updateByTrainingid (SignInForClass record){
        return signInForClassMapper.updateByTrainingid(record);
    }
}


