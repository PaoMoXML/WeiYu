package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.CompanyService;
import io.renren.modules.WeiYu.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public int insert(Company record){
        return companyService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Company selectByPrimaryKey(String companyid){
        return companyService.selectByPrimaryKey(companyid);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String companyid){
        return companyService.deleteByPrimaryKey(companyid);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(Company record){
        return companyService.updateByPrimaryKey(record);
    }
}
