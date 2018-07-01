package io.renren.modules.WeiYu.Controller;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import io.renren.modules.WeiYu.Service.CoachNameService;
import io.renren.modules.WeiYu.Service.CoachsService;
import io.renren.modules.WeiYu.SmsConfigurer;
import io.renren.modules.WeiYu.model.CoachName;
import io.renren.modules.WeiYu.model.Coachs;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping(value = "/Coachs")
public class CoachsController {
    @Autowired
    private CoachsService coachsService;
    @Autowired
    private CoachNameService coachNameService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("教练注册信息插入")
    public  Object insertCoachs(Coachs record){
        return coachsService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public  int deleteByPrimaryKey(String coachid){
        return coachsService.deleteByPrimaryKey(coachid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation("修改教练信息")
    public int updateByPrimaryKeySelective(Coachs record){
        return coachsService.updateByPrimaryKeySelective(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Coachs selectByPrimaryKey(String coachid){
        return coachsService.selectByPrimaryKey(coachid);
    }
    @ResponseBody
    @RequestMapping(value = "/selectAP",method = RequestMethod.GET)
    @ApiOperation("教练登录")
    public Object selectAP(Coachs record){
        return coachsService.selectAP(record).size();
    }
    @ResponseBody
    @RequestMapping(value = "/selectA",method = RequestMethod.GET)
    @ApiOperation("能否注册")
    public int selectA(String coachid){
        return coachsService.selectA(coachid).size();
    }
    @ResponseBody
    @RequestMapping(value = "/selectCoachName",method = RequestMethod.GET)
    @ApiOperation("教练名字")
    public List<CoachName> selectByall(String coachid){
        return coachNameService.selectByall(coachid);
    }
    @ResponseBody
    @RequestMapping(value = "/sendSms",method = RequestMethod.GET)
    @ApiOperation("注册短信")
    public Map<String,Object> sendSms(String phone){
        Map<String,Object> map=new HashMap<>();
        SmsSingleSenderResult smsSingleSenderResult=null;
        int verifycode=new Random().nextInt(9000)+1000;
        SmsSingleSender ssender = new SmsSingleSender(SmsConfigurer.appid, SmsConfigurer.appkey);
        try {
            smsSingleSenderResult = ssender.send(0, "86", phone,
                    SmsConfigurer.smsSign+"您的验证码为："+verifycode+"，请输入完成验证。如非本人操作，请忽略本短信。","","");
            map.put("status", smsSingleSenderResult.result);
            map.put("msg", smsSingleSenderResult.errMsg);
            map.put("verifycode", verifycode);
            return map;
        } catch (HTTPException e) {
            map.put("status", 9999);
            map.put("msg", "系统异常");
            return  map;
        } catch (IOException e) {
            map.put("status", 9999);
            map.put("msg", "系统异常");
            return  map;
        }
    }
}


