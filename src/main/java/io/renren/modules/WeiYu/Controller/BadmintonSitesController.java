package io.renren.modules.WeiYu.Controller;

import io.renren.modules.WeiYu.Service.BadmintonSitesService;
import io.renren.modules.WeiYu.model.BadmintonSites;
import io.renren.modules.WeiYu.model.BadmintonSitesKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "BadmintonSites")
public class BadmintonSitesController {
    @Autowired
    private BadmintonSitesService badmintonSitesService;
    @ResponseBody
    @RequestMapping(value = "insert",method = RequestMethod.GET)
       public int insert(BadmintonSites record){
        return badmintonSitesService.insert(record);
    }
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
   public  int deleteByPrimaryKey(BadmintonSitesKey key){
        return badmintonSitesService.deleteByPrimaryKey(key);
    }
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public int updateByPrimaryKey(BadmintonSites record) {
        return badmintonSitesService.updateByPrimaryKey(record);
    }
    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public BadmintonSites selectByPrimaryKey(BadmintonSitesKey key){
        return badmintonSitesService.selectByPrimaryKey(key);
    }

}



