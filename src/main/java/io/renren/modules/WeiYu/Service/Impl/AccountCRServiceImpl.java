package io.renren.modules.WeiYu.Service.Impl;

import io.renren.modules.WeiYu.Service.AccountCRService;
import io.renren.modules.WeiYu.mapper.AccountcrMapper;
import io.renren.modules.WeiYu.model.Accountcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AccountCRService")
public class AccountCRServiceImpl implements AccountCRService {
    @Autowired
    private AccountcrMapper accountcrMapper;
    @Override
    public Accountcr selectByid(String studentintegralaccountid){
        return accountcrMapper.selectByid(studentintegralaccountid);
    }
}
