package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.TrainingService;
import io.renren.modules.WeiYu.model.Training;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/Training")
public class TrainingController {
    @Autowired
    private TrainingService trainingService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("训练课信息插入")
    public int insert(Training record){
        record.setTrainingid(UUID.randomUUID().toString());
       return trainingService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation("更新")
    public int updateByPrimaryKeySelective(Training record){
        return trainingService.updateByPrimaryKeySelective(record);
    }
    @ResponseBody
    @RequestMapping(value = "/selectByid",method = RequestMethod.GET)
    @ApiOperation("请假信息")
    public List<Training> selectByid(String CoachId){
        return trainingService.selectByid(CoachId);
    }
    @ResponseBody
    @RequestMapping(value = "/selectByiddate",method = RequestMethod.GET)
    @ApiOperation("已选课程")
    public List<Training> selectByiddate(Training record){
        return trainingService.selectByiddate(record);
    }


    
}
