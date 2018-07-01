package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.ClassesService;
import io.renren.modules.WeiYu.model.Classes;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Classes")
public class ClassesController  {
    @Autowired
    private ClassesService classesService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Classes record){
        return classesService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String classid){
        return classesService.deleteByPrimaryKey(classid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(Classes record){
        return classesService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Classes selectByPrimaryKey(String classid){
        return classesService.selectByPrimaryKey(classid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectallByCid",method = RequestMethod.GET)
    @ApiOperation("教练的课")
    public List<Classes> selectallByCid (String classcoachid){
        return classesService.selectallByCid(classcoachid);
    }
}



