package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.SelectClassService;
import io.renren.modules.WeiYu.model.JTClass;
import io.renren.modules.WeiYu.model.SelectClass;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping(value = "/SelectClass")
public class SelectClassController {


    @Autowired
    private SelectClassService selectClassService;

    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    @ApiOperation("选课")
    public int insertSelective(SelectClass record){
        List<SelectClass>selectClassList = selectClassService.selectByOther(record);
        if (selectClassList.size()>=1){
            return 2;
        }
        else{
            record.setSelectclassid(UUID.randomUUID().toString());
           return selectClassService.insertSelective(record);
        }

    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String selectclassid){
        return selectClassService.deleteByPrimaryKey(selectclassid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(SelectClass record){
        return selectClassService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public SelectClass selectByPrimaryKey(String selectclassid){
        return selectClassService.selectByPrimaryKey(selectclassid);
    }
    @ResponseBody
    @RequestMapping(value = "/updateByid",method = RequestMethod.GET)
    @ApiOperation("挂起")
    public int updateByid(SelectClass record){
        return selectClassService.updateByid(record);
    }

}

