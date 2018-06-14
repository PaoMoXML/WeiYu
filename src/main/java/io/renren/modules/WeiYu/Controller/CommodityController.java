package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CommodityService;
import io.renren.modules.WeiYu.model.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Commodity record){
        return commodityService.insert(record);
    }
}
