package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentUpdateService;
import io.renren.modules.WeiYu.model.StudentUpdate;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/StudentUpdate")
public class StudentUpdateController {
    @Autowired
    private StudentUpdateService studentUpdateService;
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    @ApiOperation("测试")
    public int updateBystudentid(StudentUpdate record){
        return studentUpdateService.updateBystudentid(record);
    }
}
