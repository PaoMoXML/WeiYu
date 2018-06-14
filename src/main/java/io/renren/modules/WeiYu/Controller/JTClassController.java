package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.JTClassService;
import io.renren.modules.WeiYu.model.JTClass;
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
@RequestMapping(value = "/JTClass")
public class JTClassController {
    @Autowired
    private JTClassService jtClassService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("获取选课信息")
    public Map<String,Object>selectByOther(JTClass record){
        Map<String,Object>map = new HashMap<>();
        List<JTClass>jtClassList = jtClassService.selectByOther(record);
        map.put("jtClassList",jtClassList);
        map.put("size",jtClassList.size());
        return map;
    }
}
