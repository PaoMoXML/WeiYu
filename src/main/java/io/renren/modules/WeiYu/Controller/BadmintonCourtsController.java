package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.BadmintonCourtsService;
import io.renren.modules.WeiYu.model.BadmintonCourts;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/BadmintonCourts")
public class BadmintonCourtsController {
    @Autowired
    private BadmintonCourtsService badmintonCourtsService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("添加场馆")
    public Object insert(BadmintonCourts record){
        record.setBadmintoncourtid(UUID.randomUUID().toString());
        return badmintonCourtsService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String badmintoncourtid){
        return badmintonCourtsService.deleteByPrimaryKey(badmintoncourtid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(BadmintonCourts record){
        return badmintonCourtsService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public  BadmintonCourts selectByPrimaryKey(String badmintoncourtid){
        return badmintonCourtsService.selectByPrimaryKey(badmintoncourtid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("场馆")
    public List<BadmintonCourts> selectallCourt(){
        return badmintonCourtsService.selectallCourt();
    }

}


