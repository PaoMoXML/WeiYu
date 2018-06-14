package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.AdministratorService;
import io.renren.modules.WeiYu.model.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller

@RequestMapping(value = "/Administrator")

public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Administrator record){
        record.setAdministratorid(UUID.randomUUID().toString());
       return administratorService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String administratorid){
        return administratorService.deleteByPrimaryKey(administratorid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(Administrator record){
        return administratorService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public  Administrator selectByPrimaryKey(String administratorid){
        return administratorService.selectByPrimaryKey(administratorid);
    }

}


