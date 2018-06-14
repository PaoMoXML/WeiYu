package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentIntegralAccountService;
import io.renren.modules.WeiYu.model.StudentIntegralAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/StudentIntegralAccount")
public class StudentIntegralAccountController {
    @Autowired
    private StudentIntegralAccountService studentIntegralAccountService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(StudentIntegralAccount record){
        return studentIntegralAccountService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String studentintegralaccountid){
        return studentIntegralAccountService.deleteByPrimaryKey(studentintegralaccountid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(StudentIntegralAccount record){
        return studentIntegralAccountService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public StudentIntegralAccount selectByPrimaryKey(String studentintegralaccountid){
        return studentIntegralAccountService.selectByPrimaryKey(studentintegralaccountid);
    }
}


