package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentLeaveService;
import io.renren.modules.WeiYu.model.StudentLeave;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/StudentLeave")
public class StudentLeaveController {
    @Autowired
    private StudentLeaveService studentLeaveService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("插入")
    public int insert(StudentLeave record){
        record.setStudentleaveid(UUID.randomUUID().toString());
        return studentLeaveService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("查询")
    public List<StudentLeave> select(String studentleavestudentid){
        return studentLeaveService.select(studentleavestudentid);
    }
}
