package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.MyClassDetailService;
import io.renren.modules.WeiYu.model.MyClassDetail;
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
@RequestMapping(value = "/MyClassDetail")
public class MyClassDetailControlle {
    @Autowired
    private MyClassDetailService myClassDetailService;
    @ResponseBody
    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    @ApiOperation("班级签到人数")
    public Map<String,Object> selectallByCidANDDate(MyClassDetail record){
        List<MyClassDetail> myClassDetailList = myClassDetailService.selectallByCidANDDate(record);
        int size  = myClassDetailService.selectallByCidANDDate(record).size();
        Map<String,Object> map = new HashMap<>();
        map.put("myClassDetailList",myClassDetailList);
        map.put("Size",size);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/selectclassToday",method = RequestMethod.GET)
    @ApiOperation("当日已上课的班级")
    public List<MyClassDetail>selectallByCidANDDate1(MyClassDetail record){
        return myClassDetailService.selectallByCidANDDate1(record);
    }
    @ResponseBody
    @RequestMapping(value = "/selectclassMonth",method = RequestMethod.GET)
    @ApiOperation("当月已上课的班级")
    public List<MyClassDetail>selectallByCidANDDateM(MyClassDetail record){
        return myClassDetailService.selectallByCidANDDateM(record);
    }
}
