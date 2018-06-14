package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.ClassesService;
import io.renren.modules.WeiYu.Service.TrainingService;
import io.renren.modules.WeiYu.Service.coachLeaveService;
import io.renren.modules.WeiYu.model.Classname;
import io.renren.modules.WeiYu.model.Training;
import io.renren.modules.WeiYu.model.coachLeave;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/CoachLeave")
public class CoachLeaveController {
    @Autowired
    private TrainingService trainingService;
    @Autowired
    private ClassesService classesService;
    @Autowired
    private coachLeaveService coachLeaveService;

    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Map<String,Object> select(Training record){
        List<Training> trainingList = trainingService.selectByidleave(record);
        List<Classname> classesList=new ArrayList<>();
        for (int i = 0; i <trainingList.size() ; i++) {
            Training training=trainingList.get(i);
            Classname selectname = classesService.selectname(training.getTrainingclassid());
            if(selectname!=null){
                classesList.add(selectname);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("traininglist",trainingList);
        map.put("classlist",classesList);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("教练状态")
    public List<coachLeave> selectByidleave(coachLeave record){
        return coachLeaveService.selectByidleave(record);
    }
    @ResponseBody
    @RequestMapping(value = "/selectByid",method = RequestMethod.GET)
    @ApiOperation("教练课")
    public List<coachLeave> selectByid(String trainingid){
        return coachLeaveService.selectByid(trainingid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectByiddate",method = RequestMethod.GET)
    @ApiOperation("教练空")
    public List<coachLeave> selectByiddate(coachLeave record){
        return coachLeaveService.selectByiddate(record);
    }

}
