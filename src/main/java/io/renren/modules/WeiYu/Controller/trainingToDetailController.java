package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.trainingToDetailService;
import io.renren.modules.WeiYu.model.trainingToDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/trainingToDetail")
public class trainingToDetailController {
    @Autowired
    private trainingToDetailService trainingToDetailService;
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ApiOperation("所有信息")
    public List<trainingToDetail> selectByid(String trainingid){
        return trainingToDetailService.selectByid(trainingid);
    }
}
