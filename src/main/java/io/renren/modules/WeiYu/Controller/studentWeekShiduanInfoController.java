package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.studentWeekShiduanInfoService;
import io.renren.modules.WeiYu.model.studentWeekShiduanInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/studentWeekShiduanInfo")
public class studentWeekShiduanInfoController {
    @Autowired
    private studentWeekShiduanInfoService studentWeekShiduanInfoService;
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("学生时段信息")
    public List<studentWeekShiduanInfo> selectall(String selectclassstudentid){
        return studentWeekShiduanInfoService.selectall(selectclassstudentid);
    }
}
