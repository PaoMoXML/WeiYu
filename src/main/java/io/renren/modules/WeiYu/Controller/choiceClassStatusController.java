package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.choiceClassStatusService;
import io.renren.modules.WeiYu.model.choiceClassStatus;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/choiceClassStatus")
public class choiceClassStatusController {
    @Autowired
    private choiceClassStatusService choiceClassStatusService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("学生选课信息状态")
    public List<choiceClassStatus> select(String selectclassstudentid){
        return choiceClassStatusService.select(selectclassstudentid);
    }

}
