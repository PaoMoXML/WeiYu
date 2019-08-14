package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentsService;
import io.renren.modules.WeiYu.model.Students;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Students record){
            return studentsService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String studentid){
        return studentsService.deleteByPrimaryKey(studentid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation("修改个人信息")
    public int updateByPrimaryKeySelective(Students record){
        return studentsService.updateByPrimaryKeySelective(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method =)
    @ApiOperation("首次登录")
    public  Students selectByPrimaryKey(String studentid){
     Students student = studentsService.selectByPrimaryKey(studentid);
       if (student == null){
           Students stu = new Students();
           stu.setStudentid(studentid);
           studentsService.insertid(studentid);
           return stu;
       }
       else{
           return student;
       }
    }
    /*@ResponseBody
    @RequestMapping(value = "/update1",method = RequestMethod.GET)
    @ApiOperation("测试")
    public List<Students> updateByPrimaryKey1(Students record){
        return studentsService.updateByPrimaryKey1(record);
    }*/
}


