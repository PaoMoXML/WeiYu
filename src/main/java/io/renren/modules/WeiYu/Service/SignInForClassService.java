package io.renren.modules.WeiYu.Service;


import io.renren.modules.WeiYu.model.SignInForClass;


public interface SignInForClassService {
    int insert(SignInForClass record);
    int deleteByPrimaryKey(String signinforclassid);
    int updateByPrimaryKeySelective(SignInForClass record);
    SignInForClass selectByPrimaryKey(String signinforclassid);
    int updateByid(SignInForClass record);
    int updateByTrainingid (SignInForClass record);
}
