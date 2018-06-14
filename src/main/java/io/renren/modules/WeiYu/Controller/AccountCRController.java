package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.AccountCRService;
import io.renren.modules.WeiYu.model.Accountcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/AccountCR")
public class AccountCRController {
    @Autowired
    private AccountCRService accountCRService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Accountcr selectByid(String studentintegralaccountid){
        return accountCRService.selectByid(studentintegralaccountid);
    }
}
