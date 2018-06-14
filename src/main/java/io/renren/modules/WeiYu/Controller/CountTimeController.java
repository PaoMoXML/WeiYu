package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.BadmintonCourtsService;
import io.renren.modules.WeiYu.Service.TeachingTimeService;
import io.renren.modules.WeiYu.model.BadmintonCourts;
import io.renren.modules.WeiYu.model.TeachingTime;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/CountTime")
public class CountTimeController {
    @Autowired
     private BadmintonCourtsService badmintonCourtsService;
    @Autowired
     private TeachingTimeService teachingTimeService;

    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("时间和场馆")
    public Map<String,Object> CountTime(){
        List<TeachingTime> timeList = teachingTimeService.selectalltime();
        List<BadmintonCourts> badmintonCourtsList = badmintonCourtsService.selectallCourt();
        Map<String,Object> map = new HashMap<>();
        map.put("timekey",timeList);
        map.put("courtkey",badmintonCourtsList);
        return map;
    }
}