package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentClassFinalService;
import io.renren.modules.WeiYu.model.studentclassFinal;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/StudentCF")
public class StudentClassFinalController {
    @Autowired
    private StudentClassFinalService studentClassFinalService;
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("所选班级信息")
    public List<studentclassFinal> selectByid(String selectclassstudentid){
        return studentClassFinalService.selectByid(selectclassstudentid);
    }
}
