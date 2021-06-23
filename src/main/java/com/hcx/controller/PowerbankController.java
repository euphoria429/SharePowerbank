package com.hcx.controller;

import com.hcx.service.PowerbankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/23  14:25
 */

@Controller
@RequestMapping("/powerbank")
public class PowerbankController {
    @Resource
    private PowerbankService powerbankService;

    @RequestMapping("/showcount")
    public int showcount(int id){
        return powerbankService.countByCupId(id);
    }
}
