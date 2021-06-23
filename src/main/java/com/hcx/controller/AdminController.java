package com.hcx.controller;

import com.alibaba.fastjson.JSONObject;
import com.hcx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/6/20  17:52
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    public  String login(){
        return "adminmain";
    }
}
