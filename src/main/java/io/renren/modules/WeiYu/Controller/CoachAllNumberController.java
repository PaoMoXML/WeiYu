package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CoachAllNumberService;
import io.renren.modules.WeiYu.model.CoachAllNumber;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/CoachAllNumber")
public class CoachAllNumberController {
    @Autowired
    private CoachAllNumberService coachAllNumberService;
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("所有礼物")
    public List<CoachAllNumber> selectallByCid(String signinforclasscoachid){
        return coachAllNumberService.selectallByCid(signinforclasscoachid);
    }
}
