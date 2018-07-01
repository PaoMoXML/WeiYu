package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.StudentAccountService;
import io.renren.modules.WeiYu.Service.allkeshiService;
import io.renren.modules.WeiYu.Service.allpointService;
import io.renren.modules.WeiYu.Service.totalkeshiService;
import io.renren.modules.WeiYu.model.StudentAccount;
import io.renren.modules.WeiYu.model.allkeshi;
import io.renren.modules.WeiYu.model.allpoint;
import io.renren.modules.WeiYu.model.totalkeshi;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "/StudentAccount")
public class StudentAccountController {
    @Autowired
    private StudentAccountService studentAccountService;
    @Autowired
    private allpointService allpointService;
    @Autowired
    private totalkeshiService totalkeshiService;
    @Autowired
    private allkeshiService allkeshiService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public  int insert(StudentAccount record){
        record.setStudentaccountmainid(UUID.randomUUID().toString());
        return studentAccountService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)

    public int deleteByPrimaryKey(String studentintegralaccountid){
        return studentAccountService.deleteByPrimaryKey(studentintegralaccountid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(StudentAccount record){
        return studentAccountService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public StudentAccount selectByPrimaryKey(String studentintegralaccountid){
        return studentAccountService.selectByPrimaryKey(studentintegralaccountid);
    }

    @ResponseBody
    @RequestMapping(value = "/selectYourAccount",method = RequestMethod.POST)
    @ApiOperation("个人资产")
    public Map<String,Object> YourAccount(String studentaccountid,String studentintegralaccountid){
        List<totalkeshi> totalkeshiList = totalkeshiService.selectByid(studentaccountid);
        List<allkeshi> allkeshiList = allkeshiService.selectByid(studentaccountid);
        List<allpoint> allpointList = allpointService.selectByid(studentintegralaccountid);
        List<StudentAccount> studentAccountList = studentAccountService.selectall(studentaccountid);
        Map<String,Object> map= new HashMap<>();
        map.put("totalkeshiList",totalkeshiList);
        map.put("allkeshiList",allkeshiList);
        map.put("allpointList",allpointList);
        map.put("studentAccountList",studentAccountList);
        return map;
    }
}


