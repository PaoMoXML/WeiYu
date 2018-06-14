package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.QDclassService;
import io.renren.modules.WeiYu.model.QDclass;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/QDclass")
public class QDclassController {
    @Autowired
    private QDclassService qDclassService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("具体班级")
    public List<QDclass> select(String signinforclasstrainingid){
        return qDclassService.select(signinforclasstrainingid);
    }
}
