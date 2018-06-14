package io.renren.modules.WeiYu.mapper;

import io.renren.modules.WeiYu.model.SignInForClass;


public interface SignInForClassMapper {
    int deleteByPrimaryKey(String signinforclassid);

    int insert(SignInForClass record);

    int insertSelective(SignInForClass record);

    SignInForClass selectByPrimaryKey(String signinforclassid);

    int updateByPrimaryKeySelective(SignInForClass record);

    int updateByPrimaryKey(SignInForClass record);

    int updateByid(SignInForClass record);

    int updateByTrainingid (SignInForClass record);
}