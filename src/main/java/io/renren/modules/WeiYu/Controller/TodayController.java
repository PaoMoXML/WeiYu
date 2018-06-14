package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.TodayService;
import io.renren.modules.WeiYu.model.Today;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Today")
public class TodayController {
    @Autowired
    private TodayService todayService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("教练 今日课程")
    public List<Today> selectall(Today record){
        return todayService.selectall(record);
    }
}
