package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.TeachingTimeService;
import io.renren.modules.WeiYu.model.TeachingTime;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/TeachingTime")
public class TeachingTimeController {
    @Autowired
    private TeachingTimeService teachingTimeService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(TeachingTime record){
        return teachingTimeService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String teachingtimeid){
        return teachingTimeService.deleteByPrimaryKey(teachingtimeid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(TeachingTime record){
        return teachingTimeService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public TeachingTime selectByPrimaryKey(String teachingtimeid){
        return teachingTimeService.selectByPrimaryKey(teachingtimeid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectalltime",method = RequestMethod.GET)
    @ApiOperation("获取时段1")
    public List<TeachingTime> selectalltime(){
        return teachingTimeService.selectalltime();
    }
    @ResponseBody
    @RequestMapping(value = "/selectwd",method = RequestMethod.POST)
    @ApiOperation("获取时段2")
    public List<TeachingTime> selectBywd(TeachingTime record){
        return teachingTimeService.selectBywd(record);
    }
}


