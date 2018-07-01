package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CommodityService;
import io.renren.modules.WeiYu.Service.allpointService;
import io.renren.modules.WeiYu.Service.commentFinalService;
import io.renren.modules.WeiYu.model.Commodity;
import io.renren.modules.WeiYu.model.allpoint;
import io.renren.modules.WeiYu.model.commentFinal;
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
@RequestMapping(value = "/commentFinal")
public class commentFinalController {
    @Autowired
    private commentFinalService commentFinalService;
    @Autowired
    private allpointService allpointService;
    @Autowired
    private CommodityService commodityService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("学生评价")
    public Map<String,Object> Comment(commentFinal record,String studentintegralaccountid){
        List<commentFinal> commentFinalList = commentFinalService.select(record);
        List<allpoint> allpointList = allpointService.selectByid(studentintegralaccountid);
        List<Commodity> commodityList = commodityService.selectall();
        Map<String,Object> map= new HashMap<>();
        map.put("commentFinalList",commentFinalList);
        map.put("allpointList",allpointList);
        map.put("commodityList",commodityList);
        return map;
    }
}
