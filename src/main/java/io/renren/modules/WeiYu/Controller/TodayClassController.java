package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.TodayClassService;
import io.renren.modules.WeiYu.model.TodayClass;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/TodayClass")
public class TodayClassController {
    @Autowired
    private TodayClassService todayClassService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("今日课程")
    public List<TodayClass> select(TodayClass record){
        return todayClassService.select(record);
    }
}
