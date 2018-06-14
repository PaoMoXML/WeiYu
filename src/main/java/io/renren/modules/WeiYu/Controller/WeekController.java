package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.WeekService;
import io.renren.modules.WeiYu.model.Week;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Week")
public class WeekController {
    @Autowired
    private WeekService weekService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Week record){
        return weekService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String weekid){
        return weekService.deleteByPrimaryKey(weekid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(Week record){
        return weekService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Week selectByPrimaryKey(String weekid){
        return weekService.selectByPrimaryKey(weekid);
    }

}
