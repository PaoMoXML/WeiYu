package io.renren.modules.WeiYu.Controller;


import io.renren.modules.WeiYu.Service.QDdetailService;
import io.renren.modules.WeiYu.model.QDdetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/QDdetail")
public class QDdetailController {
    @Autowired
    private QDdetailService qDdetailService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("签到细节")
    public List<QDdetail> select(String signinforclassid){
        return qDdetailService.select(signinforclassid);
    }
}
