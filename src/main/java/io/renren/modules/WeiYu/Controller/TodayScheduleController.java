package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.TodayScheduleService;
import io.renren.modules.WeiYu.model.TodaySchedule;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/TodaySchedule")
public class TodayScheduleController {
    @Autowired
    private TodayScheduleService todayScheduleService;
    @ResponseBody
    @RequestMapping(value = "/selectByCidAndDate",method = RequestMethod.GET)
    @ApiOperation("教练课程")
    public List<TodaySchedule> selectByCidAndDate(TodaySchedule record){
        return todayScheduleService.selectByCidAndDate(record);
    }
}
