package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.coachDayNumberService;
import io.renren.modules.WeiYu.model.coachDayNumber;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/coachDayNumber")
public class coachDayNumberController {
    @Autowired
    private coachDayNumberService coachDayNumberService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("教练有多少课")
    public List<coachDayNumber> selectallByDateAndCid(coachDayNumber record){
        return coachDayNumberService.selectallByDateAndCid(record);
    }
}
