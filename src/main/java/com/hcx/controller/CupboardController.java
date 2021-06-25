package com.hcx.controller;

import com.hcx.bean.Cupboard;
import com.hcx.service.CupboardService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/23  15:49
 */
@Controller
@RequestMapping("/cupboard")
public class CupboardController {
    @Resource
    private CupboardService cupboardService;

    @RequestMapping(value="findInfo",produces="text/html;charset=utf-8")
    public @ResponseBody String findAll(){
        List<Cupboard> cupboard =cupboardService.selectAll(null);
        JSONArray json= JSONArray.fromObject(cupboard);
        String js=json.toString();
        String jso="{\"code\":0,\"msg\":\"\",\"count\":"+3+",\"data\":"+js+"}";
        return jso;
    }
}
