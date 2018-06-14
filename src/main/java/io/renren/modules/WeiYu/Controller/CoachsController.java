package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CoachNameService;
import io.renren.modules.WeiYu.Service.CoachsService;
import io.renren.modules.WeiYu.model.CoachName;
import io.renren.modules.WeiYu.model.Coachs;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/Coachs")
public class CoachsController {
    @Autowired
    private CoachsService coachsService;
    @Autowired
    private CoachNameService coachNameService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("教练注册信息插入")
    public  Object insertCoachs(Coachs record){
        return coachsService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public  int deleteByPrimaryKey(String coachid){
        return coachsService.deleteByPrimaryKey(coachid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation("修改教练信息")
    public int updateByPrimaryKeySelective(Coachs record){
        return coachsService.updateByPrimaryKeySelective(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Coachs selectByPrimaryKey(String coachid){
        return coachsService.selectByPrimaryKey(coachid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectAP",method = RequestMethod.GET)
    @ApiOperation("教练登录")
    public Object selectAP(Coachs record){
        return coachsService.selectAP(record).size();
    }
    @ResponseBody
    @RequestMapping(value = "/selectA",method = RequestMethod.GET)
    @ApiOperation("能否注册")
    public int selectA(String coachid){
        return coachsService.selectA(coachid).size();
    }
    @ResponseBody
    @RequestMapping(value = "/selectCoachName",method = RequestMethod.GET)
    @ApiOperation("教练名字")
    public List<CoachName> selectByall(String coachid){
        return coachNameService.selectByall(coachid);
    }
}


