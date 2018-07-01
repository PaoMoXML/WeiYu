package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CoachWorkIntervalService;
import io.renren.modules.WeiYu.model.CoachWorkInterval;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping(value = "/CoachWorkInterval")
public class CoachWorkIntervalController {
    @Autowired
    private CoachWorkIntervalService coachWorkIntervalService;
    @ResponseBody
    @RequestMapping(value ="/insert",method = RequestMethod.GET )
    @ApiOperation("教练工作时间")
    public int insert(CoachWorkInterval record){
        record.setCoachmainid(UUID.randomUUID().toString());
        return coachWorkIntervalService.insert(record);
    }
}
