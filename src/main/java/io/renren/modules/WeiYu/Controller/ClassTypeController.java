package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.ClassTypeService;
import io.renren.modules.WeiYu.model.ClassType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/ClassType")
public class ClassTypeController {
    @Autowired
    private ClassTypeService classTypeService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public Object insert(ClassType record){
        return classTypeService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String classtypeid){
        return classTypeService.deleteByPrimaryKey(classtypeid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(ClassType record){
        return classTypeService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public ClassType selectByPrimaryKey(String classtypeid){
        return classTypeService.selectByPrimaryKey(classtypeid);
    }

}



