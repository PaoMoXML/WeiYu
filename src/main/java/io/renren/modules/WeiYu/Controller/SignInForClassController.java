package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.SignInForClassService;
import io.renren.modules.WeiYu.Service.StudentIntegralAccountService;
import io.renren.modules.WeiYu.model.SignInForClass;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/SignInForClass")
public class SignInForClassController {
    @Autowired
    private SignInForClassService signInForClassService;
    @Autowired
    private StudentIntegralAccountService studentIntegralAccountService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(SignInForClass record){
        return signInForClassService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String signinforclassid){
        return signInForClassService.deleteByPrimaryKey(signinforclassid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation("主键更新")
    public int updateByPrimaryKeySelective(SignInForClass record){
        return signInForClassService.updateByPrimaryKeySelective(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public  SignInForClass selectByPrimaryKey(String signinforclassid){
        return signInForClassService.selectByPrimaryKey(signinforclassid);
    }
    @ResponseBody
    @RequestMapping(value = "/updateByid",method = RequestMethod.POST)
    @ApiOperation("签到更新 学生")
    public int updateByid(SignInForClass record){
        return signInForClassService.updateByid(record);
    }
    @ResponseBody
    @RequestMapping(value = "/updateByTrainingid",method = RequestMethod.POST)
    @ApiOperation("签到更新 教练")
    public int updateByTrainingid (SignInForClass record){
        return signInForClassService.updateByTrainingid(record);
    }

}


